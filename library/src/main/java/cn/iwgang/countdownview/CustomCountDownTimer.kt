package cn.iwgang.countdownview

import android.os.Handler
import android.os.Message
import android.os.SystemClock
import cn.iwgang.countdownview.CustomCountDownTimer

/**
 * 使用android.os.CountDownTimer的源码
 * 1. 对回调onTick做了细小调整，已解决最后1秒不会倒计时到0，要等待2秒才回调onFinish
 * 2. 添加了一些自定义方法
 */
abstract class CustomCountDownTimer(millisInFuture: Long, countDownInterval: Long) {
    private val mMillisInFuture: Long
    private var mCountdownInterval: Long = 0
    private var mStopTimeInFuture: Long = 0
    private var mPauseTimeInFuture: Long = 0
    private var isStop = false
    private var isPause = false

    @Synchronized
    private fun start(millisInFuture: Long): CustomCountDownTimer {
        isStop = false
        if (millisInFuture <= 0) {
            onFinish()
            return this
        }
        mStopTimeInFuture = SystemClock.elapsedRealtime() + millisInFuture
        mHandler.sendMessage(mHandler.obtainMessage(MSG))
        return this
    }

    /**
     * 开始倒计时
     */
    @Synchronized
    fun start() {
        start(mMillisInFuture)
    }

    /**
     * 停止倒计时
     */
    @Synchronized
    fun stop() {
        isStop = true
        mHandler.removeMessages(MSG)
    }

    /**
     * 暂时倒计时
     * 调用[.restart]方法重新开始
     */
    @Synchronized
    fun pause() {
        if (isStop) return
        isPause = true
        mPauseTimeInFuture = mStopTimeInFuture - SystemClock.elapsedRealtime()
        mHandler.removeMessages(MSG)
    }

    /**
     * 重新开始
     */
    @Synchronized
    fun restart() {
        if (isStop || !isPause) return
        isPause = false
        start(mPauseTimeInFuture)
    }

    /**
     * 倒计时间隔回调
     * @param millisUntilFinished 剩余毫秒数
     */
    abstract fun onTick(millisUntilFinished: Long)

    /**
     * 倒计时结束回调
     */
    abstract fun onFinish()
    private val mHandler: Handler = object : Handler() {
        override fun handleMessage(msg: Message) {
            synchronized(this@CustomCountDownTimer) {
                if (isStop || isPause) {
                    return
                }
                val millisLeft = mStopTimeInFuture - SystemClock.elapsedRealtime()
                if (millisLeft <= 0) {
                    onFinish()
                } else {
                    val lastTickStart = SystemClock.elapsedRealtime()
                    onTick(millisLeft)

                    // take into account user's onTick taking time to execute
                    var delay = lastTickStart + mCountdownInterval - SystemClock.elapsedRealtime()

                    // special case: user's onTick took more than interval to
                    // complete, skip to next interval
                    while (delay < 0) delay += mCountdownInterval
                    sendMessageDelayed(obtainMessage(MSG), delay)
                }
            }
        }
    }

    companion object {
        private const val MSG = 1
    }

    /**
     * @param millisInFuture    总倒计时时间
     * @param countDownInterval 倒计时间隔时间
     */
    init {
        // 解决秒数有时会一开始就减去了2秒问题（如10秒总数的，刚开始就8999，然后没有不会显示9秒，直接到8秒）
        var millisInFuture = millisInFuture
        if (countDownInterval > 1000) millisInFuture += 15
        mMillisInFuture = millisInFuture
        mCountdownInterval = countDownInterval
    }
}
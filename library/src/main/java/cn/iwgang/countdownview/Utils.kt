package cn.iwgang.countdownview

import android.content.Context

/**
 * @author will
 */
internal object Utils {
    @JvmStatic
    fun dp2px(context: Context, dpValue: Float): Int {
        if (dpValue <= 0) return 0
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    @JvmStatic
    fun sp2px(context: Context, spValue: Float): Float {
        if (spValue <= 0) return 0F
        val scale = context.resources.displayMetrics.scaledDensity
        return spValue * scale
    }

    @JvmStatic
    fun formatNum(time: Int): String {
        return if (time < 10) "0$time" else time.toString()
    }

    @JvmStatic
    fun formatMillisecond(millisecond: Int): String {
        return when {
            millisecond > 99 -> {
                (millisecond / 10).toString()
            }
            millisecond <= 9 -> {
                "$millisecond"
            }
            else -> {
                millisecond.toString()
            }
        }
    }
}
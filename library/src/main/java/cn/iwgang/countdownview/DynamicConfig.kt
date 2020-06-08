package cn.iwgang.countdownview

/**
 * @author will
 */
class DynamicConfig private constructor(private val mBuilder: Builder) {
    val timeTextSize: Float?
        get() = mBuilder.timeTextSize

    val timeTextColor: Int?
        get() = mBuilder.timeTextColor

    val isTimeTextBold: Boolean?
        get() = mBuilder.isTimeTextBold

    val suffixTextSize: Float?
        get() = mBuilder.suffixTextSize

    val suffixTextColor: Int?
        get() = mBuilder.suffixTextColor

    val isSuffixTimeTextBold: Boolean?
        get() = mBuilder.isSuffixTextBold

    val suffix: String?
        get() = mBuilder.suffix

    val suffixDay: String?
        get() = mBuilder.suffixDay

    val suffixHour: String?
        get() = mBuilder.suffixHour

    val suffixMinute: String?
        get() = mBuilder.suffixMinute

    val suffixSecond: String?
        get() = mBuilder.suffixSecond

    val suffixMillisecond: String?
        get() = mBuilder.suffixMillisecond

    val suffixGravity: Int?
        get() = mBuilder.suffixGravity

    val suffixLRMargin: Float?
        get() = mBuilder.suffixLRMargin

    val suffixDayLeftMargin: Float?
        get() = mBuilder.suffixDayLeftMargin

    val suffixDayRightMargin: Float?
        get() = mBuilder.suffixDayRightMargin

    val suffixHourLeftMargin: Float?
        get() = mBuilder.suffixHourLeftMargin

    val suffixHourRightMargin: Float?
        get() = mBuilder.suffixHourRightMargin

    val suffixMinuteLeftMargin: Float?
        get() = mBuilder.suffixMinuteLeftMargin

    val suffixMinuteRightMargin: Float?
        get() = mBuilder.suffixMinuteRightMargin

    val suffixSecondLeftMargin: Float?
        get() = mBuilder.suffixSecondLeftMargin

    val suffixSecondRightMargin: Float?
        get() = mBuilder.suffixSecondRightMargin

    val suffixMillisecondLeftMargin: Float?
        get() = mBuilder.suffixMillisecondLeftMargin

    val isConvertDaysToHours: Boolean
        get() = mBuilder.isConvertDaysToHours

    val isShowDay: Boolean?
        get() = mBuilder.isShowDay

    val isShowHour: Boolean?
        get() = mBuilder.isShowHour

    val isShowMinute: Boolean?
        get() = mBuilder.isShowMinute

    val isShowSecond: Boolean?
        get() = mBuilder.isShowSecond

    val isShowMillisecond: Boolean?
        get() = mBuilder.isShowMillisecond

    val backgroundInfo: BackgroundInfo?
        get() = mBuilder.backgroundInfo

    class Builder {
        internal var timeTextSize: Float? = null
        internal var timeTextColor: Int? = null
        internal var isTimeTextBold: Boolean? = null
        internal var suffixTextSize: Float? = null
        internal var suffixTextColor: Int? = null
        internal var suffixGravity: Int? = null
        internal var isSuffixTextBold: Boolean? = null
        internal var isShowDay: Boolean? = null
        internal var isShowHour: Boolean? = null
        internal var isShowMinute: Boolean? = null
        internal var isShowSecond: Boolean? = null
        internal var isShowMillisecond: Boolean? = null
        internal var isConvertDaysToHours = false
        internal var backgroundInfo: BackgroundInfo? = null
        internal var suffix: String? = null
        internal var suffixDay: String? = null
        internal var suffixHour: String? = null
        internal var suffixMinute: String? = null
        internal var suffixSecond: String? = null
        internal var suffixMillisecond: String? = null
        internal var suffixLRMargin: Float? = null
        internal var suffixDayLeftMargin: Float? = null
        internal var suffixDayRightMargin: Float? = null
        internal var suffixSecondLeftMargin: Float? = null
        internal var suffixSecondRightMargin: Float? = null
        internal var suffixHourLeftMargin: Float? = null
        internal var suffixHourRightMargin: Float? = null
        internal var suffixMinuteLeftMargin: Float? = null
        internal var suffixMinuteRightMargin: Float? = null
        internal var suffixMillisecondLeftMargin: Float? = null

        /**
         * Set time text size
         * @param size text size（Unit sp）
         */
        fun setTimeTextSize(size: Float): Builder {
            timeTextSize = size
            return this
        }

        /**
         * Set time text color
         * @param color text color
         */
        fun setTimeTextColor(color: Int): Builder {
            timeTextColor = color
            return this
        }

        /**
         * Set time text bold
         * @param isBold true bold, false cancel bold
         */
        fun setTimeTextBold(isBold: Boolean): Builder {
            isTimeTextBold = isBold
            return this
        }

        /**
         * Set suffix text size
         * @param size text size（Unit sp）
         */
        fun setSuffixTextSize(size: Float): Builder {
            suffixTextSize = size
            return this
        }

        /**
         * Set suffix text color
         * @param color text color
         */
        fun setSuffixTextColor(color: Int): Builder {
            suffixTextColor = color
            return this
        }

        /**
         * Set suffix text bold
         * @param isBold true bold, false cancel bold
         */
        fun setSuffixTextBold(isBold: Boolean): Builder {
            isSuffixTextBold = isBold
            return this
        }

        /**
         * Set suffix (All)
         * @param suffix suffix text
         */
        fun setSuffix(suffix: String?): Builder {
            this.suffix = suffix
            return this
        }

        /**
         * Set day suffix
         * @param suffix suffix text
         */
        fun setSuffixDay(suffix: String?): Builder {
            suffixDay = suffix
            return this
        }

        /**
         * Set hour suffix
         * @param suffix suffix text
         */
        fun setSuffixHour(suffix: String?): Builder {
            suffixHour = suffix
            return this
        }

        /**
         * Set minute suffix
         * @param suffix suffix text
         */
        fun setSuffixMinute(suffix: String?): Builder {
            suffixMinute = suffix
            return this
        }

        /**
         * Set second suffix
         * @param suffix suffix text
         */
        fun setSuffixSecond(suffix: String?): Builder {
            suffixSecond = suffix
            return this
        }

        /**
         * Set millisecond suffix
         * @param suffix suffix text
         */
        fun setSuffixMillisecond(suffix: String?): Builder {
            suffixMillisecond = suffix
            return this
        }

        /**
         * Set suffix margin (All)
         * @param margin margin（Unit dp）
         */
        fun setSuffixLRMargin(margin: Float): Builder {
            suffixLRMargin = margin
            return this
        }

        fun setSuffixDayLeftMargin(margin: Float): Builder {
            suffixDayLeftMargin = margin
            return this
        }

        fun setSuffixDayRightMargin(margin: Float): Builder {
            suffixDayRightMargin = margin
            return this
        }

        fun setSuffixHourLeftMargin(margin: Float): Builder {
            suffixHourLeftMargin = margin
            return this
        }

        fun setSuffixHourRightMargin(margin: Float): Builder {
            suffixHourRightMargin = margin
            return this
        }

        fun setSuffixMinuteLeftMargin(margin: Float): Builder {
            suffixMinuteLeftMargin = margin
            return this
        }

        fun setSuffixMinuteRightMargin(margin: Float): Builder {
            suffixMinuteRightMargin = margin
            return this
        }

        fun setSuffixSecondLeftMargin(margin: Float): Builder {
            suffixSecondLeftMargin = margin
            return this
        }

        fun setSuffixSecondRightMargin(margin: Float): Builder {
            suffixSecondRightMargin = margin
            return this
        }

        fun setSuffixMillisecondLeftMargin(margin: Float): Builder {
            suffixMillisecondLeftMargin = margin
            return this
        }

        /**
         * Set suffix gravity
         * @param suffixGravity See [SuffixGravity]
         */
        fun setSuffixGravity(suffixGravity: Int): Builder {
            this.suffixGravity = suffixGravity
            return this
        }

        /**
         * Set convert days to hours
         * @param isConvertDaysToHours true convert, false no convert
         */
        fun setConvertDaysToHours(isConvertDaysToHours: Boolean): Builder {
            this.isConvertDaysToHours = isConvertDaysToHours
            return this
        }

        /**
         * Set day show or hide
         * @param isShowDay true show, false hide
         */
        fun setShowDay(isShowDay: Boolean?): Builder {
            this.isShowDay = isShowDay
            return this
        }

        /**
         * Set hour show or hide
         * @param isShowHour true show, false hide
         */
        fun setShowHour(isShowHour: Boolean?): Builder {
            this.isShowHour = isShowHour
            return this
        }

        /**
         * Set minute show or hide
         * @param isShowMinute true show, false hide
         */
        fun setShowMinute(isShowMinute: Boolean?): Builder {
            this.isShowMinute = isShowMinute
            return this
        }

        /**
         * Set second show or hide
         * @param isShowSecond true show, false hide
         */
        fun setShowSecond(isShowSecond: Boolean?): Builder {
            this.isShowSecond = isShowSecond
            return this
        }

        /**
         * Set millisecond show or hide
         * @param isShowMillisecond true show, false hide
         */
        fun setShowMillisecond(isShowMillisecond: Boolean?): Builder {
            this.isShowMillisecond = isShowMillisecond
            return this
        }

        /**
         * Set background info
         * @param backgroundInfo BackgroundInfo
         */
        fun setBackgroundInfo(backgroundInfo: BackgroundInfo?): Builder {
            this.backgroundInfo = backgroundInfo
            return this
        }

        private fun checkData() {
            if (null != timeTextSize && timeTextSize!! <= 0) timeTextSize = null
            if (null != suffixTextSize && suffixTextSize!! <= 0) suffixTextSize = null
            if (null != backgroundInfo && !backgroundInfo!!.hasData) {
                backgroundInfo = null
            }
            if (null != backgroundInfo) {
                val isShowTimeBgDivisionLine = backgroundInfo!!.isShowTimeBgDivisionLine
                if (null == isShowTimeBgDivisionLine || !isShowTimeBgDivisionLine) {
                    backgroundInfo!!.setDivisionLineColor(null)
                    backgroundInfo!!.setDivisionLineSize(null)
                }
                val isShowTimeBgBorder = backgroundInfo!!.isShowTimeBgBorder
                if (null == isShowTimeBgBorder || !isShowTimeBgBorder) {
                    backgroundInfo!!.setBorderColor(null)
                    backgroundInfo!!.setBorderRadius(null)
                    backgroundInfo!!.setBorderSize(null)
                }
                if (null != backgroundInfo!!.size && backgroundInfo!!.size!! <= 0) {
                    backgroundInfo!!.setSize(null)
                }
            }
            if (null != suffixGravity && (suffixGravity!! < 0 || suffixGravity!! > 2)) suffixGravity = null
        }

        fun build(): DynamicConfig {
            checkData()
            return DynamicConfig(this)
        }
    }

    class BackgroundInfo {
        var hasData = false
        var color: Int? = null
            private set
        var size: Float? = null
            private set
        var radius: Float? = null
            private set
        var isShowTimeBgDivisionLine: Boolean? = null
            private set
        var divisionLineColor: Int? = null
            private set
        var divisionLineSize: Float? = null
            private set
        var isShowTimeBgBorder: Boolean? = null
            private set
        var borderColor: Int? = null
            private set
        var borderRadius: Float? = null
            private set
        var borderSize: Float? = null
            private set

        fun setColor(color: Int?): BackgroundInfo {
            hasData = true
            this.color = color
            return this
        }

        fun setSize(size: Float?): BackgroundInfo {
            hasData = true
            this.size = size
            return this
        }

        fun setRadius(radius: Float?): BackgroundInfo {
            hasData = true
            this.radius = radius
            return this
        }

        fun setShowTimeBgDivisionLine(showTimeBgDivisionLine: Boolean?): BackgroundInfo {
            hasData = true
            isShowTimeBgDivisionLine = showTimeBgDivisionLine
            return this
        }

        fun setDivisionLineSize(divisionLineSize: Float?): BackgroundInfo {
            hasData = true
            this.divisionLineSize = divisionLineSize
            return this
        }

        fun setDivisionLineColor(divisionLineColor: Int?): BackgroundInfo {
            hasData = true
            this.divisionLineColor = divisionLineColor
            return this
        }

        fun setShowTimeBgBorder(showTimeBgBorder: Boolean?): BackgroundInfo {
            hasData = true
            isShowTimeBgBorder = showTimeBgBorder
            return this
        }

        fun setBorderSize(borderSize: Float?): BackgroundInfo {
            hasData = true
            this.borderSize = borderSize
            return this
        }

        fun setBorderColor(borderColor: Int?): BackgroundInfo {
            hasData = true
            this.borderColor = borderColor
            return this
        }

        fun setBorderRadius(borderRadius: Float?): BackgroundInfo {
            hasData = true
            this.borderRadius = borderRadius
            return this
        }

    }

    object SuffixGravity {
        const val TOP = 0
        const val CENTER = 1
        const val BOTTOM = 2
    }

}
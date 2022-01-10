package com.vinsol.onboarding

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.content.res.AppCompatResources

/**
This represents a Custom view of a button with curved edges from all four ends of 24dp.
Attributes defined in this view are (defined in attrs.xml):
1. title -> name of the CTA.
2. backgroundTheme -> themes for the button transparent and blue.
3. iconLeft -> icon on the left of the CTA.
4. iconRight -> icon on the right of the CTA.
 */
@RequiresApi(Build.VERSION_CODES.M)
class CustomCircularEdgesButton(context: Context, attrs: AttributeSet?) :
    FrameLayout(context, attrs) {
    init {
        val styledAttribute =
            context.obtainStyledAttributes(attrs, R.styleable.CustomCircularEdgesButton, 0, 0)

        val titleText: String
        val backgroundTheme: BackgroundTheme
        val leftIcon: Drawable?
        val rightIcon: Drawable?

        try {
            titleText = styledAttribute.getString(R.styleable.CustomCircularEdgesButton_title) ?: ""
            backgroundTheme = BackgroundTheme.values()[styledAttribute.getInt(
                R.styleable.CustomCircularEdgesButton_backgroundTheme, 0
            )]
            leftIcon = styledAttribute.getDrawable(R.styleable.CustomCircularEdgesButton_icon_left)
            rightIcon =
                styledAttribute.getDrawable(R.styleable.CustomCircularEdgesButton_icon_right)

        } finally {
            styledAttribute.recycle()
        }

        val view =
            LayoutInflater.from(context).inflate(R.layout.custom_circular_edges_button, this, true)

        val tvTitle = view.findViewById<TextView>(R.id.tv_title)
        val ivLeftIcon = view.findViewById<ImageView>(R.id.iv_icon_left)
        val ivRightIcon = view.findViewById<ImageView>(R.id.iv_icon_right)

        tvTitle.text = titleText

        when (backgroundTheme) {
            BackgroundTheme.TRANSPARENT -> {
                tvTitle.setTextColor(context.getColor(R.color.blue_2c43dd))
                background =
                    AppCompatResources.getDrawable(context, R.drawable.background_theme_transparent)
            }

            BackgroundTheme.BLUE -> {
                tvTitle.setTextColor(Color.WHITE)
                background =
                    AppCompatResources.getDrawable(context, R.drawable.background_theme_blue)
            }
        }

        rightIcon?.let {
            ivRightIcon.setImageDrawable(it)
            ivRightIcon.visibility = View.VISIBLE
        }

        leftIcon?.let {
            ivLeftIcon.setImageDrawable(it)
            ivLeftIcon.visibility = View.VISIBLE
        }
    }
}

enum class BackgroundTheme { TRANSPARENT, BLUE }
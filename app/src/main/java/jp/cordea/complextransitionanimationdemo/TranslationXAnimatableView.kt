package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View

class TranslationXStartToEndAnimatableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr),
    Animatable.TranslationX.StartToEnd,
    Animatable.Alpha.Foreground {
    override fun updateTranslationX(translationX: Float) {
        setTranslationX(measuredWidth / translationX)
    }

    override fun updateAlpha(alpha: Float) {
        setAlpha(alpha)
    }
}

class TranslationXEndToStartAnimatableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr),
    Animatable.TranslationX.EndToStart,
    Animatable.Alpha.Foreground {
    override fun updateTranslationX(translationX: Float) {
        setTranslationX(-(measuredWidth / translationX))
    }

    override fun updateAlpha(alpha: Float) {
        setAlpha(alpha)
    }
}

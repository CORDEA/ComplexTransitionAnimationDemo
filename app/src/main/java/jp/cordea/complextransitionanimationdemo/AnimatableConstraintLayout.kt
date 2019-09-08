package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class AnimatableConstraintLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private var startToEndViews = mutableListOf<Animatable.TranslationX.StartToEnd>()
    private var endToStartViews = mutableListOf<Animatable.TranslationX.EndToStart>()
    private var alphaViews = mutableListOf<Animatable.Alpha.View>()
    private var foregroundAlphaViews = mutableListOf<Animatable.Alpha.Foreground>()
    private var scaleViews = mutableListOf<Animatable.Scale>()

    override fun onViewAdded(view: View?) {
        super.onViewAdded(view)
        if (view is Animatable.TranslationX.StartToEnd) {
            startToEndViews.add(view)
        }
        if (view is Animatable.TranslationX.EndToStart) {
            endToStartViews.add(view)
        }
        if (view is Animatable.Alpha.View) {
            alphaViews.add(view)
        }
        if (view is Animatable.Alpha.Foreground) {
            foregroundAlphaViews.add(view)
        }
        if (view is Animatable.Scale) {
            scaleViews.add(view)
        }
    }

    override fun onViewRemoved(view: View?) {
        super.onViewRemoved(view)
        if (view is Animatable.TranslationX.StartToEnd) {
            startToEndViews.remove(view)
        }
        if (view is Animatable.TranslationX.EndToStart) {
            endToStartViews.remove(view)
        }
        if (view is Animatable.Alpha.View) {
            alphaViews.remove(view)
        }
        if (view is Animatable.Alpha.Foreground) {
            foregroundAlphaViews.remove(view)
        }
        if (view is Animatable.Scale) {
            scaleViews.remove(view)
        }
    }

    fun setViewForegroundAlpha(alpha: Float) {
        foregroundAlphaViews.forEach { it.updateAlpha(alpha) }
    }

    fun setViewAlpha(alpha: Float) {
        alphaViews.forEach { it.updateAlpha(alpha) }
    }

    fun setViewStartToEnd(translationX: Float) {
        startToEndViews.forEach { it.updateTranslationX(translationX) }
    }

    fun setViewEndToStart(translationX: Float) {
        endToStartViews.forEach { it.updateTranslationX(translationX) }
    }

    fun setViewScale(scale: Float) {
        scaleViews.forEach { it.updateScale(scale) }
    }
}

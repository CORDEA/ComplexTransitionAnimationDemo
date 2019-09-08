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
    private var alphaViews = mutableListOf<Animatable.Alpha.Enter>()
    private var scaleViews = mutableListOf<Animatable.Scale>()

    override fun onViewAdded(view: View?) {
        super.onViewAdded(view)
        when (view) {
            is Animatable.TranslationX.StartToEnd -> startToEndViews.add(view)
            is Animatable.TranslationX.EndToStart -> endToStartViews.add(view)
            is Animatable.Alpha.Enter -> alphaViews.add(view)
            is Animatable.Scale -> scaleViews.add(view)
        }
    }

    override fun onViewRemoved(view: View?) {
        super.onViewRemoved(view)
        when (view) {
            is Animatable.TranslationX.StartToEnd -> startToEndViews.remove(view)
            is Animatable.TranslationX.EndToStart -> endToStartViews.remove(view)
            is Animatable.Alpha.Enter -> alphaViews.remove(view)
            is Animatable.Scale -> scaleViews.remove(view)
        }
    }

    fun setViewAlpha(alpha: Float) {
        alphaViews.forEach { it.update(alpha) }
    }

    fun setViewStartToEnd(translationX: Float) {
        startToEndViews.forEach { it.update(translationX) }
    }

    fun setViewEndToStart(translationX: Float) {
        endToStartViews.forEach { it.update(translationX) }
    }

    fun setViewScale(scale: Float) {
        scaleViews.forEach { it.update(scale) }
    }
}

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
    private var startToEndViews = mutableListOf<TranslationX.StartToEnd>()
    private var endToStartViews = mutableListOf<TranslationX.EndToStart>()
    private var alphaViews = mutableListOf<Alpha>()

    override fun onViewAdded(view: View?) {
        super.onViewAdded(view)
        when (view) {
            is TranslationX.StartToEnd -> startToEndViews.add(view)
            is TranslationX.EndToStart -> endToStartViews.add(view)
            is Alpha -> alphaViews.add(view)
        }
    }

    override fun onViewRemoved(view: View?) {
        super.onViewRemoved(view)
        when (view) {
            is TranslationX.StartToEnd -> startToEndViews.remove(view)
            is TranslationX.EndToStart -> endToStartViews.remove(view)
            is Alpha -> alphaViews.remove(view)
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

    interface TranslationX {
        interface StartToEnd {
            fun update(translationX: Float)
        }

        interface EndToStart {
            fun update(translationX: Float)
        }
    }

    interface Alpha {
        fun update(alpha: Float)
    }
}

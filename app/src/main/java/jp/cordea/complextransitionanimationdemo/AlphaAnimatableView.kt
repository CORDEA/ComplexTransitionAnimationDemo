package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView

class AlphaAnimatableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), AnimatableConstraintLayout.Alpha {
    override fun update(alpha: Float) {
        setAlpha(alpha)
    }
}

class AlphaAnimatableTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr), AnimatableConstraintLayout.Alpha {
    override fun update(alpha: Float) {
        setAlpha(alpha)
    }
}

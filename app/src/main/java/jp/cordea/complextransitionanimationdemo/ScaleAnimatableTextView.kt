package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class ScaleAnimatableTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr), Animatable.Scale {
    override fun update(scale: Float) {
        scaleX = scale
        scaleY = scale
    }
}

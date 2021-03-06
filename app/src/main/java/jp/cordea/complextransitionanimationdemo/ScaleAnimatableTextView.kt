package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class ScaleAnimatableTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr),
    Animatable.Scale,
    Animatable.Alpha.View {
    override fun updateScale(scale: Float) {
        scaleX = scale
        scaleY = scale
    }

    override fun updateAlpha(alpha: Float) {
        setAlpha(alpha)
    }
}

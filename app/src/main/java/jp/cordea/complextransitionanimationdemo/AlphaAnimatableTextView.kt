package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class AlphaAnimatableTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr),
    Animatable.Alpha.View,
    Animatable.Alpha.Foreground {
    override fun updateAlpha(alpha: Float) {
        setAlpha(alpha)
    }
}

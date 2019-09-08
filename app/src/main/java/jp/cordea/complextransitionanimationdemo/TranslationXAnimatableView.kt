package jp.cordea.complextransitionanimationdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View

class TranslationXStartToEndAnimatableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), AnimatableConstraintLayout.TranslationX.StartToEnd

class TranslationXEndToStartAnimatableView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), AnimatableConstraintLayout.TranslationX.EndToStart

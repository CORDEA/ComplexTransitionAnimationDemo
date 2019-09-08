package jp.cordea.complextransitionanimationdemo

interface Animatable {
    interface TranslationX {
        interface StartToEnd {
            fun updateTranslationX(translationX: Float)
        }

        interface EndToStart {
            fun updateTranslationX(translationX: Float)
        }
    }

    interface Alpha {
        interface View {
            fun updateAlpha(alpha: Float)
        }

        interface Foreground {
            fun updateAlpha(alpha: Float)
        }
    }

    interface Scale {
        fun updateScale(scale: Float)
    }
}

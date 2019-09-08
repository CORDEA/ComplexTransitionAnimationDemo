package jp.cordea.complextransitionanimationdemo

interface Animatable {
    interface TranslationX {
        interface StartToEnd {
            fun update(translationX: Float)
        }

        interface EndToStart {
            fun update(translationX: Float)
        }
    }

    interface Alpha {
        interface Enter {
            fun update(alpha: Float)
        }

        interface Exit {
            fun update(alpha: Float)
        }
    }

    interface Scale {
        fun update(scale: Float)
    }
}

package jp.cordea.complextransitionanimationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isMain: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, MainFragment.newInstance())
            .commit()

        fab.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.container,
                    if (isMain) {
                        SubFragment.newInstance()
                    } else {
                        MainFragment.newInstance()
                    }
                )
                .commit()
            isMain = !isMain
        }
    }
}

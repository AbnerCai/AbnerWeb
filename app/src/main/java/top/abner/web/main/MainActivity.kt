package top.abner.web.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.abner.webview.WebViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WebViewActivity.launch(this, "https://www.baidu.com/")
    }
}

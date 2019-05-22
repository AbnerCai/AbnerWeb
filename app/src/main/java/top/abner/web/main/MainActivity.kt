package top.abner.web.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.abner.webview.WebViewActivity
import top.abner.webview.X5WebViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        WebViewActivity.launch(this, "https://www.baidu.com/")
        // file:///android_asset/index.html
        WebViewActivity.launch(this, "http://abner.top/")
        finish();
    }
}

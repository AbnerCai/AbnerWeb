package top.abner.web.main

import android.content.Context
import com.didichuxing.doraemonkit.DoraemonKit
import com.didichuxing.doraemonkit.kit.webdoor.WebDoorManager
import top.abner.webview.X5App

/**
 *
 * @author Nebula
 * @version 1.0.0
 * @date 2019/5/7 16:34
 */
class BaseApplication : X5App() {

    override fun onCreate() {
        super.onCreate()
//        initDoraemonKit()
    }

    private fun initDoraemonKit() {
        DoraemonKit.install(this)

        // H5任意门功能需要，非必须
        DoraemonKit.setWebDoorCallback(object: WebDoorManager.WebDoorCallback{

            override fun overrideUrlLoading(context: Context?, url: String?) {
                // 使用自己的H5容器打开这个链接
            }
        })
    }
}
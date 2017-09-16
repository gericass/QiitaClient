package sample.qiitaclient

/**
 * Created by keita on 2017/09/16.
 */


import android.support.annotation.IdRes
import android.view.View

fun <T : View>View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}
package sample.qiitaclient.view

/**
 * Created by keita on 2017/09/16.
 */

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import sample.qiitaclient.R
import sample.qiitaclient.model.Article
import java.security.KeyStore

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context,attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    var profileImageView: ImageView? = null

    var titleTextView: TextView? = null

    var userNameTextView: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
        profileImageView = findViewById<ImageView>(R.id.profile_image_view)
        titleTextView = findViewById<TextView>(R.id.title_text_view)
        userNameTextView = findViewById<TextView>(R.id.user_name_text_view)
    }

    fun setArticle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name

        // TODO プロフィール画像をセットする
        profileImageView?.setBackgroundColor(Color.RED)
    }
}
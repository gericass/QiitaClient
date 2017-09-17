package sample.qiitaclient.view

/**
 * Created by keita on 2017/09/16.
 */

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import sample.qiitaclient.R
import sample.qiitaclient.bindView
import sample.qiitaclient.model.Article

import com.bumptech.glide.Glide

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context,attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    val profileImageView: ImageView by bindView<ImageView>(R.id.profile_image_view)

    val titleTextView: TextView by bindView<TextView>(R.id.title_text_view)

    val userNameTextView: TextView by bindView<TextView>(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView.text = article.title
        userNameTextView.text = article.user.name

        userNameTextView.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }
}
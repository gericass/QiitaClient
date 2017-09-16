package sample.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.qiitaclient.model.*

import sample.qiitaclient.view.ArticleView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val articleView = ArticleView(applicationContext)

        articleView.setArticle(Article(id = "123",
                title = "kotlin入門",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "太郎", profileImageUrl = "")))

        setContentView(articleView)
    }
}

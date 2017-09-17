package sample.qiitaclient.client

/**
 * Created by keita on 2017/09/17.
 */

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import sample.qiitaclient.model.Article

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
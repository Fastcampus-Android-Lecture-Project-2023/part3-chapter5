package fastcampus.part3.chapter5

import fastcampus.part3.chapter5.model.ImageListResponse
import fastcampus.part3.chapter5.model.VideoListResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface SearchService {

    @Headers("Authorization: KakaoAK 190cf875cb8099ba51dcdd607b062fb1")
    @GET("image")
    fun searchImage(@Query("query") query: String): Observable<ImageListResponse>

    @Headers("Authorization: KakaoAK 190cf875cb8099ba51dcdd607b062fb1")
    @GET("vclip")
    fun searchVideo(@Query("query") query: String): Observable<VideoListResponse>

}
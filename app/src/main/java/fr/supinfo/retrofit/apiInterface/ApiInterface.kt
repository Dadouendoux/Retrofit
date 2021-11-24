package fr.supinfo.retrofit.apiInterface

import fr.supinfo.retrofit.model.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("most-popular")
    fun getMostPopular(): Call<TvShowResponse>
}
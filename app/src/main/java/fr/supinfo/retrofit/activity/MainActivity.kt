package fr.supinfo.retrofit.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import fr.supinfo.retrofit.R
import fr.supinfo.retrofit.apiInterface.ApiInterface
import fr.supinfo.retrofit.client.ApiClient
import fr.supinfo.retrofit.model.TvShowResponse
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = ApiClient.getRetrofitClient()?.create(ApiInterface::class.java)

        val callRetrofit : Call<TvShowResponse>? = apiInterface?.getMostPopular()
        callRetrofit?.enqueue(object : Callback<TvShowResponse> {})
    }
}
package rio.arj.tdd_first.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import rio.arj.tdd_first.BuildConfig

object NetworkConfig {

  private val okHttpClient = OkHttpClient().newBuilder().addInterceptor(getInterceptor()).build()
  lateinit var apiService: ApiService

  init {
    makeService()
  }

  private fun getInterceptor(): Interceptor {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return loggingInterceptor
  }

  private fun makeService() {
    val retrofit: Retrofit = Retrofit.Builder()
      .client(okHttpClient)
      .baseUrl(BuildConfig.BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
    this.apiService = retrofit.create(ApiService::class.java)
  }

}
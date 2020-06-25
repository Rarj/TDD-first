package rio.arj.tdd_first.network

import retrofit2.http.GET
import rio.arj.tdd_first.repository.model.PokemonModel

interface ApiService {

  @GET("cards?setCode=base1")
  suspend fun getCards(): PokemonModel

}
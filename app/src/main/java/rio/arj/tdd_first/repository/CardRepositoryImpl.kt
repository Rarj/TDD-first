package rio.arj.tdd_first.repository

import rio.arj.tdd_first.network.ApiService
import rio.arj.tdd_first.repository.model.PokemonModel

class CardRepositoryImpl(val apiService: ApiService) : CardRepository {
  override suspend fun getCards(): PokemonModel? {
    return apiService.getCards()
  }
}
package rio.arj.tdd_first.repository

import rio.arj.tdd_first.repository.model.PokemonModel

interface CardRepository {
  suspend fun getCards() : PokemonModel?
}
package rio.arj.tdd_first.repository.model

data class PokemonModel(
  val cards: List<Card>
)

data class Card(
  val imageUrl: String
)
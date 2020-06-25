package rio.arj.tdd_first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import rio.arj.tdd_first.network.NetworkConfig
import rio.arj.tdd_first.network.NetworkConfig.apiService
import rio.arj.tdd_first.repository.CardRepository
import rio.arj.tdd_first.repository.CardRepositoryImpl
import rio.arj.tdd_first.repository.model.PokemonModel

class MainViewModel() : ViewModel() {
  val repository = CardRepositoryImpl(apiService)
  var listCard = MutableLiveData<PokemonModel>()

  fun getCards() = liveData(Dispatchers.IO) {
    emit(repository.getCards())
  }

}
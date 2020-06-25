package rio.arj.tdd_first.repository

import com.nhaarman.mockito_kotlin.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import rio.arj.tdd_first.repository.model.Card
import rio.arj.tdd_first.repository.model.PokemonModel

@RunWith(JUnit4::class)
class CardRepositoryImplTest {

  @Mock
  lateinit var repository: CardRepository

  @Before
  fun setup() {
    MockitoAnnotations.initMocks(this)
  }

  @Test
  fun getCards() = runBlocking {
    val expectedResponse = PokemonModel(listOf(Card("")))
    whenever(repository.getCards())
      .thenReturn(expectedResponse)

    Assert.assertEquals(expectedResponse, repository.getCards())
  }


}
package rio.arj.tdd_first.dummy

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProductModelTest {

  lateinit var model: ProductModel

  @Before
  fun init() {
    model = ProductModel()
  }

  @Test
  fun `product name must not blank`() {
    model.name = "Nintendo Switch Version 1"
    Assert.assertTrue(model.name.isNotBlank())
  }

  @Test
  fun `product name not allow more than 35 characters`() {
    model.name = "Nintendo Switch Version 1 Second LI"
    Assert.assertTrue(model.isProductMaxCharacters())
  }

  @Test
  fun `quantity not allow 0`() {
    Assert.assertNotEquals(0, model.isQuantityNotZero())
  }

  @Test
  fun `quantity not allow negative number`() {
    Assert.assertTrue(model.isQuantityPositiveNumber())
  }

  @Test
  fun `description must not blank`() {
    model.description = "Nintendo adalah produk ..."
    Assert.assertTrue(model.description.isNotBlank())
  }

  @Test
  fun `description maximum 30 character`() {
    model.description = "Nintendo adalah produk yang..."
    Assert.assertTrue(model.isDescriptionMaxCharacters())
  }

}
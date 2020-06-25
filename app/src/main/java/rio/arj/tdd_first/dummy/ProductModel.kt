package rio.arj.tdd_first.dummy

class ProductModel(
  var name: String = "",
  var quantity: Int = 1,
  var description: String = ""
) {

  fun isProductMaxCharacters(): Boolean {
    return name.length <= 35
  }

  fun isQuantityNotZero(): Boolean {
    return quantity != 0
  }

  fun isQuantityPositiveNumber(): Boolean {
    return quantity > 0
  }

  fun isDescriptionMaxCharacters(): Boolean {
    return description.length <= 30
  }

}
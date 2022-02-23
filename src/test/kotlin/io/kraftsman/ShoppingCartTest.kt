package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kraftsman.models.Product
import io.kraftsman.services.ShoppingCart

class ShoppingCartTest : FunSpec({

    context("一個購物車")      {
        test("當 100 塊商品加上 80 塊的商品時，總價是 180") {
            // Arrange
            val apple = Product(id = 1, name = "Apple", price = 80)
            val banana = Product(id = 2, name = "Banana", price = 100)
            val cart = ShoppingCart()

            // Act
            cart.add(apple)
            cart.add(banana)

            // Assert
            cart.totalPrice() shouldBe 180
        }

    }

})

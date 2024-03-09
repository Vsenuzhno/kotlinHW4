fun main() {
    val totalCost = 15000
    val isRegularCustomer = true

    var discount = 0.0
    if (totalCost > 10000) {
        discount = 0.05
    } else if (totalCost > 1000) {
        discount = 100.0 / totalCost
    }

    var finalCost = totalCost * (1 - discount)
    if (isRegularCustomer) {
        finalCost *= 0.99
    }

    println("Итоговая стоимость покупки: $finalCost руб.")
}

fun main() {
    println("Завдання 1")

    print("Введіть ціну товару: ")
    var price: Double = readln().toDouble()

    var expiryPeriod: Int
    var daysPassed: Int

    do{
        print("Введіть термін придатності товару (в днях): ")
        expiryPeriod = readln().toInt()

        print("Введіть кількість днів, що пройшли з дня виготовлення товару: ")
        daysPassed = readln().toInt()
    }while(expiryPeriod <= daysPassed || expiryPeriod <= 0)

    var p: Double

    do{
        print("Введіть знижку( 0 < p < 1): ")
        p = readln().toDouble()
    }while(p <= 0 || p >= 1)

    if((expiryPeriod - daysPassed) == 1){
        price *= p
    }
    else if((expiryPeriod - daysPassed) < expiryPeriod/2){
        price *= (1 - p)
    }

    println("Поточна ціна товару: $price")
}
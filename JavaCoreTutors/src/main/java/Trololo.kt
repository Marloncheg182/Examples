data class Customer(val name: String, val email: String)

fun main(args: Array<String>){
    val customer = Customer("Oleg Romanenchuk", "mymail@gmail.com")
    println(customer)
    println("Hello Customer and Welcome")
}
interface Cashier
{
    fun printReceipt()
}

class User:Cashier{
    override fun printReceipt() {
        Product().getReceipt()
    }
}

fun main(){

    val user = User()
    user.printReceipt()

}
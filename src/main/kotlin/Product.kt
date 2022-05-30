class Product {

    private var itemcount = 0
    private var useritemcount = 0
    private var baseprice = 10
    private var total = 0


    private fun getItems(): Int {

        var proceed = ""

        do {

            println("How many items do you wish to buy? - ")
            useritemcount = readLine()!!.toInt()


            println("Do you want to continue shopping?")
            proceed = readLine()!!

            itemcount += useritemcount
            getTotalPrice()

        } while (proceed == "yes" || proceed == "y" || proceed == "1")


        println("\n\t Thank You for using the app")

        return itemcount
    }

    private fun getTotalPrice(): Int {

        val subtotal: Int = baseprice * useritemcount
        println("You bought $subtotal₹ worth of items")
        total += subtotal
        return total
    }

    fun getReceipt(items: Int = getItems()): Int {

        when (items % 2 != 0) {

            true -> giveDiscount()

            else -> println(
                "\n Total Amount you need to pay - ${total/2}₹")


        }
        return items
    }

    fun giveDiscount() {

        if (itemcount == 1) {

            println("\n Total Amount you need to pay - ${total}₹")

        }
        else {
//            val finalAmount = (total)/2+5              this works on total Amount
            val finalproduct = ((itemcount/2+1))*10
            println("\n Total Amount you need to pay - ${finalproduct}₹")
        }

    }

}
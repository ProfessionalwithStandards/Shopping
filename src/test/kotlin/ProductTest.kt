import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.NumberFormatException
import kotlin.test.assertFailsWith

internal class ProductTest {


    private val product = Product()

    @Test
    fun testgetItems(){

        val expected = 0
        assertEquals(expected,product.getReceipt(0))

    }
    @Test
    fun testgetItems1(){

        val expected = 1
        assertEquals(expected,product.getReceipt(1))

    }
    @Test
    fun testgetItems2(){

        val expected = 2
        assertEquals(expected,product.getReceipt(2))

    } // Returns the final amount to be paid as 0 here but works in the program
    @Test
    fun testgetItemsx(){

        assertFailsWith<NumberFormatException>{
            product.getReceipt("x".toInt())
        }

    }

}
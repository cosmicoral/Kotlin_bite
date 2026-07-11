import kotlin.test.Test
import kotlin.test.assertEquals

class phoneCheckerTest {
    @Test
    fun returnTrueForValidPhoneNumber() {
        val checker = PhoneChecker()

        assertEquals(true, checker.isPhoneValid("07123456789"))
    }
    @Test
    fun returnFalseForInvalidPhoneNumber() {
        val checker = PhoneChecker()
        assertEquals(false, checker.isPhoneValid("Hello"))
    }
}
import kotlin.test.Test
import kotlin.test.assertEquals

class ReminderTest {

    @Test
    fun remindsLeoToWalkTheDog() {
        val reminder = Reminder("Leo")

        reminder.remindMeTo("Walk the dog")

        assertEquals("Walk the dog, Leo!", reminder.remind())
    }

    @Test
    fun remindsJuToBuyPopcorn() {
        val reminder = Reminder("Ju")

        reminder.remindMeTo("Buy popcorn")

        assertEquals("Buy popcorn, Ju!", reminder.remind())
    }
}
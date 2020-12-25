package koans

import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

internal class NullableTypesTest {

    @Test
    fun testSendMessageToClient() {
        val myMailer = mock(MyMailer::class.java)
        sendMessageToClient(null, null, myMailer)
        sendMessageToClient(Client(PersonalInfo("test@example.com")), "Hello World", myMailer)
        verify(myMailer, times(1)).sendMessage(anyString(), anyString())
    }

    open class MyMailer : Mailer {
        override fun sendMessage(email: String, message: String) {

        }
    }
}
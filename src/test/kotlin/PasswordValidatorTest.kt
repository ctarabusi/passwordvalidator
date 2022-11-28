import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class PasswordValidatorTest {

    val validator = PasswordValidator()

    @Test
    fun testMinLength() {


        val shortPassword = "abc"
        assertFalse(validator.validate(shortPassword))
    }

}
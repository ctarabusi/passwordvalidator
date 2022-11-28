import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class PasswordValidatorTest {

    @Test
    fun testMinLength() {
        val validator = PasswordValidator()

        val shortPassword = "abc"
        assertFalse(validator.validate(shortPassword))
    }
}
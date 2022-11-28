import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PasswordValidatorTest {

    val validator = PasswordValidator()

    @Test
    fun testMinLength() {
        val shortPassword = "abc"
        assertFalse(validator.validate(shortPassword))
    }

    @Test
    fun testDoesntContainsCapitalLetter() {
        val passwordWithCapital = "abcdefghijk"
        assertFalse(validator.validate(passwordWithCapital))
    }

    @Test
    fun testDoesntContainLowercaseLetter() {
        val example = "AAAAAAAAAA"
        assertFalse(validator.validate(example))
    }

}
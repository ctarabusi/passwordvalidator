import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PasswordValidatorTest {

    private val validator = PasswordValidator()

    @Test
    fun hasMinLength() {
        val shortPassword = "abc"
        assertFalse(validator.validate(shortPassword))
    }

    @Test
    fun doesNotContainCapitalLetter() {
        val passwordWithCapital = "abcdefghijk"
        assertFalse(validator.validate(passwordWithCapital))
    }

    @Test
    fun doesNotContainLowercaseLetter() {
        val example = "AAAAAAAAAA"
        assertFalse(validator.validate(example))
    }

    @Test
    fun testDoesntContainsNumber() {
        val passwordWithoutNumber = "abcdeFGhijk"
        assertFalse(validator.validate(passwordWithoutNumber))
    }

}
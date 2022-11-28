class PasswordValidator {

    fun validate(enteredPassword: String): Boolean {

        return enteredPassword.length > MIN_PASSWORD_LENGTH
    }

    companion object {
        const val MIN_PASSWORD_LENGTH = 8
    }
}
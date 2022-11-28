class PasswordValidator {

    fun validate(enteredPassword: String): Boolean {

        return enteredPassword.length > MIN_PASSWORD_LENGTH
                && enteredPassword.any { it.isUpperCase() }
    }

    companion object {
        const val MIN_PASSWORD_LENGTH = 8
    }

}
class Bank() {
    fun isAllowedTransaction(client: Client) =
        if (client.login == client.name) {
            false
        } else {
            true
        }

    //для примера, к дз никак не относится
    fun test() {
        val client = Client("Jackson", "Jackson")
        val result = isAllowedTransaction(client)
        val resultInt = result as Int
    }


}

class Client(val name: String, val login: String)

fun main() {

}
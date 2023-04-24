package database

interface DataBase {
    fun insertData()

    suspend fun request(query: String)
}
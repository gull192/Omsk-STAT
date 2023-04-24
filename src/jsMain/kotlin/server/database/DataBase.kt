package server.database

interface DataBase {
    suspend fun insertData()

    suspend fun request(query: String)
}
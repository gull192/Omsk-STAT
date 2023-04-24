package server.database

interface DataBase {
    suspend fun insertData()

    // здесь должны быть запросы
}
package server.excel

interface ExcelParser {
    suspend fun readData(): Any
}
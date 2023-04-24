package server.excel

import server.model.WorkerInfo

interface ExcelParser {
    suspend fun readData(): List<WorkerInfo>
}
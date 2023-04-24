package excel

import server.model.WorkerInfo

interface Parser {
    suspend fun readDataFrom(): List<WorkerInfo>
}
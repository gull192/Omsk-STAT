package server.model

data class WorkerInfo(
    val id: Long,
    val departament: Int,
    val post: String,
    val tableYear: Int,
    val tableDivision: String,
    val tableVenue: String,
    val tableAddres: String,
    val email: String,
    val tableMark: String,
    val phoneNumber: String,
    val expWork: String,
    val name: String
)

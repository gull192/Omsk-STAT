package server.database.impl

import server.database.DataBase
import server.model.WorkerInfo

class DataBaseImpl: DataBase {

    object Workers : Table() {
        val id: (integer("id")),
        val departament: (integer("departament")),
        val post: varchar("post", length = 50),
        val tableYear: (integer("table_year")),
        val tableDivision: varchar("table_division", length = 50),
        val tableVenue: varchar("table_venue", length = 50),
        val tableAddres: varchar("table_addres", length = 50),
        val email: varchar("email", length = 50),
        val tableMark: varchar("table_mark", length = 50),
        val phoneNumber: varchar("phone_number", length = 50),
        val expWork: varchar("exp_work", length = 50),
        val name: varchar("name", length = 50)
    }

    override suspend fun insertData(workerInfo: WorkerInfo) {

    }

    override suspend fun request(query: String): List<WorkerInfo> {
        Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")
        transaction {
            addLogger(StdOutSqlLogger)

            SchemaUtils.create(Cities, Users)

            for (worker in Workers.selectAll()) {
                println("${worker[id]}")
            }
        }

        return listOf<WorkerInfo>()
    }

}
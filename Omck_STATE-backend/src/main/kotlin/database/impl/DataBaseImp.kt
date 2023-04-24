package database.impl

import database.DataBase
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.sql.DriverManager.println

class DataBaseImp: DataBase {
    object Users : Table() {
        val id = integer("id")
        val departament= integer("departament")
        val post = varchar("post", 10)
        val tableYear= integer("tableYear")
        val tableDivision= varchar("tableDivision", 10)
        val tableVenue= varchar("tableVenue", 10)
        val tableAddres= varchar("tableAddres", 10)
        val email= varchar("email", 10)
        val tableMark= varchar("tableMark", 10)
        val phoneNumber= varchar("phoneNumber", 10)
        val expWork= varchar("expWork", 10)
        val name= varchar("name", 10)

        /*val id = varchar("id", 10) // Column<String>
        val name = varchar("name", length = 50) // Column<String>
        val cityId = (integer("city_id") references Cities.id).nullable() // Column<Int?>

        override val primaryKey = PrimaryKey(id, name = "PK_User_ID") // name is optional here*/
    }
    override fun insertData() {
        Database.connect("localhost", driver = "org.h2.Driver", user = "admin", password = "QwertY123")
        transaction {
            addLogger(StdOutSqlLogger)

            SchemaUtils.create (Users)
            for (user in Users.selectAll()) {
                println("${user[Users.id]}")
            }
        }
    }

    override suspend fun request(query: String) {

    }
}
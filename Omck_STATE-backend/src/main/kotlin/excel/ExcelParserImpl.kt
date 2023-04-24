package excel

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import server.model.WorkerInfo
import java.io.File

class ParserImpl(private val pathFile: String): Parser {
    override suspend fun readDataFrom(): List<WorkerInfo> {
        val inputStream = File(pathFile).inputStream()
        val workBook = WorkbookFactory.create(inputStream)

        val workSheet: Sheet = workBook.getSheetAt(0)
        val rowCount = workSheet.lastRowNum
        val
        for (i in 0..rowCount) {

        }
    }
}
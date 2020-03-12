package csv
/*
 * CSVファイルの中身をカンマ区切りで一つのデータとして捉えてstudentクラスに格納しています。
 * ヘッダーがあるとヘッダーもStudentデータの一つとして捉えてしまいますので、現状ヘッダーは使えません。
 * もしヘッダーを使いたければ1行目だけ飛ばす処理が必要です。
 *
 * 文字コードはUTF-8です。SJISのCSVファイルは文字化けします。
 */
import java.io.File
import java.util.StringTokenizer

import kotlin.system.exitProcess

fun csvfileOperation(sortNumber: Int, sortOrder: Int){
	val csvFile = File("C:\\Users\\WISS1_0081\\Desktop\\Sasada\\Kensyu\\Kotlin\\UTF8Test.csv")
	var temporary_student_List = mutableListOf<Student>()

	csvFile.forEachLine {
		if (it.isNotBlank()) {
			val tokenizer = StringTokenizer(it)
			val student_number = (tokenizer.nextToken(","))
			val student_name = (tokenizer.nextToken(","))
			val student_kurasu = (tokenizer.nextToken(","))
			val student_age = (tokenizer.nextToken(","))
			val student_score = (tokenizer.nextToken(","))

			val hoge = Student(
					student_number,
					student_name,
					student_kurasu,
					stringToInt(student_age),
					stringToInt(student_score)
			)
			temporary_student_List.add(hoge)
		}
	}

	sortList(sortNumber, sortOrder, temporary_student_List)
}

// Intに直す必要が出てきたのでここで直しています。
fun stringToInt(stringLikeInt : String):Int{
	var return_Int : Int

	when(stringLikeInt.toIntOrNull()){
		is Int -> 	{
			return_Int = stringLikeInt.toInt()
			return return_Int
		}
		else -> {
			println("エラー:年齢または点数に数字以外のものが含まれています")
			exitProcess(0)
		}
	}
}
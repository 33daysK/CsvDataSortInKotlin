package csv

import java.io.File

/**  
 *  csvFileWriteクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  ファイルに書き込みをしています
 *  .use関数がJavaで言うtry-with-resorceの役割を果たしてくれているため自動的にcloseされます。
 */
fun csvFileWrite (fileName: String, sorted_StudentList: List<Student>){

	var record :String
	printScreen(sorted_StudentList)

	// 新しいファイルを作ってＣＳＶ形式にするためにカンマを挟み込んでいます。
	File(fileName).bufferedWriter().use { out ->
		sorted_StudentList.forEach{
			record = it.number + ","
			record += it.name + ","
			record += it.kurasu + ","
			record += it.age.toString() + ","
			record += it.score.toString() + ","
			out.write(record)
			out.newLine()  // 改行
		}
	}
}


fun printScreen(sorted_studentList: List<Student>){
	println("%3s%8s%20s%3s%3s".format("番号","名前","クラス","年齢","点数"))
	sorted_studentList.forEach{
		println("%-8s%-${25-it.name.length}s%5s%6d%5d".format(it.number,it.name,it.kurasu,it.age,it.score))}
}

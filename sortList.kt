package csv
/* 引き渡されてきたリストをソートしてソート済みのリストを返却します。
 * ソートの項目名は以下の通りです。
 * sortNumber = 0:number 1:kurasu  2:age  3:score
 * sortOrder  = 0:昇順   1:降順
 *
 * todo: もっとスマートな書き方に直せるなら直したい
 */
fun sortList(sortNumber: Int, sortOrder: Int, sortList_before: MutableList<Student>){
	// true = 昇順 、false = 降順 のBoolean変数
	val sort_in_ascending_order = (sortOrder == 0)
	var fileName : String

	when(sortNumber){
		0 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.number }
				fileName = "番号昇順.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.number }
				fileName = "番号降順.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		1 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.kurasu }
				fileName = "名前昇順.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.kurasu }
				fileName = "名前降順.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		2 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.age }
				fileName = "クラス昇順.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.age }
				fileName = "クラス降順.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		3 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.score }
				fileName = "点数昇順.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.score }
				fileName = "点数降順.csv"
				csvFileWrite(fileName,sortedList)
			}
		}
		else -> {
			println("予期せぬエラーが発生しました")
		}
	}
}
package csv
/**  
 *  ここがメインクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  KotlinでCSVファイルをソートして出力するプログラムです。
 *  要件
 *  1.なるべくJavaの書き方をしないこと（Kotlinでかけるならそっちで書くこと）
 *  2.CSVファイルを読み込んでユーザーが入力した方式に従ってソートすること
 *  3.ソート結果を画面に表示してCSVファイル形式で出力すること
 */
fun main(args: Array<String>){

	// 起動時オプションを表示します。
	if(args.size == 1) option(args[0])

	// ユーザがソート方式を選択します。
	// ユーザの入力の受付部分はinputの中にあります。
	// IntがNullチェックされた状態で帰ってきます。
	println("並べ替えたい項目を選んでください")
	print("[0:番号　1:名前　2:年齢　3:点数] ＞")
	val sortNumber = input_number(3)

	println("並替種別を選んでください")
	print("[0:昇順　1:降順] ＞")
	val sortOrder = input_number(1)

	// CSVファイルの操作やデータの操作などはこの関数の中で行われます。
	csvfileOperation(sortNumber,sortOrder)
}

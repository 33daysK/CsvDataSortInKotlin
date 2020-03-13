package csv

/* 数値の入力を受け付ける関数です。
 * ユーザからの入力を受け付ける際はNull許容型変数になってしまうため、
 * Nullチェックを施した上で非Null型の変数へと整形しています。
 *
 */
import kotlin.system.exitProcess

fun input_number(sort : Int): Int{
	// readLineでユーザからの入力を受け付けています。
	// 戻り値はString?なのでNullチェックをしてからでないとInt型には直せません。
	var  inputNumber = readLine()
	var return_Number :Int

	// toIntOrNullはString?値を評価してIntにできるならそのIntを、そうでないならNullを返します。
	// なのでelse節にはnullが入ります。
	when(inputNumber?.toIntOrNull()){
		is Int -> 	{
			return_Number = inputNumber.toInt()
			if(return_Number <0 || sort < return_Number ) wrongData()
			return return_Number
		}
		else -> {
		wrongData()
		return -1 // エンコードを通すためのダミー数値のリターン。実際に呼ばれることはありません。
		}
	}
}
// 同じ文言が出てくるので関数で分けただけです。
// リファクタリングします。
fun wrongData(){
	println("入力情報が不正です")
	exitProcess(0)
}
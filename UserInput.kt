package csv
/**  
 *  UserInputクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  数値の入力を受け付ける関数です。
 *  ユーザからの入力を受け付ける際はNull許容型変数になってしまうため、
 *  Nullチェックを施した上で非Null型の変数へと整形しています。
 */
import kotlin.system.exitProcess

fun input_number(sort : Int): Int{
	
	// readLineでユーザからの入力を受け付けています。
	// 戻り値はString?なのでNullチェックをしてからでないとInt型には直せません。
	var inputNumber = readLine()
	var return_Number :Int

	// toIntOrNullはString?値を評価してIntにできるならそのIntを、そうでないならNullを返します。
	// なのでelse節にはnullが入ります。
	when(inputNumber?.toIntOrNull()){
		is Int -> 	{
			return_Number = inputNumber.toInt()

			// 入力された数字が正しいかどうかチェックしています。
			// もし入力された数字が0～sortの間に収まらなければexitProcess(0)で強制的に処理を中断します。
			checkNumber(sort , return_Number)

			return return_Number
		}
		else -> {
			println("入力情報が不正です")
			exitProcess(0)
		}
	}
}
// ネストを浅くするために関数を分けました。
fun checkNumber(sort : Int , checkNumber : Int){
	// 入力された数字が0以下またはsortより大きいときはエラーとして処理を中断します。
	// そうでなければ何もしません。
	if(checkNumber <0 || sort < checkNumber ){
		println("入力情報が不正です")
		exitProcess(0)
	}
}
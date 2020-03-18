package csv

import kotlin.system.exitProcess
/**  
 *  Optionクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *　 when文でOptionの種類を判断しています。
 *  追加するときはwhen節の中に書き込んでください。
 */
fun option(option_item : String){
	when(option_item){
		"-help" -> {
			println("アプリケーション「XXXX」は、CSV形式のファイル内の情報を入力キーを元に並べ替えて結果を表示します。")
		}
		else -> {
			println("存在しないオプションです")
			exitProcess(0)
		}
	}
}
package csv
/**  
 *  Studentのデータクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  getterとsetterはKotlinがデフォルトで用意してくれるものをそのまま利用しています。
 *  toStringだけは上書きしています。そのままだと「number:0001」のように出力されるためです。
 */

data class Student(
	val number: String = "",
	val name:   String = "",
	val kurasu: String = "",
	val age:    Int    = 0,
	val score:  Int    = 0)
{
	override fun toString(): String {

   		// toStringで中のデータだけ出力するように変更しています。
        return "$number,$name,$kurasu,$age,$score"
    }
}
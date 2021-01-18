import java.util.*

fun main() {

    println("hi im testing")
    val scan: Scanner = Scanner(System.`in`)
    println("이름을 입력하세요\n")
    val name:String = scan.next()

    file_one_three(name)
}

fun file_one_three(name:String?){

    return println("입력하신 이름은 $name 입니다.")
}
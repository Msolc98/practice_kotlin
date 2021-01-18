import java.util.*

fun main() {
    file_one_two()
}

fun file_one_two(){

    println("hi im testing")
    val scan: Scanner = Scanner(System.`in`)
    println("이름을 입력하세요\n")
    val name:String = scan.next()

    return println("입력하신 이름은 $name 입니다.")
}
import java.util.*

fun main() {
    var sum:Int=0

    var scanner = Scanner(System.`in`)

    println("첫번째 숫자를 입력해주세요")
    var firstnumber:Int = scanner.next().toInt()

    println("두번째 숫자를 입력해주세요")
    var secondnumber:Int = scanner.next().toInt()

    for(i in firstnumber..secondnumber){
        sum+=i

        if(i==secondnumber)
            println(sum)

    }


}
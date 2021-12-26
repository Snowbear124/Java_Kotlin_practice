package BasicTest

fun main() {
    val str = "abcde abcde"
    val firstStr = str.first()
    println("First char: $firstStr")

    val lastStr = str.last()
    println("Last char: $lastStr")

    val indexFriStr = str.indexOfFirst{ it == 'a'}
    println("First 'a' at $indexFriStr")

    val indexOf = str.indexOf('a')
    println("First 'a' at $indexOf")

    val indexLastStr = str.indexOfLast { it == 'd' }
    println("Last 'd' at $indexLastStr")

    val lastStr_2 = str.lastIndexOf("bc")   //會取最後一個bc的位置(以b的位置為準)
    println("Last 'bc' at: $lastStr_2")

    val name = "Vivian Diggo"

    val subString = name.substring(4)
    val subString_appoint = name.substring(2, 5)
    val subString_rggne = name.substring(IntRange(2, 5))

    println("Substring '$name' from 4 char start at '$subString'")
    println("Substring '$name' 2 to brfore 5 char at '$subString_appoint'")
    println("Substring '$name' 2~5 char at '$subString_rggne'")

    val myWord = "Hi! i'am Sonwbear, i'am so happy to meet you."

    val changeWord = myWord.replace(Regex("Hi"), "Holle")
//    println(myWord.replace("Hi", "Holle"))

    val arrayStr = "1 Apple 2 Barry 3 Charry"
    val list = arrayStr.split(Regex("[0-9] "))
    println("Split:")
    for (x in list) {
        println(x)
    }

    val emptyStr: String? = "F"
    println(emptyStr?.isEmpty())    //判斷length是否為0
    println(emptyStr.isNullOrEmpty())  //判斷字串是否為null或length是否為0，不需要加?
}
package BasicTest

fun main() {
    val app = APP()
    app.show_number()
    app.Print()
}

//在interface內寫的函示，在繼承時一定要被使用，但只限沒有定義功能的函示，且變數,屬性不能用
//諾要使用繼承的函示，必須在前面加上override
interface APPInterface {
    fun show_number() //= println("333")
}

class APP : APPInterface {
    override fun show_number() {
        println("123456")
    }
}

//kotli可以直接用函示為class擴充功能
fun APP.Print() {
    println("Extension funtion")
}
package BasicTest

fun main() {
    val account_1 = Account("Snow","1234")
    val account_2 = Account("Bear", "4321")
    val account_3 = Account("Snow","1234")

    println(account_1.equals(account_1))    //equals是判斷兩筆資料是否相同
    println(account_1.hashCode())   //hashCode是將資料變成雜湊碼
    println(account_2.hashCode())
    println(account_3.hashCode())
    println(account_1.name)
    println(account_2.name)

    //generics(泛型)的應用顯示
    val box_int = Box(1)
    println(box_int.Value)

    val box_string = Box("Box")
    println(box_string.Value)

    //ordinal是指此列舉的順序
    println("${Color.GREEN.ordinal}: ${Color.GREEN.name}")
    println("${Number.ONE.ordinal}: ${Number.ONE.name}")
}

data class Account(val name: String, var id: String)
//會自動生成eguals(), hashCode(), toString(), componentN(), copy()資料

//<T>表示此函示可以變成任何屬性
class Box<T>(value: T) {
    var Value = value
}

//列舉的範例
enum class Color {
    RED,
    BLUE,
    GREEN
}

enum class Number {
    ONE,
    TWO,
    THREE
}

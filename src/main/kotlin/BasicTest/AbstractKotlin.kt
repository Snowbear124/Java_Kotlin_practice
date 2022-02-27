package BasicTest

abstract class AbstractKotlin {
    var num = 1
    fun func() {}

    // 在kotlin中，所有物件都默認為final，但在kotlin中的設定有一點點不同
    final var num_2 = 2
    final fun func_2() {
        println("Final fun run!")
        println("Print fianl num_2 = $num_2")
    }

    abstract var num_3: Int // 設定抽象變數時，要記得定義屬性
    abstract fun func_3()

    // 可以設定初始值與建構子
    init {
        println("初始值第一層")
    }

    constructor() {
        println("初始第二層，也是建構子層")
    }
}

class AbstractKtRun: AbstractKotlin() {
    // 當被繼承的類別內有抽象物件，就一定要呼叫出來
    override var num_3: Int = 3
//        get() = field
//        set(value) {
//            field = value
//        }

    override fun func_3() {
        println("Abstract fun run!")
        println("Print abstract num_3 = $num_3")
    }
}

fun main() {    // kotlin的執行程式不能放在class中
    val run = AbstractKtRun()
    run.func_2()
    run.func_3()
    println()

    run.num_2 = 22
    run.num_3 = 33
    run.func_2()
    run.func_3()
}

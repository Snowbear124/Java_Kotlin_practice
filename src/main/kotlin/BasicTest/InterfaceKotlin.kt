package BasicTest

interface InterfaceKotlin {
    // 介面內都默認為抽象物件
    // 沒有特別強調是抽象時，fun可以實作，這時的fun會變成final
    var num: Int
    fun funcKt() {}

    abstract var num_2: Int
    abstract fun func_2()

    // 無法初始化，也無法設定建構子
//    init {
//        println()
//    }
//    constructor() {
//
//    }

//    var numTest: Int
//        get() = 3
}

interface InterfaceKotlin_2 {
    // 有設定的fun，不會被強制呼叫
    fun func_3() {
        println("Interface fun_3 run!")
    }
}

// 介面一樣可以多項繼承，介面的繼承不用加上()
// 介面上設定的所有變數(有實作的fun不會)，在被繼承時，所有抽象變數都會被強制呼叫
class InterfaceKtRun : InterfaceKotlin, InterfaceKotlin_2 {
    override var num = 1
    override var num_2 = 2

    override fun func_2() {
        println("Interface fun_2 run!")
    }
}

// kotlin一樣可以同時繼承抽象類別與介面
// 抽象類別要加上()，介面則不用
//
class moreClass : InterfaceKotlin, InterfaceKotlin_2, AbstractKotlin() {
    override var num_3 = 3
//        get() = super.num_3
//        set(value) {}

    override fun func_3() {
//        super.func_3()
    }
}

fun main() {
    var runInterface = InterfaceKtRun()
    runInterface.func_2()
    runInterface.func_3()
}
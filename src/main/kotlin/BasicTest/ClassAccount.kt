package BasicTest

import org.omg.CORBA.ARG_IN.value

class Account1 {
    var name: String = ""
    var id: String = ""
    var balance: String = ""
}

class Account2 {
    var name: String = ""
        //get() 拿取name的值，做其他功能
        set(value) {    //被拿來使用在製作防呆功能上
            if (value == "") {
                field = "戶名不能為空白"
            } else {
                field = value
            }
        }
}

class Account3 {
    var name: String = ""
        init {
            println("初始化,第一層")
        }

        constructor() {
            println("初始化,第二層")
        }
}

fun main() {
//    val account1 = Account1()
//
//    account1.id = "12345"
//    account1.name = "vicky"
//    account1.balance = "100"
//
//    println("Account1")
//    println("Id : ${account1.id}")
//    println("Name : ${account1.name}")
//    println("Balance : ${account1.balance}")

    val account3 = Account3()   //執行此行就可以直接印出init和constructor的內容
}
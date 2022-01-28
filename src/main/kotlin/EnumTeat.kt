
enum class EnumTeat(
    val coin: String,
    val FX: Double
) {
    USD("美元", 30.0),
    CNY("人民幣", 4.5),
    JPY("日圓", 0.3),
    TWD("臺幣", 1.0);
}

class CurrentAccount(
    val id: String,
    val coinType: EnumTeat, // enum可以當資料型態
    var savaMoney: Double
) {

}

fun main() {
    val ac1 = CurrentAccount("1", EnumTeat.USD, 300.0)
    val ac2 = CurrentAccount("2", EnumTeat.TWD, 5000.0)
    val ac3 = CurrentAccount("3", EnumTeat.CNY, 900.0)

    val accountList = listOf(ac1, ac2, ac3)
    for (ac in accountList) {
        var printString = ""

        printString += "幣別: ${ac.coinType.coin}\n"
        printString += "餘額: ${ac.savaMoney}\n"
        printString += "換算成臺幣: ${ac.savaMoney * ac.coinType.FX}"

        println(printString)
        println()
    }

//    println(EnumTeat.JPY.coin)

    // sortedBy會使list順序變成enum設定的順序
    val accountList_2 = listOf(ac1, ac2, ac3)
        .sortedBy { it.coinType.ordinal } // 代表CurrentAccount

    println("使順序變成enum設定的順序")
    for (ac in accountList_2) {
        println(ac.coinType.coin)
    }

    // 取得所有列舉
    val types: Array<EnumTeat> = EnumTeat.values()
    println("\n取得所有enum項目")
    for (i in types) {
        println(i)
    }
}
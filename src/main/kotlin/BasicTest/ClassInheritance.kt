package BasicTest

fun main() {
    val lottery = LotteryData()
    val lottery2 = LotteryBall()

    lottery.BallNumber1 = "iphone 13"
    lottery.BallNumber2 = "samsung galaxy note20"
    lottery.BallNumber3 = "sony Xperia 5 III"
    lottery.BallNumber4 = "google pixel"
    lottery.DataName = "My want new phone"

    println("${lottery.BallNumber1}, ${lottery.BallNumber2}, ${lottery.BallNumber3} and ${lottery.BallNumber4} " +
            "all are ${lottery.DataName}")

    lottery.BallColor()
    lottery2.BallColor()
}

//想要繼承class ,必須在要開放繼承的class前面加上open
open class LotteryNumber() {
    //彩球名稱
    var BallNumber1 : String = ""
    var BallNumber2 : String = ""
    var BallNumber3 : String = ""
    var BallNumber4 : String = ""

    //將想要被複寫的涵式or變數前加上open
    open fun BallColor() = println("Ball color is bule.")

}

//繼承是把要繼承的class放在涵式的 "名稱 + :" 後面
class LotteryData : LotteryNumber() {
    var DataName : String = ""
}

class LotteryBall : LotteryNumber() {

    //若想複寫涵數，必須先用open開啟，再用override執行複寫動作
    override fun BallColor() {
        println("Ball is red.")
    }
}
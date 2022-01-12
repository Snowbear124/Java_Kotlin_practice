package BasicTest


fun main() {
    collcetion().listTest()
//    mapTest()
//    setTest()
}

class collcetion {

    fun listTest() {
        val AryList1 = listOf<Int>()
        val Arylist2 = listOf("aa", "bb", "cc")   //<>要填資料型態,可以刪除

        println(AryList1)
        println(Arylist2)

        val Arylist3 = mutableListOf("a", "ab", "abc")
        println("最初設定的list: $Arylist3")

        Arylist3.get(1)
        println("Arylist3 get '1': ${Arylist3.get(1)}")

        println("移除: ${Arylist3.remove("a")}")
        println("list: $Arylist3")

        println("搜尋 abc的位置: ${Arylist3.indexOf("abc")}")
        println("取得第一項: ${Arylist3.first()}")
        println("取得最後一項: ${Arylist3.last()}")
        println("取得index[1]: ${Arylist3[1]}")

        //空值的例外處理
        val noFind = AryList1.getOrElse(4) {
            "內的訊息"
        }
        println("getOrElse找不到值，會回傳{ ${noFind} }")
        println("getOrNull找不到值，會回傳 ${AryList1.getOrNull(4)}")

        println("查詢'2'是否存在: ${AryList1.contains("2")}")
        println(Arylist2.containsAll(listOf("aa", "bb")))

        println("是否為空值 ${AryList1.isEmpty()}")
        println("是否為空值 ${AryList1.isNullOrEmpty()}")
    }

    fun mapTest() {
        val ArrayMap1 = mapOf(1 to 78, "2" to 44)
        val ArrayMap2 = mutableMapOf<String, String>("b" to "cc", "a" to "bb")

        println(ArrayMap1)
        println("ArrayMap2 : ${ArrayMap2}")

        ArrayMap2.put("c", "dd")
        println("ArrayMap2 put: ${ArrayMap2}")

        println("ArrayMap2 size: ${ArrayMap2.size}")

        ArrayMap2.remove("a")
        println("ArrayMap2 remove 'a': ${ArrayMap2}")

        ArrayMap2.get("b")
        println("ArrayMap2 get 'b': ${ArrayMap2}")

        ArrayMap2.clear()
        println("ArrayMap2 clear: ${ArrayMap2}")
    }

    fun setTest() {
        val ArraySet1 = setOf(33, 44, 33, "44")
        println("ArraySet1: ${ArraySet1}")

        val ArraySet2 = mutableSetOf<Int>(22, 44, 66)
        println("ArraySet2: ${ArraySet2}")

        ArraySet2.add(22)
        println("ArraySet2 add 22: ${ArraySet2}")

        ArraySet2.add(33)
        println("ArraySet2 add 33: ${ArraySet2}")

        ArraySet2.remove(22)
        println("ArraySet2 remove 22: ${ArraySet2}")

        ArraySet2.clear()
        println("ArraySet2 clear: ${ArraySet2}")
    }
}

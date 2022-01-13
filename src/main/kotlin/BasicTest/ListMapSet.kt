package BasicTest


fun main() {
//    collcetion().listTest()
//    collcetion().mapTest()
    collcetion().setTest()
}

class collcetion {

    fun listTest() {
        val AryList1 = listOf<Int>()
        val AryList2 = listOf("aa", "bb", "cc", "aa", "bb")   //<>要填資料型態,可以刪除

        println("AryList1: $AryList1")
        println("AryList2: $AryList2")

        println("移除AryList2重複的值 ${AryList2.distinct()}")

        val Arylist3 = mutableListOf("a", "ab", "abc")
        println("最初設定的list: $Arylist3")

        Arylist3.get(1)
        println("Arylist3 get '1': ${Arylist3.get(1)}")

        println("移除: ${Arylist3.remove("a")}")
        println("移除: ${Arylist3.removeAt(0)}")
        println("list: $Arylist3")

        println("搜尋 abc的位置: ${Arylist3.indexOf("abc")}")
        println("取得Arylist2第一項: ${AryList2.first()}")
        println("取得Arylist2最後一項: ${AryList2.last()}")
        println("取得Arylist2, index[1]: ${AryList2[1]}")

        //空值的例外處理
        val noFind = AryList1.getOrElse(4) {
            "內的訊息"
        }
        println("getOrElse找不到值，會回傳{ ${noFind} }")
        println("getOrNull找不到值，會回傳 ${AryList1.getOrNull(4)}")

        println("查詢'2'是否存在: ${AryList1.contains("2")}")
        println("查詢'aa', bb是否存在: ${AryList2.containsAll(listOf("aa", "bb"))}")

        println("是否為空值 ${AryList1.isEmpty()}")
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

        ArrayMap2["a"]
        println("ArrayMap2 get 'b': ${ArrayMap2.get("b")}")

        //用getValue取得key, 若key不存在, 會跳出錯誤訊息
        println("ArrayMaps getValue 'c': ${ArrayMap2.getValue("c")}")

        ArrayMap2.clear()
        println("ArrayMap2 clear: ${ArrayMap2}")

        println("取得ArrayMap1['2']的值: ${ArrayMap1["2"]}")

        //取得不存在的值
        val noFind = ArrayMap2.getOrElse("1") {
            "此值不存在"
        }
        println("getOrElse: ${noFind}")
        println("getOrDefault: ${ArrayMap1.getOrDefault("1", 100)}")


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

        val n = 2
        println("查詢33這個值是否存在: ${ArraySet2.contains(33)}")
        println("第${n+1}位被放入的值: ${ArraySet2.elementAt(n)}")

        ArraySet2.remove(22)
        println("ArraySet2 remove 22: ${ArraySet2}")

        ArraySet2.clear()
        println("ArraySet2 clear: ${ArraySet2}")
    }
}

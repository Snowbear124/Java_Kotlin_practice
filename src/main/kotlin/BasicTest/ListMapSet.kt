package BasicTest

fun main() {
    val AryList1 = listOf<Int>(34,56,21)
    val Arylist2 = listOf("aa","bb","cc")   //<>要填資料型態,可以刪除

    println(AryList1)
    println(Arylist2)

    val Arylist3 = mutableListOf("a","ab","ab")
    println(Arylist3[0])

    Arylist3.get(1)
    println("Arylist3 get '1': ${Arylist3.get(1)}")

    Arylist3.remove("a")
    println(Arylist3[0])

    Arylist3.add("abcde")
    println(Arylist3)

//*************************************************************
//    val ArrayMap1 = mapOf(1 to 78, "2" to 44)
//    val ArrayMap2 = mutableMapOf<String, String>("b" to "cc", "a" to "bb")
//
//    println(ArrayMap1)
//    println("ArrayMap2 : ${ArrayMap2}")
//
//    ArrayMap2.put("c", "dd")
//    println("ArrayMap2 put: ${ArrayMap2}")
//
//    println("ArrayMap2 size: ${ArrayMap2.size}")
//
//    ArrayMap2.remove("a")
//    println("ArrayMap2 remove 'a': ${ArrayMap2}")
//
//    ArrayMap2.get("b")
//    println("ArrayMap2 get 'b': ${ArrayMap2}")
//
//    ArrayMap2.clear()
//    println("ArrayMap2 clear: ${ArrayMap2}")

//*************************************************************
//    val ArraySet1 = setOf(33,44,33,"44")
//    println("ArraySet1: ${ArraySet1}")
//
//    val ArraySet2 = mutableSetOf<Int>(22,44,66)
//    println("ArraySet2: ${ArraySet2}")
//
//    ArraySet2.add(22)
//    println("ArraySet2 add 22: ${ArraySet2}")
//
//    ArraySet2.add(33)
//    println("ArraySet2 add 33: ${ArraySet2}")
//
//    ArraySet2.remove(22)
//    println("ArraySet2 remove 22: ${ArraySet2}")
//
//    ArraySet2.clear()
//    println("ArraySet2 clear: ${ArraySet2}")
}
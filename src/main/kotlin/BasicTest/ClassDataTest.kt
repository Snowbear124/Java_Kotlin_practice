package BasicTest

// data class至少要有一個建構子參數
data class ClassDataTest(val name: String, val id: Int) {
    val list = mutableListOf<Int>()
    val nums = IntArray(1)
    fun a() {
        list.add(2)
    }
}
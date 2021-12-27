package BasicTest

import BasicTest.kotlin.Add_kotlin
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class Add_kotlinTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun add2Num() {
        val n1 = 4
        val n2 = 6
        val add = Add_kotlin(n1, n2).add2Num()
        Assertions.assertEquals(n1 + n2, add)
    }
}
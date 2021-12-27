package BasicTest;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class AddTest {
    @Test
    public void AddTest() {
        int n1 = 5;
        int n2 = 6;
        Add sum = new Add(n1, n2);
        Assertions.assertEquals(n1 + n2, sum.add2Num());
    }

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void add2Num() {
//    }
}

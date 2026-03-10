package searchlibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchTest {

    int[] arr = {1,3,5,7,9,11};

    @Test
    void testFirstElement() {
        assertEquals(0, LinearSearch.search(arr,1));
    }

    @Test
    void testMiddleElement() {
        assertEquals(2, BinarySearch.search(arr,5));
    }

    @Test
    void testLastElement() {
        assertEquals(5, JumpSearch.search(arr,11));
    }

    @Test
    void testElementNotFound() {
        assertEquals(-1, LinearSearch.search(arr,20));
    }

    @Test
    void testSingleElement() {

        int[] a = {10};

        assertEquals(0, LinearSearch.search(a,10));
    }
    @Test
    @DisplayName("Test empty array")
    void fail(){
        System.out.println("This test is designed to fail");
    }
 @Test
@DisplayName("Test empty array")
void fail(){
    System.out.println("This test is designed to fail");
    assertEquals(1, LinearSearch.search(arr,1)); 
}
}
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UtilitiesTest {
    private static Utilities utilities;

    @BeforeAll
    static void setup(){
        utilities=new Utilities();
    }


    @org.junit.jupiter.api.Test
    void getSourceArray() {
    }

    @org.junit.jupiter.api.Test
    void getN() {
    }

    @org.junit.jupiter.api.Test
    void getSource() {
    }

    @DisplayName("Remove Pairs - Valid Return")
    @ParameterizedTest(name = "{index} => expected={0}, actual={1}")
    @CsvSource({
            "AABCDDEFF, ABCDEF",
            "ABCCABDEEF, ABCABDEF",
            "AAAA, A",
            "A, A",
            "'', ''"
    })
    void removePairs_validReturn(String input, String expected) {
        System.out.println(expected);
        System.out.println(utilities.removePairs(input));
        System.out.println("***");
        assertEquals(expected, utilities.removePairs(input));
    }


    @DisplayName("Every Nth Char")
    @ParameterizedTest(name = "{index} => expected={0}, actual={1}, n={2}")
    @MethodSource("testCases")
    void everyNthChar(char[] expected, char[] actual, int n) {
        System.out.println(expected);
        System.out.println(utilities.everyNthchar(actual, n));
        System.out.println("******");
        assertArrayEquals(expected, utilities.everyNthchar(actual, n));
    }


    @DisplayName("Remove Pairs - Check Null")
    @Test
    void removePairs_CheckNull() {
        assertNull(utilities.removePairs("hugo"), "Debio de retornar null");
    }
    @Test
    void nullIfOddLength()
    {
        assertEquals("mirror", utilities.nullIfOddLenght("mirror"));
        assertNull(utilities.nullIfOddLenght("hello"));
    }
    @Test
    void converter()
    {
        assertEquals(300, utilities.convert(10, 5));
        assertThrows(ArithmeticException.class, () -> utilities.convert(10, 0));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                arguments(new char[] {'e', 'l'}, new char[] {'h', 'e', 'l', 'l', 'o'}, 2),
                arguments(new char[] {'h', 'e', 'l', 'l', 'o'}, new char[] {'h', 'e', 'l', 'l', 'o'}, 10),
                arguments(new char[] {'b', 'c', 'o'}, new char[] {'d', 'o', 'b', 'l', 'e', 'c', 'e', 'r', 'o'}, 3)
        );
    }
}
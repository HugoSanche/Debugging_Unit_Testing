import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities utilities;
    @org.junit.Before
    public void setup(){
        char[] sourceArray={'a','b','c','d','f','g'};
        utilities=new Utilities(sourceArray,5,"ABBCDEEF");
    }
    @org.junit.Test
    public void everyNthchar() {
        fail("Test not add");
    }

    @org.junit.Test
    public void removePairs() {
        String string=utilities.removePairs("AABCDDEFF");
        System.out.println(string);
        assertEquals("ABCDEF",string);
    }
    @org.junit.Test
    public void removePairsTwo() {
        String string=utilities.removePairs("ABCCABDEEF");
        System.out.println(string);
        assertEquals("ABCABDEF",string);
    }
    @org.junit.Test
    public void convert() {
        fail("Test not add");
    }

    @org.junit.Test
    public void nullIfOddLenght() {
        fail("Test not add");
    }
}
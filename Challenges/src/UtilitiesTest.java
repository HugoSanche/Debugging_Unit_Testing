import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;
    @org.junit.Before
    public void setup(){
        utilities=new Utilities();
    }
    @org.junit.Test
    public void everyNthchar() {
        char[] array= utilities.everyNthchar(new char[]{'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'},array);

        char[] array2= utilities.everyNthchar(new char[]{'h','e','l','l','o'},8);
        assertArrayEquals(new char[]{'h','e','l','l','o'},array2);

    }

    @org.junit.Test
    public void removePairs() {
        String string=utilities.removePairs("");
        System.out.println(string);
        //assertEquals("ABCDEF",string);
        //assertEquals(null,string);
        assertEquals("",string);

    }

    @org.junit.Test
    public void removePairsTwo() {
        String string=utilities.removePairs("aabccdeez");
        System.out.println(string);
        assertEquals("abcdez",string);
    }
    @org.junit.Test
    public void convert() {
        int resultado=utilities.convert(10,5);
        assertEquals(300,resultado);
    }

    //si deseas saber si el resultado es una exception en este caso ArithmeticException
    @org.junit.Test(expected = ArithmeticException.class)
    public void convert_ArithmeticException(){
        int resultado=utilities.convert(10,0);
        assertEquals(0,resultado);
}


    @org.junit.Test
    public void nullIfOddLenght() {
        String string=utilities.nullIfOddLenght("sofia");
        assertNull(null,string);

        String string2=utilities.nullIfOddLenght("casa");
        assertNotNull("casa",string2);

      //  String string3=utilities.nullIfOddLenght(")");
       // assertEquals("xcddkfudyhskshdkdl","xcddkfudyhskshdkd");
    }
}
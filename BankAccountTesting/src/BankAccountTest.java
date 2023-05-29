import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    private static int count;
    @org.junit.Before
    public void setup(){
         account =new BankAccount("Hugo","Baltazar",1000.00,BankAccount.CHECKING);
        System.out.println("Running a test");
    }
    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases");
    }

    @org.junit.Test
    public void deposit() {
        double balance=account.deposit(200.00, true);
        assertEquals(1200.00,balance,0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
                                                    // (tercer parametro)
    }

    @org.junit.Test
    public void withDraw() {
        double balance=account.withDraw(600.00,true);
        assertEquals(400,balance,0);
    }
    @org.junit.Test
    public void withDraw_branch() {
        double balance=account.withDraw(600.00,true);
        assertEquals(400,balance,0);
    }
    @org.junit.Test(expected = IllegalArgumentException.class) //Si recibe IllegalArgumentException no lo marca como exception
    public void withDraw_nobranch() {
        double balance=account.withDraw(600.00,false);
        //assertEquals(400,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        double balance=account.deposit(200.00, true);
        assertEquals(1200.00,account.getBalance(),0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
        // (tercer parametro)
    }
    @org.junit.Test
    public void getBalance_withdraw() {
        double balance=account.withDraw(200.00, true);
        assertEquals(800.00,account.getBalance(),0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
        // (tercer parametro)
    }
    @org.junit.Test
    public void isCheking_true(){
        assertEquals("The account is NOT checking account",true,account.isChecking());
        assertTrue(account.isChecking());
    }
    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = "+count++);
    }
    @org.junit.After
    public void tearDown(){
        System.out.println("Count: "+count++);
    }

//    @org.junit.Test
//    public void dummyTest(){
//        assertEquals(21,21);
//    }
}


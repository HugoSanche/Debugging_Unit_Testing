import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account =new BankAccount("Hugo","Baltazar",1000.00,BankAccount.CHECKING);
        double balance=account.deposit(200.00, true);
        assertEquals(1200.00,balance,0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
                                                    // (tercer parametro)
    }

    @org.junit.Test
    public void withDraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account =new BankAccount("Hugo","Baltazar",1000.00,BankAccount.CHECKING);
        double balance=account.deposit(200.00, true);
        assertEquals(1200.00,account.getBalance(),0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
        // (tercer parametro)
    }
    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account =new BankAccount("Hugo","Baltazar",1000.00,BankAccount.CHECKING);
        double balance=account.withDraw(200.00, true);
        assertEquals(800.00,account.getBalance(),0);//Se espera que balance sea igual a 1200.00 con un margen de error de 0
        // (tercer parametro)
    }
    @org.junit.Test
    public void isCheking_true(){
        BankAccount account =new BankAccount("Hugo","Baltazar",1000.00,BankAccount.SAVINGS);
        assertEquals("The account is NOT checking account",true,account.isChecking());
        assertTrue(account.isChecking());
    }


//    @org.junit.Test
//    public void dummyTest(){
//        assertEquals(21,21);
//    }
}
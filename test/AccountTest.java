import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Account account;

@BeforeEach
public void setUp(){
    account = new Account(5000,"Gospel");
}
@Test
public void checkThatObjectExist(){
    assertNotNull(account);
}
    @Test
    public void testThatWithdrawalCanBeMade(){
   account.withdraw(6000);
   assertEquals(000.0, account.getBalance());


    }

}
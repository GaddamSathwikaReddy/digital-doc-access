import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testAccountNumberAssignment() {
        Account account = new Account();
        account.accountNumber = "ACC12345";
        assertEquals("ACC12345", account.accountNumber);
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testAccountCreation() {
        Account account = new Account("123456", 1, 30, "Email");
        assertEquals("123456", account.getAccountNumber());
        assertEquals(1, account.getUserID());
        assertEquals(30, account.getDeliveryFrequency());
        assertEquals("Email", account.getDeliveryMode());
    }
}

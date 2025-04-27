import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testMockedUserName() {
        User mockUser = mock(User.class);
        when(mockUser.getUsername()).thenReturn("mockuser123");

        assertEquals("mockuser123", mockUser.getUsername());
    }
}

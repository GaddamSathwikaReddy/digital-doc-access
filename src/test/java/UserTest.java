import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testUserLoginMock() {
        User userMock = mock(User.class);
        doNothing().when(userMock).login();

        userMock.login();

        verify(userMock, times(1)).login();
    }
}

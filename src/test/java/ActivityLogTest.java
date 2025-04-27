import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ActivityLogTest {

    @Test
    void testActivityLogCreation() {
        ActivityLog log = new ActivityLog();
        assertNotNull(log);
    }

    @Test
    void testMockingActivityLog() {
        ActivityLog mockLog = Mockito.mock(ActivityLog.class);
        Mockito.when(mockLog.getAction()).thenReturn("Document Uploaded");

        assertEquals("Document Uploaded", mockLog.getAction());
        Mockito.verify(mockLog).getAction();
    }
}

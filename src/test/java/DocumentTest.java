import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;

public class DocumentTest {

    @Test
    void testDocumentUploadDate() {
        Document document = new Document();
        document.uploadDate = new Date();
        assertNotNull(document.uploadDate);
    }
}

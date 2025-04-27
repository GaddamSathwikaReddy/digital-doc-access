import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testDocumentCreation() {
        Document doc = new Document();
        doc.setDocType("Invoice");
        assertEquals("Invoice", doc.getDocType());
    }
}

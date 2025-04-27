import java.util.Date;

public class Document {
    private int documentID;
    private String accountNumber;
    private String title;
    private Date uploadDate;
    private String docType;
    private String contentURL;

    // Getter and setter for uploadDate
    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}

import java.util.Date;
import java.sql.Timestamp;

public class ActivityLog {

    private int logID;
    private int userID;
    private int documentID;
    private String action;
    private Timestamp timestamp;

    public ActivityLog() {}

    public ActivityLog(int logID, int userID, int documentID, String action, Timestamp timestamp) {
        this.logID = logID;
        this.userID = userID;
        this.documentID = documentID;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getAction() {
        return action;
    }
}

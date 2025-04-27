public class Account {

    private String accountNumber;
    private int userID;
    private int deliveryFrequency;
    private String deliveryMode;

    public Account() {}

    public Account(String accountNumber, int userID, int deliveryFrequency, String deliveryMode) {
        this.accountNumber = accountNumber;
        this.userID = userID;
        this.deliveryFrequency = deliveryFrequency;
        this.deliveryMode = deliveryMode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getUserID() {
        return userID;
    }

    public int getDeliveryFrequency() {
        return deliveryFrequency;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }
}

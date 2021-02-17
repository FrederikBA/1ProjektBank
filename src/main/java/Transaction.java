public class Transaction {
    int amount;
    String date;
    int sentAccount_ID;
    int  receivedAccount_ID;

    public Transaction(int amount, String date, int sentAccount_ID, int receivedAccount_ID) {
        this.amount = amount;
        this.date = date;
        this.sentAccount_ID = sentAccount_ID;
        this.receivedAccount_ID = receivedAccount_ID;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public int getSentAccount_ID() {
        return sentAccount_ID;
    }

    public int getReceivedAccount_ID() {
        return receivedAccount_ID;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                ", sentAccount_ID=" + sentAccount_ID +
                ", receivedAccount_ID=" + receivedAccount_ID +
                '}';
    }
}

public class TransactionFactory {
    private Transfer tx;

    public Transfer newInstance() {
        if (tx == null) {
            tx = new Transfer("transaction id", "sender", 100);
        }

        return tx;
    }
}

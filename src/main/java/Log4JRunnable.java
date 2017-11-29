import org.apache.log4j.MDC;

public class Log4JRunnable implements Runnable {

    private static Log4JTransferService service = new Log4JTransferService();
    private Transfer tx;

    public Log4JRunnable(Transfer tx) {
        this.tx = tx;
    }

    public void run() {
        MDC.put("transaction.id", tx.getTransactionId());
        MDC.put("transaction.owner", tx.getSender());
        service.transfer(tx.getAmount());
        MDC.clear();
    }
}

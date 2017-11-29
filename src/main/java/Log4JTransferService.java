import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4JTransferService extends TransferService {
    private Logger logger = LoggerFactory.getLogger(Log4JTransferService.class);

    @Override
    protected void beforeTransfer(long amount) {
        logger.info("Preparing to transfer " + amount + "$.");
    }

    @Override
    protected void afterTransfer(long amount, boolean outcome) {
        logger.info(
                "Has transfer of " + amount + "$ completed successfully ? " + outcome + ".");
    }
}

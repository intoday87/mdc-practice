public abstract class TransferService {

    public boolean transfer(long amount) {
        beforeTransfer(amount);
        // connects to the remote service to actually transfer money
        afterTransfer(amount, true);
        return true;
    }

    abstract protected void beforeTransfer(long amount);

    abstract protected void afterTransfer(long amount, boolean outcome);
}

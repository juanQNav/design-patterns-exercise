package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Communication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public class IngenicoModemAdapter implements Communication {
    IngenicoModemAdapter communication = new IngenicoModemAdapter();
    @Override
    public boolean open() {
        return communication.open();
    }

    @Override
    public boolean send(Transaction message) {
        return communication.send(message);
    }

    @Override
    public TransactionResponse receive() {
        return communication.receive();
    }

    @Override
    public void close() {
        communication.close();
    }
}

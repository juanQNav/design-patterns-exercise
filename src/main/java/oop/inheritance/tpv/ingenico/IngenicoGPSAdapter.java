package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Communication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.ingenico.services.IngenicoGPS;

public class IngenicoGPSAdapter implements Communication {
    IngenicoGPS communication = new IngenicoGPS();
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

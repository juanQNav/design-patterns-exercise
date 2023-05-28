package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.Communication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public class Verifone240EthernetAdapter implements Communication {
    Verifone240EthernetAdapter communication = new Verifone240EthernetAdapter();
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

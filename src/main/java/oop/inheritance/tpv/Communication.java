package oop.inheritance.tpv;

import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public interface Communication {
    boolean open();

    boolean send(Transaction message);

    TransactionResponse receive();

    void close();
}

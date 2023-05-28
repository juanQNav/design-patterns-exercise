package oop.inheritance.tpv.verifone240;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.tpv.*;
import oop.inheritance.tpv.ingenico.IngenicoDisplayAdapter;

public class Verifone240DeviceFactory extends TpvDeviceFactory {

    private final Communication communication;
    private final CardSwipper cardSwiper = new Verifone240CardSwiperAdapter();
    private final ChipReader chipReader = new Verifone240ChipReaderAdapter();
    private final Printer printer = new Verifone240PrinterAdapter();

    public Verifone240DeviceFactory(CommunicationType communicationType) {
        switch (communicationType){
            case MODEM -> communication = new Verifone240ModemAdapter();
            case GPS -> communication = new Verifone240GPSAdapter();
            case ETHERNET -> communication = new Verifone240EthernetAdapter();
            default -> communication = null;
        }
    }

    @Override
    public Keyboard getKeyboard() {
        return new Verifone240mKeyboardAdapter();
    }

    @Override
    public Display getDisplay() {
        return new IngenicoDisplayAdapter();
    }

    @Override
    public Communication getCommunication() {
        return communication;
    }

    @Override
    public CardSwipper getCardSwiper() {
        return cardSwiper;
    }

    @Override
    public ChipReader getChipReader() {
        return chipReader;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}

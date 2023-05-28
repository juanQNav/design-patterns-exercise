package oop.inheritance.tpv.ingenico;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.tpv.*;

public class IngenicoDeviceFactory extends TpvDeviceFactory {

    private final Communication communication;
    private final CardSwipper cardSwiper = new IngenicoCardSwiperAdapter();
    private final ChipReader chipReader = new IngenicoChipReadeAdapter();
    private final Printer printer = new IngenicoPrinterAdapter();
    public IngenicoDeviceFactory(CommunicationType communicationType) {
        switch (communicationType){
            case MODEM -> communication = new IngenicoModemAdapter();
            case GPS -> communication = new IngenicoGPSAdapter();
            case ETHERNET -> communication = new IngenicoEthernetAdapter();
            default -> communication = null;
        }
    }

    @Override
    public Keyboard getKeyboard() {
        return new IngenicoKeyboardAdapter();
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

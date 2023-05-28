package oop.inheritance.tpv;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.ingenico.IngenicoDeviceFactory;
import oop.inheritance.tpv.verifone240.Verifone240DeviceFactory;

public abstract class TpvDeviceFactory {

    public abstract Keyboard getKeyboard();
    public abstract Display getDisplay();
    public abstract Communication getCommunication();
    public  abstract CardSwipper getCardSwiper();
    public abstract ChipReader getChipReader();
    public abstract Printer getPrinter();
    public static TpvDeviceFactory getFactory(SupportedTerminal supportedTerminal, CommunicationType communicationType){
        return switch (supportedTerminal){
            case INGENICO -> new IngenicoDeviceFactory(communicationType);
            case VERIFONE -> new Verifone240DeviceFactory(communicationType);
        };
    }

}

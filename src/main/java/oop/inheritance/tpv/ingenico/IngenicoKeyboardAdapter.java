package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Keyboard;
import oop.library.ingenico.services.IngenicoKeyboard;

public class IngenicoKeyboardAdapter implements Keyboard {
    private IngenicoKeyboard ingenicoKeyboard = new IngenicoKeyboard();
    @Override
    public String getChar() {
        return ingenicoKeyboard.getChar();
    }

    @Override
    public String readLine() {
        return ingenicoKeyboard.readLine();
    }
}

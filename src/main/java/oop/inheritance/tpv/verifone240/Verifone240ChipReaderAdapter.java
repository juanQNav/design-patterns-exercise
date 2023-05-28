package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.ChipReader;
import oop.library.ingenico.model.Card;
import oop.library.v240m.VerifoneV240mChipReader;

public class Verifone240ChipReaderAdapter implements ChipReader {
    VerifoneV240mChipReader chipReader = new VerifoneV240mChipReader();
    @Override
    public Card readCard() {
        return chipReader.readCard();
    }
}

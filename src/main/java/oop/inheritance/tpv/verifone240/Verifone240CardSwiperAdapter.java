package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.CardSwipper;
import oop.library.ingenico.model.Card;
import oop.library.v240m.VerifoneV240mCardSwipper;

public class Verifone240CardSwiperAdapter implements CardSwipper {
    VerifoneV240mCardSwipper cardSwipper = new VerifoneV240mCardSwipper();
    @Override
    public Card readCard() {
        return cardSwipper.readCard();
    }
}

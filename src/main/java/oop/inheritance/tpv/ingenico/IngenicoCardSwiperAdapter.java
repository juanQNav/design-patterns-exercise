package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.CardSwipper;
import oop.library.ingenico.model.Card;
import oop.library.ingenico.services.IngenicoCardSwipper;

public class IngenicoCardSwiperAdapter implements CardSwipper {
   IngenicoCardSwipper cardSwipper = new IngenicoCardSwipper();
    @Override
    public Card readCard() {
        return cardSwipper.readCard();
    }
}

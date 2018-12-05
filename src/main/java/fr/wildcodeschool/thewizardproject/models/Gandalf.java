package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thisisGandalf")
public class Gandalf implements WizardInterface {

    private Outfit outfit;

    @Autowired
    public Gandalf(Outfit theOufit) {
        outfit = theOufit;
    }

    @Override
    public String giveAdvice() {
        return "Gandalf, you should have a white beard and a long baton";
    }

    @Override
    public String changeDress() {
        return outfit.outfitDress();
    }
}

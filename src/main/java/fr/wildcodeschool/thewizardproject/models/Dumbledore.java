package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thisisDumbledore")
public class Dumbledore implements WizardInterface {
    private Outfit outfit;

    @Autowired
    public Dumbledore(Outfit theOufit) {
        outfit = theOufit;
    }

    @Override
    public String giveAdvice() {
        return "Dumbledore, you should have a white beard too and a hat";
    }

    @Override
    public String changeDress() {
        return outfit.outfitDress();
    }
}

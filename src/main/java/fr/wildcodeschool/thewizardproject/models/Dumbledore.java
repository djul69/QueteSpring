package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private Outfit outfit;

    public Dumbledore (Outfit theOufit){
        outfit=theOufit;
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

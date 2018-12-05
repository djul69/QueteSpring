package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
    private Outfit outfit;

    public Gandalf (Outfit theOufit){
    outfit=theOufit;
    }
    @Override
    public String giveAdvice(){
        return "Gandalf, you should have a white beard and a long baton";
    }

    @Override
    public String changeDress(){
        return outfit.outfitDress();
    }
}

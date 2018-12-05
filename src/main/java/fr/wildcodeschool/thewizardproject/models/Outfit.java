package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("outfit")
public class Outfit {

    public String outfitDress() {
        return "The wizard's dress is blue";
    }
}

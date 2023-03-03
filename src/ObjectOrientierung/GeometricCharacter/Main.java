package ObjectOrientierung.GeometricCharacter;

public class Main {
    public static void main(String[] args) {

        CharacterForm c1 = new CharacterForm("Kreis");
        CharacterForm c2 = new CharacterForm("Viereck");
        CharacterForm c3 = new CharacterForm("Quadrat");
        CharacterForm c4 = new CharacterForm("Wuerfel");


        Character ch1 = new Character();
        ch1.addCharacterForm(c1);
        ch1.addCharacterForm(c2);
        ch1.addCharacterForm(c3);
        ch1.addCharacterForm(c4);


        ch1.printNameOfCharacterForm();
        ch1.getArea();

    }


}

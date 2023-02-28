package ObjectOrientierung.GeometricCharacter;

public class Main {
    public static void main(String[] args) {

        CharacterForm c1 = new CharacterForm("Kreis", 0, 0, 0, 10);
        CharacterForm c2 = new CharacterForm("Viereck", 20, 15, 0, 0);
        CharacterForm c3 = new CharacterForm("Quadrat", 20, 20, 0, 0);
        CharacterForm c4 = new CharacterForm("Wuerfel", 15, 15, 15, 0);


        Character ch1 = new Character();
        ch1.addCharacterForm(c1);
        ch1.addCharacterForm(c2);
        ch1.addCharacterForm(c3);
        ch1.addCharacterForm(c4);

        ch1.printNameOfCharacterForm();
        ch1.getArea();

    }


}

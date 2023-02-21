package ObjectOrientierung.GeometricCharacter;
import java.util.ArrayList;
import java.util.List;

public class Character {
        private List<CharacterForm> characterForm;


        public Character() {
            this.characterForm = new ArrayList<>();
        }

        public void addCharacterForm(CharacterForm characterForm) {
            this.characterForm.add(characterForm);

        }

    public void printNameOfCharacterForm() {


        }
    }



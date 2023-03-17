package ObjectOrientierung.Phone;

public class Main {
    public static void main(String[] args) {

        SIM sim = new SIM(1, "+43 1234");
        SDCard card = new SDCard(5000, 10);
        Camera cam = new Camera(Camera.RESOLUTION.HIGH);

        Phone phone = new Phone("Red", sim, card, cam);

        Phonefile f1 = new Phonefile("jpg", 10001, "pic1");
        Phonefile f2 = new Phonefile("jpg", 10001, "pic1");
        Phonefile f3 = new Phonefile("jpg", 10001, "pic1");

        card.saveFiles(f1);
        card.saveFiles(f2);
        card.saveFiles(f3);

        f1.getInfo();

        card.getAllFiles();






    }
}

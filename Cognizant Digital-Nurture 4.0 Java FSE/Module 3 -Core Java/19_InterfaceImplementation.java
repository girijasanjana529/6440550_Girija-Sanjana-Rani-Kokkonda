// Define the Playable interface
interface Playable {
    void play();
}

// Guitar class implements the Playable interface
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

// Piano class implements the Playable interface
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        // Instantiate the Guitar and Piano objects
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call the play method for both classes
        guitar.play();
        piano.play();
    }
}

package src;

public class World {
    private String gameName;
    private String publisher;

    World() {
        gameName = "Forjd of Capybaras";
        publisher = "";
    }
    public World (String gameName, String publisher) {
        this.gameName = gameName;
        this.publisher = publisher;
    }
}

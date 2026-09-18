package Main8;

public class Main8 {
    public static void main(String[] args) {
        Personnage joueur1 = new Personnage("Tealyx", 100, 10);
        Personnage joueur2 = new Personnage("Xylaet", 50, 20);

        joueur1.afficheInfos();
        joueur2.afficheInfos();

        joueur1.subirDegats(25);
        joueur1.afficheInfos();
    }
    
}

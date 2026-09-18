package Main7;

public class Main7 {
    public static void main(String[] args) {
        Personnage joueur1 = new Personnage();

        joueur1.nom = "Tealyx";
        joueur1.vie = 100;
        joueur1.attaque = 10;
        
        Personnage joueur2 = new Personnage();

        joueur2.nom = "Xylaet";
        joueur2.vie = 50;
        joueur2.attaque = 50;

        joueur1.afficheInfos();
        joueur2.afficheInfos();
    }
    
}

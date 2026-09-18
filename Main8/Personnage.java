package Main8;

public class Personnage {
    String nom;
    int vie;
    int attaque;

    Personnage(String nom, int vie, int attaque) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
    }

    void afficheInfos() {
        System.out.println(nom + " possède "+ vie + " hp et à une attaque de " + attaque + " de dégats !");
    }

    void subirDegats(int degats) {
        this.vie = this.vie - degats;
        if (this.vie < 0) {
            this.vie = 0;
        }
    }
}

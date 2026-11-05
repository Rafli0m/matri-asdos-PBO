// 1. SUPERCLASS (CLASS INDUK)
class KarakterGame {
    String nama;     // Atribut 1: Nama karakter
    int hp;          // Atribut 2: Health Point (Darah)
    int attackPoint; // Atribut 3: Attack Point (Kekuatan Serangan)

    // Method umum milik Class Induk (diwariskan ke semua class anak)
    void infoKarakter() {
        System.out.println("Nama Hero    : " + nama);
        System.out.println("HP (Darah)   : " + hp);
        System.out.println("Attack Point : " + attackPoint);
    }
}

// 2. SUBCLASS 1 (CLASS ANAK PERTAMA - WARRIOR)
class Warrior extends KarakterGame {
    int defense; // Atribut 4 (Khusus Warrior): Poin pertahanan / armor

    void statusWarrior() {
        // 'hp' langsung bisa dipakai karena diwarisi dari class KarakterGame
        int totalHp = hp + defense;
        System.out.println("Defense      : " + defense);
        System.out.println("Total HP     : " + totalHp);
    }
}

// 3. SUBCLASS 2 (CLASS ANAK KEDUA - MAGE)
class Mage extends KarakterGame {
    int mana; // Atribut 4 (Khusus Mage): Poin kekuatan sihir (Mana)

    void statusMage() {
        // 'attackPoint' langsung bisa dipakai karena diwarisi dari class KarakterGame
        int totalAttack = attackPoint + mana;
        System.out.println("Mana (Sihir) : " + mana);
        System.out.println("Total Attack : " + totalAttack);
    }
}

// 4. CLASS UTAMA (MAIN)
public class LatihanGame {
    public static void main(String[] args) {
        System.out.println("=== STATUS HERO 1: WARRIOR ===");
        Warrior hero1 = new Warrior();
        hero1.nama = "Tigreal";       // Warisan dari KarakterGame
        hero1.hp = 1000;              // Warisan dari KarakterGame
        hero1.attackPoint = 120;      // Warisan dari KarakterGame
        hero1.defense = 300;          // Atribut khusus Warrior

        hero1.infoKarakter();         // Method warisan KarakterGame
        hero1.statusWarrior();        // Method khusus Warrior

        System.out.println("\n=== STATUS HERO 2: MAGE ===");
        Mage hero2 = new Mage();
        hero2.nama = "Eudora";        // Warisan dari KarakterGame
        hero2.hp = 650;               // Warisan dari KarakterGame
        hero2.attackPoint = 200;      // Warisan dari KarakterGame
        hero2.mana = 150;             // Atribut khusus Mage

        hero2.infoKarakter();         // Method warisan KarakterGame
        hero2.statusMage();           // Method khusus Mage
    }
}

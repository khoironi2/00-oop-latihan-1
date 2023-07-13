package com.tutorial;

class Prajurit{
    String nama;
    int umur;

    Senjata senjata;
    Pelindung pelindung;

    Prajurit(String nama, int umur){
        this.nama= nama;
        this.umur= umur;
    }
    void EquipSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    void EquipPelindung(Pelindung pelindung){
        this.pelindung = pelindung;
    }

    void serang(Prajurit lawan){
        double attack = senjata.attackPower;
        System.out.println("\n" + this.nama + " Menyerang > " + lawan.nama + " Attack Power : " + attack);
        lawan.menangkis(attack);
    }

    void menangkis(double attackPower){
        double damage;
        if(this.pelindung.defencePower > attackPower){
            damage = this.pelindung.defencePower - attackPower;
        }else{
            damage = 0;
        }
        System.out.println("\n" + this.nama + " kerusakan : " + damage);
    }

    void display(){
        System.out.println("\nNama : " + nama);
        System.out.println("Umur : " + umur);
        this.senjata.display();
        this.pelindung.display();
    }
}

class Senjata{
    String nama;
    double attackPower;

    Senjata(String nama, double attackPower){
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Senjata : " + this.nama + "\nAttack Power : " + this.attackPower);
    }
}

class Pelindung{
    String nama;
    double defencePower;

    Pelindung(String nama, double defencePower){
        this.nama = nama;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Pelindung : " + this.nama + "\nDefence Power : " + this.defencePower);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Prajurit prajurit1 = new Prajurit("Khoironi",22);
        Prajurit prajurit2 = new Prajurit("Nadea",22);

        Senjata celurit = new Senjata("celurit",5);
        Senjata ketapel = new Senjata("ketapel",3);

        Pelindung bajubesi = new Pelindung("Baju Besi ",7);
        Pelindung kertas = new Pelindung("Kertas",2);

        // prajurit1.display();

        prajurit2.EquipSenjata(celurit);
        prajurit2.EquipPelindung(bajubesi);
        prajurit2.display();

        prajurit1.EquipSenjata(ketapel);
        prajurit1.EquipPelindung(kertas);
        prajurit1.display();

        prajurit2.serang(prajurit1);
        System.out.println("\n");
        prajurit1.serang(prajurit2);

    }
}

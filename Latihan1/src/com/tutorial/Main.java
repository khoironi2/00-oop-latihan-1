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

    void display(){
        System.out.println("Nama : " + nama);
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

        Senjata celurit = new Senjata("celurit",21);
        Senjata ketapel = new Senjata("ketapel",21);

        Pelindung bajubesi = new Pelindung("Baju Besi ",12.7);
        Pelindung kertas = new Pelindung("Kertas",0);

        // prajurit1.display();

        prajurit1.EquipSenjata(ketapel);
        prajurit1.EquipPelindung(bajubesi);
        prajurit1.display();

    }
}

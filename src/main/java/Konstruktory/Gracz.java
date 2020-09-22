package Konstruktory;

import javafx.beans.property.SimpleStringProperty;
import sun.awt.X11.XPropertyCache;

public class Gracz {
 private int nr;
 private String name;
 private String description;

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gracz() { }
    public Gracz(int nr, String name, String descritpion)
    {
        this.nr = nr;
        this.name = name;
        this.description = descritpion;
    }

    // Konstruktor przeciazony, czyli taki ktory ma taka sama nazwe co klasa, tylko z taka roznica, ze przy tworzeniu obiektu, mozna ustawic wartosci dla pol/wlasciwosci
    public Gracz(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // Konstruktor kopiujacy - przydaje sie przy edycji kiedy przekazuje  oryginalny ovuekt do edycji, /stworzylam obiek ti chce zeby nowy ten samej klasy mial wartosci tego 1 obiektu/
    public  Gracz(Gracz gracz)
    {
        // Sprawdza czy gracz nie jest nullem, jak jest to wychodzi i pozostawia nowy obiekt z pustymi polami
        if(gracz == null)
            return;

        // jesli gracz nie jest nullem to przypisuje nowe wartosci z przekazanego gracza w parametrze
        this.nr = gracz.getNr(); // gracz.nr
        this.name = gracz.getName();
        this.description = gracz.getDescription();
    }

    public void KopiaGracza(Gracz nowy, Gracz oryginal)
    {
        if(oryginal == null)
            return;

        if(nowy== null) {
            nowy = new Gracz(oryginal);
            return;
        }

        nowy.setNr(oryginal.getNr());
        nowy.setName(oryginal.getName());
        nowy.setDescription(oryginal.getDescription());
    }
}

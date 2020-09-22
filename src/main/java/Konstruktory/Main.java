package Konstruktory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Gracz.class);

        List<Gracz> gracze = new ArrayList<Gracz>();
        gracze.add(new Gracz(1, "gracz 1", "opis 1"));
        gracze.add(new Gracz(2, "gracz 2", "opis 2"));
        gracze.add(new Gracz(3, "gracz 3", "opis 3"));

        //kopiujacy uzycie przypisuje wartosci z gracza2 do nowo utworzonego .
        Gracz gracz2 = gracze.get(1);
        Gracz nowyGracz = null;
        if(gracz2 != null)
            nowyGracz = new Gracz(gracz2);
//koniec
        String desc = nowyGracz.getDescription();

        Gracz gracz = new Gracz();
        gracz.setName("name");
        gracz.setNr(2);
        gracz.setDescription("oopis");

        gracze.add(gracz);
    }
}

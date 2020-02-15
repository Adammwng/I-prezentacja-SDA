package string;

import java.util.Arrays;

public class Exercise {
    //Napisz program, który:
    //Z literału:
    //"Monday ;Tuesday; Wednesday;Thursday;Friday Saturday;Sunday
    //Stworzy tablicę z nazwami tygodnia po angielsku
    //Usunie niepotrzebne spcje na początku/końcu każdego elementu tablicy
    //Zliczy liczbę dni zaczynających się od litery T
    //Zliczy liczbę dni kończących się na sday
    //Zamieni wszystkie małe litery w drugim i trzecim elemencie tablicy na wielkie
    //Zamieni wszystkie wielkie litery w pierwszym i czwartym elemencie tablicy na małe
    //Zamieni wszystkie wystąpienia małej lub wielkiej litery S na znak $
    //Na koniec niech wypisze zawartość tablicy na ekran
    public static void main(String[] args) {
        String days = "Monday ;Tuesday; Wednesday;Thursday;Friday; Saturday;Sunday";

        System.out.println(days);
        days = days.replace("S" ,"$");
        days = days.replace("s" ,"$");
        String[] tablica = days.split(";");

        for (String s : tablica) {
            System.out.println(s.trim());
            if (s.startsWith("T")){
            System.out.println(s);
            }
            if(s.endsWith("sday")){
                System.out.println(s);
            }
            s.replace("S", "$");
        }
        System.out.println(Arrays.toString(tablica));
        tablica[2] = tablica[2].toUpperCase();
        tablica[3] = tablica[3].toUpperCase();
        tablica[1] = tablica[1].toLowerCase();
        tablica[4] = tablica[4].toLowerCase();
        System.out.println(Arrays.toString(tablica));
    }
}


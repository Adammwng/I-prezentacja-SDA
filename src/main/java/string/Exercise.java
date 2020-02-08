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
        String [] tablica = days.split(";");
        for (String s : tablica){
            System.out.println(s);
        }
    }
}


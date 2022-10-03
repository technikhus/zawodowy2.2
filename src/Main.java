import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Wylosowana lista:");
        ArrayList<Integer> wylosowane = wylosujListe();
        System.out.println(wylosowane);

        Scanner klawiatyra = new Scanner(System.in);
        int szukanaWaetosc = klawiatyra.nextInt();
        int indeks = wuszukajElement(szukanaWaetosc, wylosowane);



        if(indeks == wylosowane.size()-1){
            System.out.println("Elementu niema w tablicy " + wylosowane);
        } else {
            System.out.println("Element jest w tablicy pod inseksem " + indeks);
        }

    }

    public static  ArrayList<Integer> wylosujListe(){
        ArrayList<Integer> wylosowane = new ArrayList<>();
        for(int i = 0; i<50; i++){
            int liczba = (int)(Math.random()*100+1);
            wylosowane.add(liczba);
        }
        return wylosowane;
    }


    /**
     * nazwa funkcji : wyszukajElement
     * argumenty: element : przechowuje szukaną wartość typu int
     *            wylosowane : przechowuje listę w której szukamy elementu
     * typ zwracany : int, indeks pierwszej znalezionej wartości element w liście wylosowane
     * informacje : funkcja zwraca pierwszy indeks wystąpienia wartości szukanej w liście
     * autor : 000000000000000000 (pesel!!!!!!!)
     */

    public static  int wuszukajElement(int element, ArrayList<Integer> wylosowane){
        wylosowane.add(element);

        for(int i=0; i<wylosowane.size(); i++){
            if (wylosowane.get(i) == element){
                return i;
            }
        }
        return 0;
    }
}
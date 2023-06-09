/*
* Il programma deve chiedere il nome del regalo da inserire in lista e salvarlo in un ArrayList (finchè l’utente non decide di fermarsi).
Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare aggiungendo un nuovo regalo.
Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.
Bonus:santa: : salvare la lista su file e recuperarla quando si avvia il programma!
* */

package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listaRegali = new ArrayList<>();


        boolean stop;
        do {
            System.out.print("Che regalo vuoi inserire nella lista?: ");
            String regalo = scan.nextLine();
            listaRegali.add(regalo);
            System.out.println("La lista è composta da " + listaRegali.size() + " regali");
            System.out.print("Vuoi inserire un altro regalo? (s/n): ");
            stop = scan.nextLine().equalsIgnoreCase("s");
        } while (stop);

        Collections.sort(listaRegali);
        System.out.println("La lista regali è: " + listaRegali);
    }
}

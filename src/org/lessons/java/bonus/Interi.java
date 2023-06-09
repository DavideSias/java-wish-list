/*Vogliamo realizzare una classe che contenga un elenco d'interi e che ci permetta di ciclarli (dal primo all’ultimo). Dovrà offrire due metodi:
int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato.
Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
La classe deve avere un costruttore che prende come parametro un array d'interi (che sarà l’elenco che viene gestito internamente)
Internamente alla classe vogliamo mantenere l’elenco d'interi come array, no ArrayList o simili.
Bonus: prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
Buon lavoro!*/


package org.lessons.java.bonus;

public class Interi {
    private int counter = 0;
    private int elements = 0;
    private int[] numbers;

    public Interi(int[] numbers) {
        this.numbers = numbers;
    }

    public Interi(){
        this.numbers = new int[elements];
    }

    public int getElementoSuccessivo(){
        if (hasAncoraElementi()){
            this.counter++;
            return this.numbers[counter - 1];
        }
        return 0;
    }

    public boolean hasAncoraElementi(){
        if (counter < numbers.length){
            return true;
        } else {
            return false;
        }
    }

    /*public void addElemento(int element){
        this.elements++;
        numbers = new int[elements];
        numbers[elements] = element;
    }*/
}

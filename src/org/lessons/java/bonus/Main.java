package org.lessons.java.bonus;

public class Main {
    public static void main(String[] args) {
        int[] numeri = {0,1,2,3,4,5};
        Interi classNumeri = new Interi(numeri);

        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.hasAncoraElementi());
        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.getElementoSuccessivo());
        System.out.println(classNumeri.hasAncoraElementi());


        /*Interi prova = new Interi();
        prova.addElemento(10);
        prova.addElemento(50);
        prova.addElemento(30);
        System.out.println(prova.getElementoSuccessivo());
        System.out.println(prova.getElementoSuccessivo());
        System.out.println(prova.getElementoSuccessivo());*/
    }
}

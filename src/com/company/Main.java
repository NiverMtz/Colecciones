package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*String universidades[] = new String[]{"UNAM", "IPN", "UAM", "ITAM", "TEC"};

        for (String e : universidades
             ) {
            System.out.println(e);
        }*/

        /*Set<String> frutas = new HashSet(4);
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Limón");
        frutas.add("Lima");

        System.out.println(">>> HashSet <<<\n");
        for (String fruta :frutas
             ) {
            System.out.println(fruta);
        }

        System.out.println("-------------------------------");

        Set<String> frutas2 = new TreeSet();
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Limón");
        frutas2.add("Lima");

        System.out.println(">>> TreeSet <<<\n");
        for (String fruta :frutas2
        ) {
            System.out.println(fruta);
        }

        System.out.println("-------------------------------");

        Set<String> frutas3 = new LinkedHashSet(4);
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Limón");
        frutas3.add("Lima");

        System.out.println(">>> LinkedHashSet <<<\n");
        for (String fruta :frutas3
        ) {
            System.out.println(fruta);
        }*/


        /*System.out.println("--------- Niver Martínez ----------");
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));*/

        /*List<String> frutas4 = new ArrayList();
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Limón");
        frutas4.add("Lima");

        System.out.println(">>> ArrayList <<<\n");
        for (String fruta: frutas4
             ) {
            System.out.println(fruta);
        }

        System.out.println(frutas4.get(4));
        int indice = frutas4.indexOf("Limón");
        System.out.println(indice);
        System.out.println("-------------------------------");

        List<String> frutas5 = new LinkedList();
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Limón");
        frutas4.add("Lima");

        System.out.println(">>> LinkedList <<<\n");
        for (String fruta: frutas5
        ) {
            System.out.println(fruta);
        }
        System.out.println("-------------------------------");*/

        Map<Integer, String> universidades = new HashMap<Integer, String>();
        universidades.put(1, "UNAM");
        universidades.put(2, "IPN");
        universidades.put(3, "UAM");
        universidades.put(4, "TEC");
        universidades.put(5, "ITAM");

        System.out.println(">>> HasMap <<<\n");
        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

        System.out.println(universidades.get(3));

        System.out.println("-------------------------------");
    }
}

package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //region Demo

    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     * <p>
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     * <p>
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: " + input);
    }
    //endregion

    //region Úlohy na cykly

    /**
     * Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     * <p>
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        boolean isNegative = false;
        while (!isNegative) {
            int input = Support.safeReadInt();
            if (input < 0) isNegative = true;
        }

    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     *
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
    public static int sumAllInputUntilNegative() {
        int sumPositives = 0;
        boolean isPositive = true;
        while (isPositive) {
            int input = Support.safeReadInt();
            if ((input > 0)) {
                sumPositives += input;
            } else {
                isPositive = false;
            }

        }
        return sumPositives;
    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     *
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
    public static List<Integer> storeAllInputInArrayListUntilNegative() {
        boolean isPositive = true;
        List<Integer> inputList = new ArrayList<>();

        while (isPositive) {
            int input = Support.safeReadInt();
            if (input > 0) {
                inputList.add(input);
            } else {
                isPositive = false;
            }
        }
        return inputList;
    }

    /**
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
     *
     * @param list List čísel, která se mají vypsat.
     */

    public static void fillList(List<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void printAllIntegersFromList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }

    /**
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     *
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int sumOfNum = 0;

        for (int i = 0; i <= list.size() - 1; i++) {
            int sumListNum = list.get(i);
            sumOfNum += sumListNum;

        }
        return sumOfNum;
    }

    //endregion

    //region Podmínky

    /**
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     *
     * @param list  Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) < limit) System.out.println(list.get(i));
        }
    }

    /**
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one",
     * - číslo 2 slovem "two",
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2],
     * vypíše: 5, three, one, 48, two.
     *
     * @param list Seznam čísel, která se mají vypsat.
     */
    public static void printIntegersWithReplace(List<Integer> list) {

        for (int i = 0; i <= list.size() - 1; i++) {

            if (list.get(i) == 1) {
                System.out.println("one");
            } else if (list.get(i) == 2) {
                System.out.println("two");
            } else if (list.get(i) == 3) {
                System.out.println("three");
            } else {
                System.out.println(list.get(i));
            }
    }
}
// Hraní se switch ... nechápu proč musí být switch (i + 1) a nestačí switch (i)

//        for (int i = 0; i <= list.size() - 1; i++)
//
//            switch (i + 1) {
//                case 1:
//                    if (list.get(i) == 1) System.out.println("one");
//                case 2:
//                    if (list.get(i) == 2) System.out.println("two");
//                case 3:
//                    if (list.get(i) == 3) System.out.println("three");
//                default:
//                    if (list.get(i) > 3) System.out.println(list.get(i));
//            }
//    }

    //endregion

    public static void main(String[] args) {
        // Příklad:
//        System.out.println("--- Example - read and print one integer ---");
//        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
//        System.out.println("--- Task 2 - sum all integers until negative ---");
//        System.out.println("Total sum: " + sumAllInputUntilNegative());
//        // ---
//        System.out.println("--- Task 3 - read integers to list until negative ---");
//        List<Integer> list = storeAllInputInArrayListUntilNegative();
//        System.out.println(list);
//        // ---

        List<Integer> list = new ArrayList<Integer>();
        fillList(list);

//        System.out.println("--- Task 4 - print all integers from list ---");
//        printAllIntegersFromList(list);
//        // ---
//        System.out.println("--- Task 5 - sum all integers in list ---");
//        System.out.println("Total sum: " + sumAllIntegersFromList(list));
//        // ---
//        System.out.println("--- Task 6 - print integers under 5 from list ---");
//        printIntegersUnderLimit(list, 9);
//        // ---
//        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
//        printIntegersWithReplace(list);
    }
}
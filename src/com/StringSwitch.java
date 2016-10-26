package com;

/**
 * Created by RUSLAN77 on  26.10.2016 in Ukraine
 */
// Использование строк для управления оператором switch
class StringSwitch {
    public static void main(String args[]) {
        String command = "cancel";
        switch (command) {
            case "connect":
                System.out.println("Пoдключeниe");
                break;
            case "cancel":
                System.out.println("Oтмeнa");
                break;
            case "disconnect":
                System.out.println("Oтключeниe");
                break;
            default:
                System.out.println("Heвepнaя команда!");
                break;
        }
    }
}
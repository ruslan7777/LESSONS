/**
 * Created by RUSLAN77 on 26.07.2016.
 */
public class Help3 {
    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;

        for (; ; ) {
        do {
            System.out.println("Help:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" З. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println(" 6. break\n");
            System.out.println(" 7. continue\n");

            System.out.print("Choice (q-escape): ");

            choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }
            while (choice < '1' | choice > '7' & choice != 'q') ;

            if(choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Operator if:\n");
                    System.out.println("if (condition) operator");
                    System.out.println("else operator");
                    break;
                case '2':
                    System.out.println("Operator switch:\n");
                    System.out.println("switch (condition) {");
                    System.out.println("case constant");
                    System.out.println("operator sequence");
                    System.out.println("break");
                    System.out.println("//...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Operator for:\n");
                    System.out.print("for(initialization; condition; iteration)");
                    System.out.println(" operator;");
                    break;
                case '4':
                    System.out.println("Operator while:\n");
                    System.out.println("while(condition) operator;");
                    break;
                case '5':
                    System.out.println("Operator do-while:\n");
                    System.out.println("do {");
                    System.out.println(" operator;");
                    System.out.println("} while (condition);");
                    break;
                case '6':
                    System.out.println("Oпepaтop break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Oпepaтop continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;

            }
            System.out.println();
        }
    }
}


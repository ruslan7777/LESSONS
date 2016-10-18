/**
 * Created by RUSLAN77 on  18.10.2016 in Ukraine
 Следует, однако, иметь в виду одну важную особенность разновидности for-each
 цикла for. Итерационная переменная в этом цикле обеспечивает только чтение элементов
 массива, но ее нельзя использовать для записи значения в какой-либо элемент
 массива.
 */
public class NoChange {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x + 10; // Эта операция не изменяет содержниммое массива nums  !!!!!!!
        }
        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String args[]) {
        int n = 0;
        int ent = 0;
        float sum = 0;

        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите Количество элементов коллекции: ");
            n = console.nextInt();
            System.out.println("Введите элементы массива: ");
            ArrayList<Float> Alist = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                Alist.add(i, console.nextFloat());;
            }
            System.out.println("Введите элемент который хотите заменить, нумерация начинается с 0: ");
            ent = console.nextInt();
            console.close();
            System.out.print("Исходная коллекция: ");
            System.out.println(Alist);
            System.out.println();
            for (int g = 0; g < ent; g++) {
                sum = sum + Alist.get(g);
            }
            sum = sum / (ent);
            LinkedList<Float> Alistredo = new LinkedList<>();
            Alistredo.addAll(Alist);
            if ((ent <= n) & (ent > 0)) {
                Alistredo.set(ent, sum);
                System.out.print("Итоговая коллекция: ");
                System.out.println(Alistredo);
            } else {
                System.out.println("Введён элемент не соответветсвующий диапазону коллекции или была произведена попытка замены первого элемента.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных, попробуйте ещё раз предварительно перезапустив программу.");
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }
    static void task1() {
        int sum1 = 0, sum2 = 0;
        ArrayList<Integer> numArray = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел на бумажке: ");
        int n = scan.nextInt();
        System.out.println("Введите число операций: ");
        int k = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите цифру номер " + (i + 1) + " :" + " ");
            numArray.add(i, scan.nextInt());
        }
        for (int i = 0; i < numArray.size(); i++) {
            sum1 = numArray.get(i) + sum1;
        }
        for (int i = 0; i < k; i++) {
            numArray.set(numArray.indexOf(Collections.min(numArray)), 9);
        }
        for (int i = 0; i < numArray.size(); i++) {
            sum2 = numArray.get(i) + sum2;
        }
        System.out.println("Максимальная разность между конечной и начальной суммой: " + (sum2 - sum1));
    }
}

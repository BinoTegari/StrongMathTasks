import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }



    static void task2() {

        long count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Число l : ");
        long l = scan.nextLong();
        System.out.println("Число r : ");
        long r = scan.nextLong();
        for(long i=l;i<=r;i++){
            l +=1;
            if(repeatingNumbers(l)){
                count++;
            }
        }
        System.out.println("Число тестов, которые может сделать Саша : "+count);
    }

    private static boolean repeatingNumbers(long number) {
        int j = 0;
        ArrayList<Long> array = new ArrayList<>();
        do {
            array.add(number % 10);
            number /= 10;
        } while (number > 0);
        Collections.reverse(array);
        for (Long aLong : array) {
            if (aLong.equals(array.get(0))) {
                j++;
            }
        }
        return j == array.size();
    }
}

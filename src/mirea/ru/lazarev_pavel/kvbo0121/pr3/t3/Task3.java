package mirea.ru.lazarev_pavel.kvbo0121.pr3.t3;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[4];
        boolean flag = true;

        for (int i=0;i<4;i++){
            arr[i] = rand.nextDouble(10,99);
        }
        for (int i=0;i<3;i++){
            if (!(arr[i] < arr[i + 1])) {
                flag = false;
                break;
            }
        }
        for (int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        System.out.print("ascending sequence? "+flag);
    }
}

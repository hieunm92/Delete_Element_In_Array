import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap do dai mang: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= random.nextInt(10)+1;
            System.out.print(array[i] + " , ");
        }
        System.out.println("Nhap gia tri can xoa: ");
        int X = sc.nextInt();
        int index;
        for (int i = 0; i < size; i++) {
            if (array[i] == X){
                index = i;
                for (int j = index; j < array.length - 1; j++) {
                    array[i]= array[j+1];
                    if ((j+1) == array.length-1){
                        array[array.length-1] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " , ");
        }
    }

}

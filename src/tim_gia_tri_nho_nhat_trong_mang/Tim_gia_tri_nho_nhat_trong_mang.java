package tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập một số:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println(" không được vượt quá 20 số");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sách số: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nGiá trị nhỏ nhất trong danh sách là " + min + " ,tại vị trí " + index);
    }
}

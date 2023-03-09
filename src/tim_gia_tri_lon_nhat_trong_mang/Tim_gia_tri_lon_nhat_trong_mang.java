package tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập một sô:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println(" không được vượt quá 20 so");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sách so: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị  lớn nhất trong danh sách là " + max + " ,tại vị trí " + index);
    }
}
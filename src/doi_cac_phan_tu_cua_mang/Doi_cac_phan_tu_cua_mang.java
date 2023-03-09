package doi_cac_phan_tu_cua_mang;

import java.util.Scanner;

public class Doi_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);

        // yêu cầu người dùng nhập kích thước của mảng
        do {
            System.out.print("Nhập một kích thước: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20);

        // nhập giá trị của các phần tử trong mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // in ra mảng đã nhập
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // in ra mảng sau khi đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

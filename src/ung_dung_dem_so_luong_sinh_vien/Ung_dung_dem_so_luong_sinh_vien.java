package ung_dung_dem_so_luong_sinh_vien;
import java.util.Scanner;
public class Ung_dung_dem_so_luong_sinh_vien {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        // Step 1: Enter the size of the array
        do {
            System.out.print("Nhập  kích thước:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);

        // Step 2: Enter marks for each student
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // Step 3: Display the marks and count the number of students who pass the exam
        int count = 0;
        System.out.print("Danh sách đánh dấu: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("Số học sinh thi đạt là " + count);

        scanner.close();
    }

}


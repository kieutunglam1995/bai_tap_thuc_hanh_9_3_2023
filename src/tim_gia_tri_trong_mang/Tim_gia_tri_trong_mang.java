package tim_gia_tri_trong_mang;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"lam", "thang", "men", "ngan", "khoa", "tan", "nhan", "tuan anh", "tuan", "mai"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten hoc sinh:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                    System.out.println("Vị trí của sinh viên trong danh sách " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}

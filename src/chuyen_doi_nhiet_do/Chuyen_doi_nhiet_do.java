package chuyen_doi_nhiet_do;
import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("mục.");
            System.out.println("1. độ F sang độ C");
            System.out.println("2. độ C đến độ F");
            System.out.println("0. thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("độ F sang độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("độ C đến độ F   : " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}


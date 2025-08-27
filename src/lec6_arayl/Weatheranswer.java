package lec6_arayl;

import java.util.*;

public class Weatheranswer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days ' temperetures? ");
        int days = console.nextInt();

        int[] temps = new int[days];  //khai bao ngay
        int sum = 0;

        for (int i = 0; i < days; i++) {
            System.out.print("Day" + i + 1 + " 's high temp: ");
            temps[i] = console.nextInt();   //Khai bao gia tri mang
            sum += temps[i];
        }
        double average = (double) sum / days;  //Tinh trung binh cong
        int count = 0;  //Trung binh cong =0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average); //Printf(" chuoi dinh dang,danh sach tham so");
        System.out.println("");
        System.out.println(count + " days above average");
    }
}

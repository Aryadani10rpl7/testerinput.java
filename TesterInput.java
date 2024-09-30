package Persewaan;

import java.util.Scanner;;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih CD atau DVD?");
        String pilihan = in.next();
        if (pilihan.equals("CD")) {
            System.out.println("Inputkan Nama CD: ");
            String name = in.nextLine();
            System.out.println("Inputkan Nama Artist: ");
            String artist = in.nextLine();
            System.out.println("Inputkan Nama Label: ");
            String label = in.nextLine();
            System.out.println("Inputkan numbernya: ");
            int number = in.nextInt();
            System.out.println("Inputkan Quantity: ");
            int quantity = in.nextInt();
            System.out.println("Inputkan TotalSong: ");
            int totalSong = in.nextInt();
            System.out.println("Inputkan Price: ");
            double price = in.nextDouble();

            CD cd1 = new CD(number, name, quantity, price, artist, totalSong, label);
            cd1.print();
        } else if(pilihan.equals("DVD")) {
            System.out.println("Inputkan Nama DVD: ");
            String name = in.nextLine();
            System.out.println("Inputkan Nama Studio: ");
            String studio = in.nextLine();
            System.out.println("Inputkan Rating Usia: ");
            String ratingUsia = in.nextLine();
            System.out.println("Inputkan Number: ");
            int number  = in.nextInt();
            System.out.println("Inputkan Quantity: ");
            int quantity  = in.nextInt();
            System.out.println("Inputkan lenght: ");
            int lenght  = in.nextInt();
            System.out.println("Inputkan Price: ");
            double price = in.nextDouble();

            DVD dvd1 = new DVD( number,  name,  quantity,  price, lenght,  ratingUsia,  studio);
            dvd1.print();
        }
    }

}

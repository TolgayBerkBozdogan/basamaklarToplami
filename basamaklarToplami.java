import java.util.Scanner;

public class basamaklarToplami {
    public static void main(String[] args) {
        int number, i = 1, tempNumber, digit, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();

        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            i++;
        }

        tempNumber = number;
        int b = 0;
        while (b != i) {
            digit = tempNumber % 10;
            total += digit;
            b++;
            tempNumber /= 10;

        }
        System.out.println(number + " sayısının rakamları toplamı: " + total);

    }
}


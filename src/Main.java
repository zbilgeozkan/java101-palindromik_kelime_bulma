
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Çıkmak için 'çıkış' yazınız.");

        while (true) {
            String reverse = "";
            System.out.print("Lütfen bir kelime giriniz: ");
            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();

            if (word.equals("çıkış")) {
                break;
            }
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.print("Sonuç: ");
            if (word.equals(reverse)) {
                System.out.println("Bu kelime palindromdur. ");
            }
            else {
                System.out.println("Bu kelime palindrom değildir. ");
            }

        }

    }
}
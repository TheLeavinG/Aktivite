import java.util.Scanner;
public class Sicaklik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sicaklik;

        System.out.print("Lutfen Gunun Sicakligini Giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik <= 5) {

            System.out.println("Bugun Kayak Yapabilirsin!");
        }

        else if (sicaklik > 5 && sicaklik <= 15 ) {

            System.out.print("Bugun Sinemaya Gidebilirsin!");

        }

        else if (sicaklik > 15 && sicaklik <= 25 ) {

            System.out.print("Bugun Piknik Yapabilirsin!");
        }

        else if (sicaklik > 25 ) {

            System.out.print("Bugun Yuzmeye Gidebilirsin!");

        }






    }

}

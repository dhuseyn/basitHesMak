import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //iki sayı girin
        double a, b, sonuc ;

        System.out.print("1. Sayiyi Giriniz : ");
        Scanner inp = new Scanner(System.in);
        a = inp.nextDouble();
        System.out.print("2. Sayiyi Giriniz : ");
        b = inp.nextDouble();

        // Dört işlemden birini seçiniz

        int operator;

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n\nIslemi Seciniz : ");
        Scanner input = new Scanner(System.in);
        operator = input.nextInt();

        switch (operator){
            case 1:
            sonuc = (a + b);
            System.out.print("Isleminizin sonucu : "+sonuc);
            break;

            case 2:
            sonuc = (a - b);
            System.out.print("Isleminizin sonucu : "+sonuc);
            break;

            case 3:
            sonuc = (a * b);
            System.out.print("Isleminizin sonucu : "+sonuc);
            break;

            case 4:
            sonuc = (a / b);
            System.out.print("Isleminizin sonucu : "+sonuc);
            break;

            default:
            System.out.println("Hatalı Giris Yaptiniz");


        }


    }
}
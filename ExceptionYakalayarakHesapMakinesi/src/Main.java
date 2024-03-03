import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar giriniz.");
    }
}

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************************");
            String islemler = "1. Toplama işlemi\n"
                    + "2. Çıkarma işlemi\n"
                    + "3. Çarpma işlemi\n"
                    + "4. Bölme işlemi";
            System.out.println(islemler);
            System.out.println("******************************");
            System.out.print("İşlemi Seçiniz:");
            String islem = scanner.nextLine();
            int a;
            int b;
            try {


                switch (islem) {
                    case "1"://string tanımladık tırnak gerekiyor
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Toplamları:" + (a + b));
                        break;

                    case "2":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Çıkarmaları:" + (a - b));
                        break;

                    case "3"://string tanımladık tırnak gerekiyor
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        if (a > 10000 && b > 10000) {
                            throw new CarpmaException();
                        }
                        System.out.println("Çarpımları:" + (a * b));
                        break;

                    case "4":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Bölmeleri:" + ( (float) a / b));
                        break;
                    default://else gibi bi durum default
                        System.out.println("Geçersiz İşlem");

                }
            } catch (ArithmeticException e) {
                System.out.println("Bir sayı sıfıra bölünemez");
            } catch (InputMismatchException e) {
                System.out.println("Lütfen Inputları Doğru Formatta Giriniz.");
            } catch (CarpmaException e) {
                e.printStackTrace();
            }

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu KG Cinsinden Giriniz : ");
        kilo = input.nextDouble();

        double vke = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + vke);

    }
}
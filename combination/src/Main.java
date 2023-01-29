import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kombinasyon hesabı yapan programa hoşgeldiniz.\n");
        System.out.println("Kombinasyon tanımı : N elemanlı bir kümenin elemanları" +
                "\nile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li " +
                "\nkombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.\n");
        System.out.println("Kombinason formülü : C(n,r) = n! / (r! * (n-r)!)\n");

        int n,r, factorieln = 1, factorielr = 1, factorielnr = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kombinasyonunu hesaplamak istediğiniz küme kaç elemanlı : ");
        n = inp.nextInt();

        System.out.print("Farklı grupların sayısı kaç elemanlı : ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++){
            factorieln *= i;
        }
        for (int j = 1; j <= r; j++){
            factorielr *= j;
        }
        factorielnr *= (n-r);
        System.out.println("n elemanlı bir kümenin r elemanlı kombinasyonu : ");
        System.out.println("C(n,r) = n!/(r!*(n-r)! : " + (factorieln / (factorielr*(factorielnr))));
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c, islem; //değişkenlerimizi tanımllıyoruz

        //kullanıcıdan verilerimizi alıyoruz
        Scanner input=new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz : ");
        a=input.nextInt();
        System.out.println("1. Sayıyı Giriniz : ");
        b=input.nextInt();
        System.out.println("1. Sayıyı Giriniz : ");
        c=input.nextInt();

        islem=a+b*c-b;//işlemlerimizi yapıyoruz
        System.out.println("İşlem Sonucunuz: "+ islem  ); //sonucu ekrana yazdırıyoruz
    }
}
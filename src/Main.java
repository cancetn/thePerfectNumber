import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.


        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
          değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.


          Mükemmel Sayı Nedir ?
          Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        int sayi, bolen=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz = ");

        sayi = inp.nextInt();

        for(int i =1; i<sayi;i++){
            if(sayi % i == 0){
                bolen+= i;
            }
        }

        if(bolen == sayi ){
            System.out.println(sayi+" Mukemmel sayidir");
        }else{
            System.out.println(sayi+" Mukemmel sayi degildir");
        }





    }
}

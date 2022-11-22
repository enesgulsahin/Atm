import java.util.Scanner;
public class Atm {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem = Bakiye Öğrenme\n2.İşlem = Para Çekme\n3.İşlem = Para Yatırma\nÇıkış = q";
        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("*****************");
            while(true){
                System.out.print("İşlem Seçiniz : ");
                String islem = inp.nextLine();
                if(islem.equals("q")){
                 System.out.println("Programdan Çıkılıyor");
                break;
                }else if(islem.equals("1")){
                    System.out.println("Bakiyeniz : " + bakiye);
                }else if(islem.equals("2")){
                    System.out.print("Çekmek istediğiniz tutar : ");
                    int tutar = inp.nextInt();
                    inp.nextLine();
                    if(bakiye - tutar < 0){
                        System.out.println("Yetersiz bakiye.. Bakiyeniz : " + bakiye);
                    }else{
                        bakiye -= tutar;
                        System.out.print("Yeni Bakiyeniz : " + bakiye);
                    }
                }else if(islem.equals("3")){
                    System.out.print("Yatırmak istediğiniz tutar : ");
                    int tutar = inp.nextInt();
                    inp.nextLine();
                    bakiye += tutar;
                    System.out.println("Yeni Bakiyeniz : " + bakiye);
                }else {
                    System.out.println("Geçersiz İşlem");
                }







            }
    }
}

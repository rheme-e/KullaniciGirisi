package Giris;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,soru1,yeniSifre,tekrardene = new String();
        Scanner inp=new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName=inp.nextLine();
        System.out.println("Şifrenizi Giriniz:");
        password=inp.nextLine();

        if(userName.equals("rheme") && password.equals("colormeblue")){
            System.out.println("Hoşgeldiniz");
            }else if(!userName.equals("rheme") || !password.equals("colormeblue")){
                System.out.println("Hatalı Giriş Yaptınız,şifrenizi sıfırlamak ister misiniz?");
                   soru1=inp.nextLine();
                   if(soru1.equals("evet")){
                       System.out.println("Yeni Şifrenizi Giriniz:");;
                   yeniSifre=inp.nextLine();
                        if(yeniSifre.equals("colormeblue")){
                            System.out.println("Yeni Şifre Eski Şifre ile Aynı Olamaz");
                        }else if(!yeniSifre.equals("colormeblue")){
                            System.out.println("Yeni Şifre Başarı ile Oluşturuldu.");
                        }
                   }else{
                       System.out.println("Çıkış Yaptınız.");
                   }
            }

    }
}

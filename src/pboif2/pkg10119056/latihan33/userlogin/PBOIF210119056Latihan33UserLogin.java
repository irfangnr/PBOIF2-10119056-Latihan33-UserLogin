/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan33.userlogin;
import java.util.*;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan User login
 */

class User{
    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        }

    public boolean hasilLogin(String parUserName, String parPassword)
        {

            return (username.equals(parUserName)) && (password.equals(parPassword));
        }

    public void pengecekanLogin(String parUserName, String parPassword)
        {
            boolean active = false;
        }

}
public class PBOIF210119056Latihan33UserLogin {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);  

      String usName;
      String passWord;

      System.out.print("Masukkan Username: ");
        usName = input.nextLine();
        
      System.out.print("Masukkan Password: ");
        passWord = input.nextLine();

        User login = new User(usName, passWord);
        if(login.hasilLogin("RizkiAdam","terbaikselalu"))
            System.out.println("******HALLO "+usName+"******\nSelamat Datang di aplikasi ini");
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
}
    


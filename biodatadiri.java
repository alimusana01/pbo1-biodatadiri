import java.util.Scanner;

public class biodatadiri{
 public static void main (String [] args){
 Scanner input = new Scanner(System.in);

 String nim, nama, klas, jurusan;

 System.out.print("nim : ");
 nim = input.nextLine();

 System.out.print("nama : ");
 nama = input.nextLine();

 System.out.print("klas : ");
 klas = input.nextLine();

 System.out.print("jurusan : ");
 jurusan = input.nextLine();


	System.out.println("===================================");
	System.out.println("=INI ADALAH OUTPUT DARI INPUTAN !!=");
	System.out.println("=   PROGRAM BIODATA SEDERHANA   !!=");
	System.out.println("===================================");	
	System.out.println(" Nim anda adalah 	:"+nim);
	System.out.println(" Nama anda adalah	:"+nama);
	System.out.println(" Klas anda adalah	:"+klas);
	System.out.println(" Jurusan anda adalah	:"+jurusan);
	System.out.println(" Moto anda saat ini	:  Jadilah Hebat Tanpa Menjatuhkan Orang Lain");
   }
}
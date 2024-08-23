//Driver Class
import java.util.Scanner;
public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputan nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa: ");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        
        Siswa rapli = new Siswa(id, nama, ipk);
        rapli.print();
        
        //object
        //Class object = new Construcktor
        
        
        

        Siswa tegar = new Siswa(16,"Tegar",0);
        Siswa naufal = new Siswa(28,"naufal",100);
        Siswa ryuichi = new Siswa(32,"ryuichi",100);
        Siswa bima = new Siswa(2,"bima",100);
        Siswa moreno = new Siswa(24,"moreno",100);

        tegar.id = 16;
        tegar.nama = "Tegar";
        tegar.ipk = 0;
        naufal.id = 28;
        naufal.nama = "Naufal";
        naufal.ipk = 100;
        ryuichi.id = 32;
        ryuichi.nama = "Ryuichi";
        ryuichi.ipk = 100;
        bima.id = 2;
        bima.nama = "Bima";
        bima.ipk = 100;
        moreno.id = 24;
        moreno.nama = "Moreno";
        moreno.ipk = 100;

        System.out.println("Nama : " + tegar.nama);
        System.out.println("Absen : " + tegar.id);
        System.out.println("Nilai : " + tegar.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + naufal.nama);
        System.out.println("Absen : " + naufal.id);
        System.out.println("Nilai : " + naufal.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + ryuichi.nama);
        System.out.println("Absen : " + ryuichi.id);
        System.out.println("Nilai : " + ryuichi.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + bima.nama);
        System.out.println("Absen : " + bima.id);
        System.out.println("Nilai : " + bima.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + moreno.nama);
        System.out.println("Absen : " + moreno.id);
        System.out.println("Nilai : " + moreno.ipk);


        tegar.print();
        naufal.print();
        ryuichi.print();
        bima.print();
        moreno.print();
        input.close(); 

    }
        
}
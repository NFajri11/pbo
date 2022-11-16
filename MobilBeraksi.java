public class MobilBeraksi{
    public static void main(String[] args){
    
    // Membuat object
    Mobil mobilku = new Mobil();
    /* memanggil atribut dan memberi nilai */
    mobilku.Nama = "Anton";
    mobilku.JenisKelamin = "Laki";
    mobilku.umur = 21;
    System.out.println("Nama        : " + mobilku.Nama);
    System.out.println("JenisKelamin: " + mobilku.JenisKelamin);
    System.out.println("Umur        : " + mobilku.umur);
    mobilku.Nama = "riko";
    mobilku.JenisKelamin = "Laki";
    mobilku.umur = 21;
    System.out.println("Nama        : " + mobilku.Nama);
    System.out.println("JenisKelamin: " + mobilku.JenisKelamin);
    System.out.println("Umur        : " + mobilku.umur);
    
    }
 }

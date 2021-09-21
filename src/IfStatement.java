public class IfStatement {

    public static void main(String[] args) {

        var Absen = 90;
        var NilaiAkhir = 80;

        var lulusAbsen = Absen >= 75;
        var lulusNilai = NilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        // true If statement
        if ( Absen >= 75 && NilaiAkhir >= 75){
            System.out.println("Selamat Anda Lulus");
        }
        // perintah false else statement
        else {
            System.out.println("Silakan Coba lagi tahun depan");}

        //Else If Statement
        if (NilaiAkhir >= 80 && Absen >= 80){
            System.out.println("Selamat anda mendapat nilai A");
        } else if (NilaiAkhir >= 75 && Absen >= 75){
            System.out.println("Selamat anda Mendapatkan nilai B");
        } else if (NilaiAkhir >= 70 && Absen >= 70){
            System.out.println("Selamat anda Mendapatkan nilai C");
        }else if (NilaiAkhir >= 65 && Absen >= 65){
            System.out.println("Selamat anda Mendapatkan nilai D");
        }else { System.out.println("Selamat anda Mendapatkan nilai E");
        }
    }
}

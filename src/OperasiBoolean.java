public class OperasiBoolean {

    public static void main(String[] args) {

        var Absen = 75;
        var nilaAkhir = 80;

        boolean lulusAbbsen = Absen >= 75;
        boolean lulusNilai = nilaAkhir >= 75;

        var lulus = lulusAbbsen && lulusNilai;
        System.out.println(lulus);
    }
}


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwitchStatement {

    public static void main(String[] args) {
//  Digunakan ketika hanya membandingkan satu nilai Variabel
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        switch (nilai) {
            case "A" -> System.out.println(" Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus Dengan Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> System.out.println("Mungkn Anda Salah Jurusan");
        }
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = " Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus Dengan Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkn Anda Salah Jurusan";

        }

        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
                case "B", "C":
                yield "Anda Lulus Dengan Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default: yield  "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);

    }

}

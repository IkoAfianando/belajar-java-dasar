public class ArrayCadangan {

    public static void main(String[] args) {
        String[] Keluarga;
        Keluarga = new String[2];
        Keluarga[0] = "Iko";
        Keluarga[1] = "Afianando";
        System.out.println(Keluarga[0]);
        System.out.println(Keluarga[1]);
        Keluarga[0] = "Arvin";
        System.out.println(Keluarga[0]);



        String[] Family;
        Family = new String[6];
        Family[0] = "Iko";
        Family[1] = "Mother";
        Family[2] = "father";
        Family[3] = "Arvin";
        Family[4] = "GrandMother";
        Family[5] = "Iko gaunting";

        System.out.println(Family[0]);
        System.out.println(Family[1]);
        System.out.println(Family[2]);
        System.out.println(Family[3]);
        System.out.println(Family[4]);
        System.out.println(Family[5]);

        Family[0] = "Paijo";

        System.out.println(Family[0]);

        String[] family = { "iko", "arvin", "paijo"};

        family[0] = null;

        System.out.println(family[0]);

        int[] Bilangan = {1,1,1,1,2,2,2,2,2,};

        System.out.println(Bilangan[4]);

        long[] Bilangan2 = new
                long[] { 100, 100001, 100000, 1222222, 10};

        Bilangan2[0] = 12;

        System.out.println(Bilangan2[0] + Bilangan2[4]);

        String[][] namaNama = {
                {"Iko", "Ridwan", "Oyi"},
                {"Awas", "Sampai", "Kapan"},
                {"Ampas", "Kau"}
        };

        System.out.println(namaNama[0][1]);
        System.out.println(namaNama[1][2]);
    }
}

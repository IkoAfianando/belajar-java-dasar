public class ForEach {
    public static void main(String[] args) {
        System.out.println("Iko Afianando");
        String[] name = {
            "Iko", "Afianando", "Arvin",
                "programmer", "Network", "Cyber"
        };

        for (String s : name) {
            System.out.println(s);
        }

        System.out.println("FOR EACH");

        String[] nama = {
                "iko", "afianando", "master",
                "programmer", "network", "cyber"
        };

        for (var mayor : nama){
            System.out.println(mayor);
        }

    }
}

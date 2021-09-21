public class MethodParameter {

    public static void main(String[] args) {

        sayHello("Iko", "Afianando");
        sayHello("Arvin", "Aprian");
        sayHello("Wahyu", "Hidayat");

    }

    static void sayHello( String FirstName, String LastName){
        System.out.println("Hello " + FirstName + " " + LastName );
    }
}

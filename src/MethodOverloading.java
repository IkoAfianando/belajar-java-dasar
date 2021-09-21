public class MethodOverloading {

    public static void main(String[] args) {

        sayHello();
        sayHello("Iko");
        sayHello("Iko", "Afianando");
        sayHello("Afianando", "Iko");
    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static  void  sayHello(String FirstName){
        System.out.println("Hello " + FirstName);
    }

    static void sayHello(String FirstName, String LastName){
        System.out.println("Hello " + FirstName + " " + LastName );
    }
}



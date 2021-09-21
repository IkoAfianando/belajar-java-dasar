public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));
        System.out.println(factorialRecursive1(10));
        loop(1000);
        iko(100);
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static int factorialRecursive1(int value){
        if( value == 1 ){
            return  1;
        }else {
            return  value * factorialRecursive1(value  -1);
        }
    }

    static  void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("loop " + value);
            loop(value -1);

        }
    }
    static void iko(int value){
        if (value == 10 ){
            System.out.println("Mari Kerjakan");
        } else {
            System.out.println("loop " + value);
            iko(value - 10);
        }
    }
}


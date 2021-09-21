public class MethodVariableArgument {

    public static void main(String[] args) {

        int[] values = {80, 80, 90, 80, 90};
        sayCongrats("iko", values);

        sayCongrats("Budi", 90,90,70,90,50);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        var finalvalue= total / values.length;

        if(finalvalue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus" );
        }

    }
}

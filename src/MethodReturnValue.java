public class MethodReturnValue {

    public static void main(String[] args) {

        var resullt1 = sum(100,100);
        System.out.println(resullt1);

        System.out.println(sum(200, 200));

        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(2000, "-", 1900));
        System.out.println(hitung(2000, "salah", 1900));
        System.out.println(jumlah(200, "salah", 1200));
    }

    static  int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    };

    static int jumlah(int value3, String operasi, int value4){
        switch(operasi){
            case "+":
                return  value3 + value4;
            case "-":
                return  value3 - value4;
            case "salah":
                return value3 * value4;
            default:
                return 0;

        }
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return  value1 - value2;
            default:
                return 0;
        }
    }
}




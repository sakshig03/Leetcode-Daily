//decimal to binary number conversion
public class problem3 {
    public static int decimalToBinary(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int remainder = n % 2;
            bin = bin + remainder * (int) Math.pow(10, pow);
            n = n / 2;
            pow++;
        }
        return bin;
    }

    // using stringbuilder approach
    public static String decToBin(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            binary.insert(0, rem);
            n = n / 2;

        }

        return binary.toString();

    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
        System.out.println(decToBin(11));

    }

}

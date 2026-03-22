public class ConverteStrLowerOrUpperCase {

    public static String solve ( final String str){
        int countUpper = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            }
        }
        if (countUpper > str.length() / 2) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public static void main(String[] args) {
        // Передаём строку в метод solve
        String input1 = "HelLo";
        String result1 = solve(input1);
        System.out.println(result1);

        String input2 = "WORLD";
        String result2 = solve(input2);
        System.out.println(result2);
    }
}

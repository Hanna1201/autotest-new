public class ReverseStr {
    public static String solve(String s, int a, int b){
    char[] charArray = s.toCharArray();
    b = Math.min(b, charArray.length - 1);

    while (a<b){
        char temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;

        a++;
        b--;
    }
    return new String(charArray);
}

public static void main(String[] args){
    String input1 = "Hello";
    String result1 = solve(input1, 2,4);
    System.out.println(result1);
}
}

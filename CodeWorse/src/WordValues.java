public class WordValues {
    public static int[] nameValue(String[] arr) {
        int[] myIntArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String myStr = arr[i];
            String myStrWithoutSpace = myStr.replace(" ", "");
            int sum = 0;
            for (int j = 0; j < myStrWithoutSpace.length(); j++) {
                char c = myStrWithoutSpace.charAt(j);
                int position = c - 'a' + 1;
                sum += position;
            }
            myIntArray[i] = sum * (i + 1);
        }
        return myIntArray;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"abc", "abc abc"};
        int[] result = nameValue(input);
        System.out.println(result);

    }
}

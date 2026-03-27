public class MinMax {
    public static int[] minMax(int[] arr) {
        int[] arrayNew = new int[2];
        int numberMin = arr[0];
        int numberMax = arr[0];

            for (int i = 1; i < arr.length; i++) { // for(number : arr)

                if (arr[i] < numberMin) {
                    numberMin = arr[i];
                }
                if (arr[i] > numberMax) {
                    numberMax = arr[i];
                }
            }
        arrayNew[0] = numberMin;
        arrayNew[1] = numberMax;
        return arrayNew;
    }

    public static void main(String[] args) {

//        int[] input = new int[]{1,2,3,4,5};
//        int[] result = minMax(input);
//        System.out.println(result);

//        int[] input1 = new int[]{2334454,5};
//        int[] result1 = minMax(input1);
//        System.out.println(result1);

        int[] input2 = new int[]{1};
        int[] result2 = minMax(input2);
        System.out.println(result2);
    }
}


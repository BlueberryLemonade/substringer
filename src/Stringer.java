public class Stringer {
    public static void main(String[] args) {


        int substring = 3;

        String smallest = "g";
        System.out.println(smallest);
        String largest = "";
        String test = "welcometojava";

        // "itLen" stands for Iterator Length, here to find the amount of times one has to iterate over a string
        //  to check every character.
        int itLen = test.length() - substring+1;
        // Create an array of substrings to store every iteration in for comparison later
        String[] subStrings = new String[itLen];

        for(int i = 0; i<itLen; i++){

            String sub = test.substring(i, substring+i);

            subStrings[i] = sub;

        }

        java.util.Arrays.sort(subStrings);

        smallest = subStrings[0];

        largest = subStrings[itLen-1];

        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    }
}
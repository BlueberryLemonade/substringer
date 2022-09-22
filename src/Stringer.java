public class Stringer {
    public static void main(String[] args) {


        int substring = 3;


        String test = "ABCDE";

        // "itLen" stands for Iterator Length, here to find the amount of times one has to iterate over a string
        //  to check every character.
        int itLen = test.length() - substring+1;
        // Create an array of substrings to store every iteration in for comparison later
        String[] subStrings = new String[itLen];

        for(int i = 0; i<itLen; i++){


            subStrings[i] = test.substring(i,substring+i);

        }

        System.out.println("Value at 0 is: " + subStrings[2]);
    }
}
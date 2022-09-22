public class Stringer {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int substring = 3;


        String test = "ABCDEFGES";
        // "itLen" stands for Iterator Length, here to find the amount of times one has to iterate over a string
        //  to check every character.
        int itLen = test.length() - substring+1;
        for(int i = 0; i<itLen; i++){
            System.out.println(test.substring(i, substring+i));
        }
    }
}
package org.example;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


        public static void main(String[] args) {
            //System.out.println(JAVAPRACTICE.reverseWord("Welcome"));
            //System.out.println("Hey fellow " + JAVAPRACTICE.reverseWord("warriors"));


            ArrayList<Integer> numbers= new ArrayList<>();
            ArrayList<Integer> numberMod= new ArrayList<>();

            numbers.add(4);
            numbers.add(7);
            numbers.add(9);

            String numberToStr="";

            for(int i=0; i<numbers.size();i++){

                numberToStr+=numbers.get(i);
            }

            int numberToInt= Integer.valueOf(numberToStr);

            numberToInt+=1;
            numberToStr= String.valueOf(numberToInt);
            String[] numberStrToArray= numberToStr.split("");

            for(int n=0; n<numberStrToArray.length;n++){
                System.out.println(numberStrToArray[n]);
                numberMod.add(Integer.valueOf(numberStrToArray[n]));
            }

            System.out.println(numberMod);




            //System.out.println(numberToStr);


            //System.out.println(numberToInt);

//            int arrayLength=numbers.size()-1;
//            int lastValue= numbers.get(arrayLength);
//            lastValue+=1;
//
//            numbers.remove((arrayLength));
//           numbers.add(lastValue);

            //System.out.println(numbers.get(arrayLength));;

            //System.out.println(lastValue);


            //System.out.println(numbers.size());

        }
    }


//        System.out.println(Arrays.toString());







    //
//        JAVAPRACTICE javapractice=new JAVAPRACTICE();
////        System.out.println(javapractice.reverseString(char[] s));
////        int i = 100;
//
////        System.out.println(javapractice.uniqueCharacters("abcd10jk"));
//        System.out.println(javapractice.countCurrency(230 ));
////        System.out.println(javapractice.factorial(15));
//        System.out.println(javapractice.longestPalindromeString("9912333321456"));
//        System.out.println(javapractice.longestPalindromeString("12145445499"));
//        System.out.println(javapractice.longestPalindromeString("1223213"));
//        System.out.println(javapractice.longestPalindromeString("abb"));


    /*public static void countCurrency(int amount) {
        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCounter = new int[9];

        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    // driver function
    public static void main(String argc[]) {
        int amount = 868;
        countCurrency(amount);
    }
}
*/
//    public  static void main(String[] args){
//
//        Scanner p = new Scanner(System.in);
//
//
//





//
//        System.out.println(javapractice.firstMissingPositive(new int[]{1, 2, 3,7,8,4}));



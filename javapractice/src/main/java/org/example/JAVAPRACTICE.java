package org.example;

public class JAVAPRACTICE {
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
}





/*{
    import java.util.*;
    class Discount
    {
//        public static void main(String args[])
        {
            double quantity,price,amount,discount;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Price Of The Product:");
            price=sc.nextDouble();
            System.out.println("Enter The No Of Quantity:");
            quantity=sc.nextDouble();
            amount=quantity*price;

            if(amount>5000)

            {

                discount=amount*0.05;

                amount=amount-discount;

            }

            System.out.println("The Total Amount is:"+amount);


        }
    }

*/


/*
//    HOW TO MAKE AN ATM DISPOSE CURRENCY IN DIFFERENT FORMS
public static void countCurrency(int amount)
{
    int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
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
    public static void main(String argc[]){
        int amount = 868;
        countCurrency(amount);
    }



/*
//            UNIQUE CHARACTER IN A STRING
        boolean uniqueCharacters(String str)
        {
            for (int i = 0; i < str.length(); i++)
                for (int j = i + 1; j < str.length(); j++)
                    if (str.charAt(i) == str.charAt(j))
                        return false;

            return true;
        }











    /*
    HOW TO BRING OUT THE NUMBERS OF 5 in a given number
   public int factorial (int f) {
       int count = 0;
       for (int i = 5; i <= f; i = i * 5){
           count = count + f / i;
       }
       return count;
   }







/*
//    HOW TO PRINT countSubstrings
    public static boolean countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = i; j < n; j++){
                if (s.charAt(j) == 'a')
                    cnt ++;
                else if (s.charAt(j) == 'c')
                    cnt --;
                if (cnt > 0){
                    if (cnt > 0){
                        ans++;
                    }
                }
            }
        }
        return false;
    }*/










    /*
    //    HOW TO PRINT THE MIDDLE CHARACTER IN A STRING
    public static boolean printMiddleCharacter(String str) {
        int len = str.length();
        int middle = len / 2;

        System.out.println(str.charAt(middle));
        return false;
    }
}
*/










/*
HOW TO PRINT DIVISOR OF A NUMBER
//     class Test {
        static void printDivisor(int n) {
            Vector<Integer> v = new Vector<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i)
                        System.out.println();
                    else {
                        System.out.println();
                        v.add(n / i);
                    }
                }
            }
        }
    }
*/





    /*
    HOW TO RETURN THE LONGEST PALINDROME
    int start = 0, end = 0;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, +i);
//            expandAroundCenter(s, i, i +1);
        }
        return s.substring(start, end + 1);
    }
    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left = left + 1;
        right = right - 1;
        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }
}
*/

//    public class LongestPalindromeFinder {
//
//        public static void main(String[] args) {
//
//        }

//        static public String intermediatePalindrome(String s, int left, int right) {
//            if (left > right) return null;
//            while (left >= 0 && right < s.length()
//                    && s.charAt(left) == s.charAt(right)) {
//                left--;
//                right++;
//            }
//            return s.substring(left + 1, right);
//        }
//
//        // O(n^2)
//        public static String longestPalindromeString(String s) {
//            if (s == null) return null;
//            String longest = s.substring(0, 1);
//            for (int i = 0; i < s.length() - 1; i++) {
//                //odd cases like 121
//                String palindrome = intermediatePalindrome(s, i, i);
//                if (palindrome.length() > longest.length()) {
//                    longest = palindrome;
//                }
//                //even cases like 1221
//                palindrome = intermediatePalindrome(s, i, i + 1);
//                if (palindrome.length() > longest.length()) {
//                    longest = palindrome;
//                }
//            }
//            return longest;
//        }
//
//    }





//        System.out.println(singleNumber(nums));
//        System.out.println(reverseString(char[] s)(nums));


//
//      HOW TO REVERSE A STRING
//      public void reverseString(char[] s) {
//
//          int left = 0;
//          int right = s.length - 1;
//          while (left < right)
//          {
//              char tmp = s[left];
//              s[left] = s[right];
//              s[right] = tmp;
//              left++;
//              right--;
//          }
//
//      }
//}

// HOW  TO DO A RUNNING SUM
//    public int[] runningSum(int[] nums) {
//        int[] results = new int[nums.length];
//        results[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            results[i] = nums[i] + results[i - 1];
//
//        }
//        return results;
//    }
//
//    static int firstMissingPositive(int[] nums) {
//        Arrays.sort(nums);
//        int value = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == value) {
//                value++;
//            }
//
//        }
//        return value;
//    }
//
// int [] nums = new int []{4,1,2,1,2};
//    static int singleNumber(int[] nums){
//        int ans = nums[0];
//        for(int i = 1; i < nums.length; i++){
//            ans =ans ^ nums[i];
//        }
//        return ans;
//    }
//
//}
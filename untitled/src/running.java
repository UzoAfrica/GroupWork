import org.jetbrains.annotations.NotNull;
    class Counter
    {
        int count;
        public synchronized void increment()
        {
        count++;
        }
    }
    public class running {
        public static void main(String[] args) throws Exception {
            Counter c = new Counter();

            Thread t1 = new Thread(new Runnable()
            {
                public void run()
                {
            for(int i=1; i<=1000; i++)
            {
                c.increment();
            }
        }
            });
            Thread t2 = new Thread(new Runnable()
            {
                public void run()
                {
            for(int i=1; i<=1000; i++)
            {
                c.increment();
            }
        }
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();
            System.out.println("Count " + c.count);
        }

    }
//        public static void main(String[] args) throws Exception {
//
//            Thread t1 = new Thread(() ->
//            {
//                for (int i = 1; i <5 ; i++) {
//                    System.out.println("Hi");
//                    try{ Thread.sleep(1000); } catch(Exception e ){}
//                }
//            });
//            Thread t2 = new Thread(()  ->
//            {
//                for (int i = 1; i < 5; i++) {
//                    System.out.println("Hello");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                    }
//                }
//            });
//
//            t1.setPriority(1);
//            t2.setPriority(10);
//            System.out.println(t1.getPriority());
//            System.out.println(t2.getPriority());
//
//
//            t1.start();
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            t2.start();
//
//            t1.join();
//            t2.join();
//
//            System.out.println("BYE");
//        }
//
//    }


  








//    public int[] runningSum(int @NotNull [] nums) {
//        int[] results = new int[nums.length];
//        results[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            results[i] = nums[i] + results[i - 1];
//
//        }
//        return results;
//    }
//}
    





//
//
//        System.out.println( hasUniqueCharacter(test));
//        System.out.println(hasUniqueCharacter(test2));
//        System.out.println(hasUniqueCharacter(test3));
//
//    }
//     public static boolean hasUniqueCharacter (String str) {
//         Set<Character> set= new HashSet<>();
//         for(char c : str.toCharArray()){
//             if(set.contains(c)){
//        return false;
//             }
//             set.add(c);
//         }
//            return true;
//
//     }
// }

//import java.util.Scanner;
//
//public class Challenge {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a string");
//        String numbers = input.nextLine();  //String would be 55
//        int sum = 0;
//        for (char c : numbers.toCharArray()) {
//            sum += c - '0';
//        }
//        System.out.println(sum); //the answer is 10
//    }

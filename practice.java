import java.text.ParseException;
import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class practice {


//    TODO Program to print triangle of pattern.
           /* public static void main(String[] args) {
                int rows = 5;
                for(int i=1; i<=rows; i++  ){
                    for (int j = 1; j<=i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }



            }*/

//    TODO Program to print a string of fibonacci.
        /*public static String Fibonacci(int n) {
            String fib = "";
            int i = 0, first = 0, second = 1;
            int series;
            for(i = 0; i < n; i++){
                if(i<=1){
                    series = i;
                    fib+= String.valueOf(series) + " ";
                }
                else{
                    series = first + second;
                    first = second;
                    second = series;
                    fib += String.valueOf(series) + " ";
                }
            }


            return fib;*/
//        }
//
//    public static void main(String[] args) {
////        System.out.println(Fibonacci(22));
//    }



    /*TODO Function to get sum of digits */
        /*static int getSum(int n)
        {
            int sum;

             Single line that calculates sum
            for (sum = 0; n > 0; sum += n % 10,
                    n /= 10 );

            return sum;
        }

        // Driver code
        public static void main(String[] args)
        {
            int n = 687;

            System.out.println(getSum(n));
        }*/
    /*public static Integer summ(int var) {


        int result = 1 ;
        int lastdigit;
        while (var > 0){
            lastdigit = var % 10;
            result = result * lastdigit;
            var /= 10;

        }
        return result;
    }*/

//    TODO function to check whether a string length is even or odd and convert it to upper and lower case accordingly.
       /* public static String test(String x) {

            if (x.length() % 2 == 0) {
                return x.toUpperCase();
            }

            return x.toLowerCase();
        }
        public static void main( String args[] ) {
            String odd = "Hello";
            String even = "John";
            System.out.println( "Hello:" + test(odd));
            System.out.println( "John:" + test(even));
        }
*/
//    TODO creating a array of length n
    /*public static void aerray(int n){
        int[] myArray = new int[n];
        for(int i = 0; i <myArray.length; i++){
            myArray[i] = i + 1;
        }
        System.out.println(myArray[4]);
    }
*/
//    TODO array of characters.
   /* public static void aerray(char n) {
        int indx =0;
        char[] myArray = new char[n];
        for (char i = n ; i < 'z'; i++) {
            myArray[indx] = i ;
            indx++;
        }
        System.out.println(myArray[9]);
    }*/


//TODO finding largest number in a given array.
     /*   public static int[] findMaxVal(int[] arr) {
            int n = arr.length;

            int [] array = Arrays.sort(arr);
            return array;
        }
    public static void main(String[] args) {
            int[] atr = {11,222,44,444,556456,64646,999999,1000};
        System.out.println(findMaxVal(atr));
    }*/
    /*public static int findMaxVal(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []art = {22,232,456,2490924,8676,99999};
        System.out.println(findMaxVal(art));
    }*/
//    TODO casting in java
    /*public static void main(String[] args) {
        int x =11;
        float y = x;             *//*broadening type casting*//*
        int z =(int) y ;                   *//*narrowing type casting*//*
        System.out.println(y);
        System.out.println(z);

    }
*/
//    String monthYearval = driver.findelem
//    public static void selectDate(String Date, String Month, String Year){
//        System.out.println(monthYearval);
//    }

//    public static int[] arraySort(int[] aRR){
//        Arrays.sort(aRR);
//
//
//        return aRR;
//    }
//    public static void main(String[] args) {
//        int[] array = {1,255,3,44,505,6,7};
//
//        System.out.println(arraySort(array));
//
//
//    }
    /*public static boolean datechecker(String d1, String d2) throws ParseException {
        String startInput = d1;
        String stopInput =d2 ;
        SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
        Date sday = st.parse(startInput);
        Date eday = st.parse(stopInput);
        System.out.println(sday);
        System.out.println(eday);
        boolean isBefore = eday.before(sday);
        return isBefore;
    }
    public static String myName(String Name){
        String x = "My name is "+ Name;
        return x;
    }

    static String d1 = "20/09/2014";
    public static void main(String[] args) throws ParseException {
//        String d1 = "2014/09/18";
        String d2 = "2014/09/19";
        if (!datechecker(d1, d2)) {
            throw new RuntimeException("Invalid date");
        } else {
//
            System.out.println("its valid");
//            e.printStackTrace();
        }*/


//        static String d1 = "2014/09/13";
//        System.out.println(sdf.parse(startDate).before(sdf.parse(endDate)));

        /*DateTimeFormatter f = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm");

        LocalDateTime start = LocalDateTime.parse(startInput, f);
        LocalDateTime stop = LocalDateTime.parse(stopInput, f);*/
        /*if (isBefore != true){
            System.out.println("its suitable");
        }else{
            System.out.println("sorry wrong input!!");
        }*/

//    }
//    }

   /* public static void oddEven(int x){
        if(x % 2 == 0){
            if(  x>=2 && x<=5 || x > 20 ){
                System.out.println("Not Weird");
            }
            if(x>= 6 && x <= 20){
                System.out.println("Not Weird");
            }

        }else{
            System.out.println("Weird");
        }

    }

    public static void main(String[] args) {
        oddEven(20);
    }*/

//    TODO Print AP of multiples series of no.in range of t.
    /*public static void main(String []argh){
     Scanner in = new Scanner(System.in);
        int t=in.nextInt();
     for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        for(int j = 0; j< n; j++ ){
            a = a + (int)Math.pow(2,j)*b;
            System.out.print(a + " ");
        }
        System.out.println(" ");

     }
     in.close();

    }*/

    public static void main(String[] args) {
        int x = 19;

    }
}









package FunctionalProgramming;

import java.util.List;

public class FunctionalP0 {
    static int[] typeArray = {1, 2, 3, 5, 6, 7, 8, 9};
    static List<Integer> x = List.of(1,2,3,4,5,6,7,8,9,10);
    public static void main(String[] args) {
//        structuredwayofProgramming(List.of(1,2,3,4,5,6,7,8,9));
//        structuredwayofProgramming(x);
//        streamPrinter(x);
          evenFinder(x);
    }

//method for printing....
public static void print(int number) {
    System.out.println(number);

}
//method for checking even number....
public static boolean evenFlag(int number) {
    return  number%2 == 0;
}

//Structured way of programming
public static void structuredwayofProgramming(List<Integer> intgr) {
    for (int i : intgr) {
        System.out.println(i);
    }
}

// Functional way of programming
// Using stream we are converting a no into list of a number.
// using method referencing for invoking the method.
public static void streamPrinter(List<Integer> numbers) {
        numbers.stream().forEach(FunctionalP0::print);
    }


//    Purely functional approach...
//    Printing the even numbers from a list
public static void evenFinder(List<Integer>numbers) {
        numbers.stream().filter(FunctionalP0::evenFlag).forEach(FunctionalP0::print);

}


}
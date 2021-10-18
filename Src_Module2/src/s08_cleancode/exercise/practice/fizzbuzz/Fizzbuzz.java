package s08_cleancode.exercise.practice.fizzbuzz;

public class Fizzbuzz {
    public static String fizzBuzz(int number){
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if(isDivisibleBy3 && isDivisibleBy5)
            return "FizzBuzz";

        if(isDivisibleBy3)
            return "Fizz";

        if(isDivisibleBy5)
            return "Buzz";

        return number + "";
    }
}
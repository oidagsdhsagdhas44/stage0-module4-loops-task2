package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
//    Write a program that will write to console all simple numbers from 0 up to input from method arguments using while loop, each on new line:
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            int divide = 2;
            boolean isPrime = true;
            while (divide < num) {
                if (num % divide == 0) {
                    isPrime = false;
                }
                divide++;
            }
            if (isPrime) System.out.println(num);
            num++;
        }
    }
}

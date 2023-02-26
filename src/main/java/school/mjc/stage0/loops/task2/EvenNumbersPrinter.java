package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
//    Write a program that will write to console even numbers from zero to the number from method arguments using while loop, each on new line:
    public void printEvenNumbers(int printTillInclusive) {
        int count = 0;
        while(count<=printTillInclusive){
            if(count % 2 == 0) System.out.println(count);
            count++;
        }
    }
}

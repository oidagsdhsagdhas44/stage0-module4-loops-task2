package school.mjc.stage0.loops.task2;

public class Multiplication {
//    Write a program that will write to console multiplied numbers by input from zero to the number from method arguments
//        using while loop, each on new line(program should also be able to work with negatives):
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while (count <= multiplyByAndToInclusive) {
            System.out.println(count * multiplyByAndToInclusive);
            count++;
        }
    }
}

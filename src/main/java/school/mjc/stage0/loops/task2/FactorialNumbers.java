package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int curr = 1;
        int num = 1;
        while(num <= printToInclusive){
            System.out.println(curr);
            curr *= num;
            num++;
        }
    }

}

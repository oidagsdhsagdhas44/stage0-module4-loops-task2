package school.mjc.stage0.loops.task2;
import java.lang.Math;

public class PowerOfTwo {
//    Write a program that will take int power as an argument. This argument will be used to calculate power of 2. The program should
//    write to console each value for power of 2 beginning from 2^0...2^power. Write the program using "while" in case of negative value
//    print "too much power":
    public void printPower(int power) {
        if(power<0) System.out.println("too much power");
        else{
            int curr = 0;
            while (curr<=power){
                System.out.println((int)Math.pow(2,curr));
                curr++;
            }
        }
    }
}

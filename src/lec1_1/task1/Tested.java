package lec1_1.task1;

/**
 * Created by Illya on 16.11.2016.
 */
public class Tested {
    @Test(a=2, b=5)
    public void test(int a, int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}

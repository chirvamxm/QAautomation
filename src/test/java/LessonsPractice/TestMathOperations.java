package LessonsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperations {
    @Test
    public void checkSumm(){
        //summ(84,98) == 182 expected 182
        Assert.assertTrue(summ(84,98) ==182);
        //summ(7,5) == 12 expected 12
        Assert.assertTrue(summ(7,5) ==12);
        //summ1234567,7654321) == 8888888 expected 8888888
        Assert.assertTrue(summ(1234567,7654321) ==8888888);

    }
    @Test
    public void checkMult(){
        //mult(7,8) == 56 expected 56
        Assert.assertTrue(mult(7,8)==56);
        //mult(9,6) == 54 expected 54
        Assert.assertTrue(mult(9,6)==54);
        //mult(13,13) == 169 expected 169
        Assert.assertTrue(mult(13,13)==169);
        //mult(18,3) == 54 expected 54
        Assert.assertTrue(mult(18,3)==54);

    }


    public int summ(int a, int b){
        return a+b;
    }

    public int mult(int a, int b){
        return a*b;
    }
}

package LessonsPractice.HWL6;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLesson {

    @Test
    public void arraysLesson(){

        int[] numbers={18,12,7,15,2,8,17};
        Arrays.sort(numbers,0,7);
        System.out.println("Min value in the array: "+numbers[0]);
        System.out.println("Max value in the array: "+numbers[numbers.length-1]);
        System.out.println("number of values in the array: "+numbers.length);

        String[] userNames={"Joey","Chandler","Ross","Phoebe","Monika","Rachel"};
        System.out.println(Arrays.toString(userNames));



    }


}


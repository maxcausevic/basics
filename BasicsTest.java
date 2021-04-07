import java.util.Arrays;
public class BasicsTest{
    public static void main(String[] args){
        System.out.println(Arrays.toString(args));
        Basic.printP1to255();
        Basic.printOdd();
        Basic.printSum();
        Basic.iterateArray(new int[]{1,3,5,7,9,13});
        Basic.findMax(new int[]{-3,-5,-7});
        Basic.getAverage(new int[]{2,10,3});
        Basic.arrayOdd();
        System.out.println(Basic.greaterThanY(new int[]{1,3,5,7}, 3));
        Basic.squareValues(new int[]{2,4,6,8});
        Basic.eliminateNeg(new int[]{1,5,10,-2});
        Basic.maxMinAverage(new int[]{1,5,10,-2});
        Basic.shiftValues(new int[]{1,5,10,7,-2});
    }

}
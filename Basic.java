import java.util.ArrayList;
import java.util.Arrays;

public class Basic{
    public static void printP1to255(){
        int i = 1;
        for (; i<=255; i++){
            System.out.println(i);
        }
    }
    
    public static void printOdd(){
        for(int i = 1; i<=255; i++)
            if(i%2 !=0)
                System.out.println(i);
    }
    public static void printSum(){
        int sum = 0;
        for(int i = 1; i<=255; i++){
            sum += i;
            System.out.println("New number:" + i + "Sum:" + sum);
        }

    }
    public static void iterateArray(int[] arr){
        for(int i=0; i<= arr.length-1; i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("This is the max" + max );
    }
    public static void getAverage(int[] arr){
        int sum = 0;
        int average = 0;
        for(int i=0; i<=arr.length-1; i++){
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("This is the average:" + average);
    }
    public static void arrayOdd(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=1; i<=255; i++){
            if(i%2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public static int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int i =0; i<=arr.length-1; i++){
            if(arr[i] > y){
                count++;
            }
        }
        return count;
    }
    public static void squareValues(int[] arr){
        int square = 0;

        for(int i= 0; i<=arr.length-1; i++){
            square = arr[i] * arr[i];
            arr[i] = square;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void eliminateNeg(int[] arr){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] < 0){
                arr[i] =0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void maxMinAverage(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average = 0;
        int sum = 0;
        for(int i = 0; i<= arr.length-1; i++){
            sum += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            average = sum/arr.length;
        }
        System.out.println("min:" + min + "max:" + max + "average:" + average);
    }
    public static void shiftValues(int[] arr){
        for(int i = 0; i<=arr.length-2; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

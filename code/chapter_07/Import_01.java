package code.chapter_07;
import java.util.Arrays;

public class Import_01{
    public static void main(String[] args){
        int arr[]= {1,3,6,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(i);
        // }

    } 
}


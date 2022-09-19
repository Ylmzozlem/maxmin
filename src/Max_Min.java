import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        int[] list = {15, 12, 788 ,1,-1, -778,2,0};

        Arrays.sort(list);

        Scanner scn=new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int num=scn.nextInt();

        if(Arrays.binarySearch(list,num)<0) {

            System.out.println("Your closer number that bigger than given number: " + list[-Arrays.binarySearch(list, num) - 1]);
            System.out.println("Your closer number that smaller than given number: " + list[-Arrays.binarySearch(list, num) - 2]);
        }else {
            System.out.println("Your closer number that bigger than given number: " + list[Arrays.binarySearch(list, num) + 1]);
            System.out.println("Your closer number that smaller than given number: " + list[Arrays.binarySearch(list, num) - 1]);

        }

    }
}

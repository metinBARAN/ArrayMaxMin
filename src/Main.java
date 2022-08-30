import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={15,12,788,1,-1,-778,2,0};

        int min = arr[0];
        int max = arr[0];

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Bir sayi giriniz: ");
        int arrNumber=input.nextInt();

        for (int i:arr){


            if (i<arrNumber){
                min=i;

            }
            if (i>arrNumber){
                max=i;
                break;

            }

        }
        System.out.println(min);
        System.out.println(max);

    }

    }


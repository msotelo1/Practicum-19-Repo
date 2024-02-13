import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int sum = 0;
    double avg1 = 0.0, avg2 = 0.0;

    Scanner input = new Scanner(System.in);

    int[] nums = new int[100];

    for(int i = 0; i < nums.length; i++)
    {
        nums[i] = 100 + i;
    }
                    
    for(int i = 0; i < nums.length; i++)
    {
        sum = sum + nums[i];
        avg1 = sum/nums.length;
    }

    for(int i = 0; i < nums.length; i++)
    {
        nums[i] = nums[i] + 5;
    }

     for(int i = 0; i < nums.length; i++)
    {
        sum = sum +nums[i];
        avg2 = sum/nums.length;
    }
   
    System.out.println("avg1 = " + avg1);
    System.out.println("avg2 = " + avg2);

  }
}

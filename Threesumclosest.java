import java.util.*;
public class Threesumclosest {
    public static int closestSum(int nums[],int target){
        Arrays.sort(nums);

        int j = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            while(i<j){
                int currrentsum = nums[i]+nums[j-1]+nums[j];
                if(Math.abs(target - currrentsum)< Math.abs(target-closestsum)){
                    closestsum = currrentsum;
                }

            }
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Enter the elements in array
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        // printing elements in an array
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        int closest = closestSum(nums, target);
        System.out.println(closest);

    }
}

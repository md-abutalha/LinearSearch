
public class TalhaLinearsearch {
    public static void main(String[] args) {
        int nums[] = {22,333,44,55,66};
        int target = 55;

        int result = linearSearch(nums, target);
    
        if (result != -1)
            System.out.println("Element found: " + result);

        else
            System.out.println("Element Not Found!");

    }

    public static int linearSearch(int[] nums, int target) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            step++;
            if (nums[i] == target) {
                System.out.println("Step are linear: " + step);
                return i;
            }
        }
        return -1;
    }

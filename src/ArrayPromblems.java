import java.util.Arrays;

public class ArrayPromblems {

    static int maxSpan(int[] nums) {
        int maxRange = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length-1; j >= i; j--){
                if(nums[i] == nums[j] && j-i >= maxRange) maxRange = j-i+1;
            }
        }
        return maxRange;
    }

    static int[] fix34(int[] nums) {
        int lastJ = 0;
        for (int i = 0; i < nums.length; i ++){
            if(nums[i] == 3){
            for (int j = lastJ; j<nums.length; j++) {
                    if(nums[j] == 4){
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                        lastJ = j;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    static int[] fix45(int[] nums) {
        int lastFive = nums.length-1;
        for (int i = 0; i<nums.length; i++){
            if(nums[i] ==4 && nums[i+1] != 5){
                for (int j = lastFive; j>=0 ; j--){
                    if(nums[j] == 5){
                        if (j==0 || nums[j-1] !=4){
                            nums[j] = nums[i+1];
                            nums[i+1] = 5;
                            lastFive = j-1;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }

    static boolean canBalance(int[] nums) {
        int leftSide = 0, rightSide = 0;
        for(int i = 0; i<nums.length-1; i++){
            leftSide += nums[i];
            for (int j = i+1; j<nums.length; j++){
                rightSide += nums[j];
            }
            if(leftSide == rightSide) return true;
            rightSide =0 ;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
    }

}

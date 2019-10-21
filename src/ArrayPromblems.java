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

    static boolean linearIn(int[] outer, int[] inner) {
        if(inner.length==0) return true;
        for(int i = 0; i<=outer.length - inner.length; i++){
            if(outer[i] == inner[0]){
                for(int j = 0; j<inner.length;){
                    if ((inner[j] == outer[i])){
                        i++;
                        j++;
                    }
                    else i++;
                    if(j==inner.length) return true;
                    if(i==outer.length) return false;
                }
            }
        }
        return false;
    }

    static int[] squareUp(int n) {
        int[] answer = new int[n*n];
        if(answer.length == 0) return answer;
        for(int i = 0, r = 1; i<answer.length; i= i + n, r++){
            for(int j = i+n-1, k = 1; j>=(n*r)-r; j--){
                answer[j] = k++;

            }
        }
        return answer;
    }

    static int[] seriesUp(int n) {
        int[] answer = new int[n*(n+1)/2];
        for(int i = 0, step = 1; i<answer.length;i+=step, step++){
            for(int j = i, local = 1; local<=step; j++,local++){
                answer[j] = local;
            }
        }
        return answer;
    }

    static int maxMirror(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length-1, localMax = 0, localIndex = i; j>=0; j--){
                if(nums[localIndex] == nums[j]){
                        localMax++;
                        localIndex++;
                        answer = Math.max(answer,localMax);
                }
                else localMax = 0;
                if (localIndex == nums.length){
                    break;
                }
            }
        }
        return answer;
    }

    static int countClumps(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                answer++;
                for(int j = i+1; j<nums.length-1; j++){
                    if(nums[j] != nums[j+1]){
                        i= j;
                        break;
                    }
                    if(j == nums.length-2) return answer;

                }
            }
        }
        return answer;
    }









    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1,1,1,1,1}));
    }

}

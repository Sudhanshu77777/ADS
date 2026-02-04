public class pairsum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int target = 6;
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            int sum = array[left] + array[right];
            if(sum == target) {
                System.out.println("Pair found: " + array[left] + ", " + array[right]);
                left++;
                right--;
            } 
            else if(sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
    }
}

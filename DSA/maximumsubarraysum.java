public class maximumsubarraysum {


public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int k = 3;
        int windowsum = 0;
        for(int i = 0; i<k; i++)
        {
            windowsum += array[i];
        }
        int maxsum = windowsum;
        
        for(int right = k; right<array.length; right++)
        {
            windowsum += array[right];
            windowsum -= array[right-k];
            maxsum = Math.max(windowsum, maxsum);
        }
        System.out.println(" max sum " + maxsum);
    }
}
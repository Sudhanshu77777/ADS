public class variableSizeWindow {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int left = 0;
        int maxlength=0;
        int sum=0;
        int k=7;
        
        for(int right=0; right<array.length; right++)
        {
            sum += array[right];
            while(sum>k)
            {
                sum -= array[left];
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}
}

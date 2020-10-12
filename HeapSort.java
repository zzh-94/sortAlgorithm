import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        heapSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void heapSort(int[] nums) {
        int len=nums.length;
        for(int i=len/2;i>0;i--){
            heapAdjust(nums,i,len);
        }
        for(int i=len;i>1;i--){
            swap(nums,0,i-1);
            heapAdjust(nums,1,i-1);
        }
    }

    private static void swap(int[] nums, int i, int i1) {
        int temp=nums[i];
        nums[i]=nums[i1];
        nums[i1]=temp;
    }

    private static void heapAdjust(int[] nums, int i, int len) {
        int temp=nums[i-1];
        while(i*2<=len){
            int j=2*i;
            if(j<len&&nums[j]>nums[j-1]){
                j=j+1;
            }
            if(nums[j-1]<=temp){
                break;
            }
            nums[i-1]=nums[j-1];
            i=j;
        }
        nums[i-1]=temp;
    }
}

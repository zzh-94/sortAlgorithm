public class SSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        sSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void sSort(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(nums[min]>nums[j]) min=j;
            }
            if(min!=i) swap(nums,i,min);
        }
    }

    private static void swap(int[] nums, int i, int min) {
        int temp=nums[i];
        nums[i]=nums[min];
        nums[min]=temp;
    }
}

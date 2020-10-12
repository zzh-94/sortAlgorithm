public class BSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        bSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void bSort(int[] nums) {
        int len=nums.length;
        boolean flag=true;
        for(int i=0;i<len&&flag;i++){
            flag=false;
            for(int j=len-1;j>0;j--){
                if(nums[j]<nums[j-1]) {
                    swap(nums,j,j-1);
                    flag=true;
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

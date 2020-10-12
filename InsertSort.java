public class InsertSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        insertSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void insertSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                int j=i;
                int temp=nums[i];
                while(j>0&&nums[j-1]>temp){
                    nums[j]=nums[j-1];
                    j--;
                }
                nums[j]=temp;
            }
        }
    }
}

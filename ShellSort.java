public class ShellSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        shellSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void shellSort(int[] nums) {
        int increment=nums.length;
        do{
            increment=increment/3+1;
            for(int i=increment;i<nums.length;i++){
                if(nums[i-increment]>nums[i]){
                    int temp=nums[i];
                    int j=i;
                    while(j>=increment&&nums[j-increment]>temp){
                        nums[j]=nums[j-increment];
                        j=j-increment;
                    }
                    nums[j]=temp;
                }
            }
        }while(increment!=1);
    }
}

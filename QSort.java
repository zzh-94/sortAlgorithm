public class QSort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        qSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void qSort(int[] nums, int l, int r) {
        if(l<r){
            int m=partation(nums,l,r);
            qSort(nums,l,m-1);
            qSort(nums,m+1,r);
        }
    }

    private static int partation(int[] nums, int l, int r) {
        int pivo=nums[l];
        while(l<r){
            while(l<r&&nums[r]>=pivo) r--;
            nums[l]=nums[r];
            while(l<r&&nums[l]<=pivo) l++;
            nums[r]=nums[l];
        }
        nums[l]=pivo;
        return l;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

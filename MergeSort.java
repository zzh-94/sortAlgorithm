public class MergeSort {
    static int[] temp;
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        temp=new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void mergeSort(int[] nums,int l,int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,r,mid);
        }
    }

    private static void merge(int[] nums, int l, int r, int mid) {
        int k=l;
        int l1=l;
        int l2=mid+1;
        while(l1<=mid&&l2<=r){
            if(nums[l1]<=nums[l2]){
                temp[k++]=nums[l1++];
            }else{
                temp[k++]=nums[l2++];
            }
        }
        while(l1<=mid){
            temp[k++]=nums[l1++];
        }
        while(l2<=r){
            temp[k++]=nums[l2++];
        }
        for(int i=l;i<=r;i++){
            nums[i]=temp[i];
        }
    }

}

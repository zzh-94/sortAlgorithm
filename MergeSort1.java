public class MergeSort1 {
    public static void main(String[] args) {
        int[] nums = {7, 3, 1, 5, 10, 2, 6, 4, 9, 8};
        int[] temp = new int[nums.length];
        int k=1;
        while(k<nums.length){
            mergeSort(nums,temp,k);
            k*=2;
            mergeSort(temp,nums,k);
            k*=2;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void mergeSort(int[] nums,int[] temp,int k) {
        int i=0;
        while(i<=nums.length-2*k){
            merge(nums,temp,i,i+2*k,i+k);
            i+=2*k;
        }
        if(nums.length-i>=k){
            merge(nums,temp,i,nums.length,i+k);
        }else{
            while(i<nums.length){
                temp[i]=nums[i];
                i++;
            }
        }

    }
    private static void merge(int[] nums,int[] temp, int l, int r, int mid) {
        int k=l;
        int l1=l;
        int l2=mid;
        while(l1<mid&&l2<r){
            if(nums[l1]<=nums[l2]){
                temp[k++]=nums[l1++];
            }else{
                temp[k++]=nums[l2++];
            }
        }
        while(l1<mid){
            temp[k++]=nums[l1++];
        }
        while(l2<r){
            temp[k++]=nums[l2++];
        }
    }

}

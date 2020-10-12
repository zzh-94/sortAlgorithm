import java.util.LinkedList;
import java.util.Queue;

public class Q1Sort {
    public static void main(String[] args) {
        int[] nums={7,3,1,5,10,2,6,4,9,8};
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,nums.length-1});
        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            if(cur[0]>=cur[1]) continue;
            int m=Partation(nums,cur[0],cur[1]);
            queue.add(new int[]{cur[0],m-1});
            queue.add(new int[]{m+1,cur[1]});
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static int Partation(int[] nums, int l, int r) {
        int tmp=nums[l];
        while(l<r){
            while(l<r&&nums[r]>=tmp) r--;
            swap(nums,l,r);
            while(l<r&&nums[l]<=tmp) l++;
            swap(nums,l,r);
        }
        return l;
    }

    private static void swap(int[] nums, int l, int r) {
        int tmp=nums[l];
        nums[l]=nums[r];
        nums[r]=tmp;
    }
}

import java.util.*;

public class majorityelement{
    public static void main(String args[]){
        int nums[] = {2,1,4,2,5,4,2};
        int res = count(nums,0,nums.length-1);

        System.out.print(res);
    }
    public static int count(int nums[],int si,int ei){
        //base condition
        if(si==ei){
            return nums[si];
        }
        //kaam
        int mid = si + (ei-si)/2;

        int left = count(nums,si,mid);
        int right = count(nums,mid+1,ei);

        if(left==right){
            return left;
        }

        int leftcount = countinrange(nums,left,si,mid);
        int rightcount = countinrange(nums,right,mid+1,ei);

        return leftcount > rightcount ? left : right ;


    }
    private static int countinrange(int nums[],int num,int si,int ei){
        int count=0;
        for(int i=si;i<=ei;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
}
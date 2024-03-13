import java.util.*;

public class sortedrotatedloop{
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        System.out.print("target is at index: "+search(arr,0,0,arr.length-1));

    }
    public static int search(int arr[],int tar,int si, int ei){
        
        while(si<=ei){
            int mid = si + (ei-si)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[si]<=arr[mid]){
                if(arr[si]<=tar && tar<=arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                if(arr[mid]<=tar && tar<=arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
            
        }
        return -1;
        
    }
}
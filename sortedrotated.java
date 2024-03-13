import java.util.*;

public class sortedrotated{
    public static void main(String args[]){
        int arr[] = { 4,5,6,7,0,1,2};
        int tarind =  search(arr,0,0,arr.length-1);
         System.out.print("target is at index: "+tarind);
    }
    public static int search(int arr[], int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }

        //kaam
        int mid = si+ (ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }

        //if mid on line 1
        if(arr[si]<=arr[mid]){
            //case a left
             if(arr[si]<=tar && tar<=arr[mid]){
             return search(arr,tar,si,mid-1);
        }
        //case b  right
              else{
              return search(arr,tar,mid+1,ei);
        }
        }
        //if mid is on line 2
        else{
            //case c right
            if(arr[mid]<=tar && tar<=arr[ei]){
               return search(arr,tar,mid+1,ei);
            }
            //case d left
            else{
              return  search(arr,tar,si,mid-1);
            }
        }

       

    }
}
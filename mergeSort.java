import java.util.*;

public class mergeSort{
    public static void main(String args[]){
        int arr[]={2,5,7,1,6,3};
        mergesortalg(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void mergesortalg(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2 ;
        mergesortalg(arr,si,mid);   //left part
        mergesortalg(arr,mid+1,ei);   //right part

        merge(arr,si,ei,mid);

    }
    //merge method to merge the sorted parts
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];

        int i=si;  //for first part
        int j=mid+1;  //for second part
        int k=0;     //for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for remaining elements of leftsorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for remaining elements of rightsorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //assigning temp elements to array

        for(k=0,i=si; k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
}
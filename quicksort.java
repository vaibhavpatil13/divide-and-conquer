import java.util.*;

public class quicksort{
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quicksortalg(arr,0,arr.length-1);
        printarr(arr);

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksortalg(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //find pivot position
        int pind = partition(arr,si,ei);

        quicksortalg(arr,si,pind-1);   //left part
        quicksortalg(arr,pind+1,ei);   //right part

    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i= si-1;         //to take place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        //swap pivot
        int temp =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;         //pind
    }
}
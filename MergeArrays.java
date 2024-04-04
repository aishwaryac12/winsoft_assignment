/*
Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
*/



import java.io.*;
import java.util.Scanner;

class MergeArrays
{
    public static void main(String[] args) 
    {
        int[] x = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] y = {1, 8, 9, 10, 15};

        int[] mergedArr = merge(x, y); 

        for(int i=0; i<mergedArr.length; i++)
            System.out.print(mergedArr[i] + " ");
    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int index =0;
        //int[] mergedArr = new int[arr1.length];

        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] == 0)
            {
                arr1[i] = arr2[index];
                index++;
            }
        }
        return selectionsort(arr1);
    }

    public static int[] selectionsort(int[] arr)
    {
        int temp;
        int smallest;
        for(int i=0; i<arr.length-1; i++)
        {
            smallest=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
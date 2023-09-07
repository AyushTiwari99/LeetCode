//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        return search(arr,k,0,arr.length-1);
        
    }
    int search(int arr[], int k, int start, int end)
    {
        while(start<=end)
        {
            int mid =start+(end-start)/2;
            int x = arr[mid];
            if(x==k) return mid;
            else if(x<k) start=mid+1;
            else if(x>k) end=mid-1;
        }
        return -1;
    }
}
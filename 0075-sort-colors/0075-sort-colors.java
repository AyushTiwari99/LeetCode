class Solution {
    public void sortColors(int[] arr) 
    {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) a++;
            else if(arr[i]==1) b++;
            else if (arr[i]==2) c++;
        }
        for(int i=0;i<a;i++)
        {
            arr[i]=0;
        }
        for(int i=a;i<a+b;i++)
        {
            arr[i]=1;
        }
        int x=a+b;
        for(int i=x;i<x+c;i++)
        {
            arr[i]=2;
        }
    }
}
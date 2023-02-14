class Solution {
    public String addBinary(String a, String b) {
        int x=a.length();
        int y=b.length();
        int c=Math.max(x,y);
        char arr[]=new char[c];
        char arr1[]=new char[c];
        int flag=0;
        int p = c-1;
        for(int i=x-1;i>=0;i--)
        {
            arr[p]=a.charAt(i);
            p--;
        }        
        p = c-1;
        for(int i = y-1; i>=0; i--)
        {
            arr1[p]=b.charAt(i);
            p--;
        }
        for(int i=0; i<c; i++){
            if(arr[i] == '\u0000') arr[i] = '0';
            if(arr1[i] == '\u0000') arr1[i] = '0';
        }
        char total[] = new char[c+1];
        for(int i=c-1;i>=0;i--)
            {
                if(arr[i]=='1' && arr1[i]=='1' && flag != 1)
                {
                    flag=1;
                    total[i+1] = '0';
                    
                }
                else if(arr[i]=='1' && arr1[i]=='1' && flag == 1)
                {   flag = 1;
                    total[i+1] = '1';
                    
                }    
                else if(arr[i]=='0' && arr1[i]=='1' && flag == 1){
                    flag=1;
                    total[i+1] = '0';
                }
                else if(arr[i]=='1' && arr1[i]=='0' && flag == 1){
                    flag=1;
                    total[i+1] = '0';
                }
                else if(arr[i]=='0' && arr1[i]=='0' && flag == 1){
                    flag=0;
                    total[i+1] = '1';
                }
                else
                {
                    if(arr[i]=='0' && arr1[i]=='1')
                    {
                        total[i+1]='1';
                    }
                    else if(arr[i]=='1' && arr1[i]=='0')
                    {
                         total[i+1]='1';
                    }
                    else if(arr[i]=='0' && arr1[i]=='0')
                    {
                         total[i+1]='0';
                    }
                }
            }
            if(flag == 1){
                total[0] = '1';
            }
            String s;
            if(total[0] == '\u0000'){
                
                s = new String(total).substring(1);
            }
            else{
                s = new String(total);
            }
        return s;
    }
}
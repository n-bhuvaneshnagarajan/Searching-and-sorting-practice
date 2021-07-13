class SearchElement{
    int linearSearch(int[] a,int x,int n){
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
           
    }
}
class Searching{
    public static void main(String args[]) {
        int x,n;
        x = 10;
        n = 3;
        int arr[] = new int[20];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        SearchElement s = new SearchElement();
        int ans = s.linearSearch(arr,x,n);
        System.out.println(ans);       
    }
}
public class PeakElement {
    public static int peak(int arr[]){
int n=arr.length;
if(n==1){
    return 0;   
    }
    if(arr[0]>=arr[1]){
        return 0;
    }
    if(arr[n-1]>=arr[n-2]){
        return n-1;
    }
    int l=1;
    int r=n-2;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
            return mid;
        }
        else if(arr[mid-1]>arr[mid]){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        
    }
    return -1;
}
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        System.out.println(peak(arr));
    }
}


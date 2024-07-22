public class sumOf{
    public static int[] findTarget(int arr[],int target){
        int n=arr.length;
        int i=0;
        while (i<n) {
            int newTarget=target-arr[i];
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[j]+arr[k]+arr[l]==newTarget){
                            System.out.println(i+" "+j+" "+k+" "+l);
                        }
                    }
                }
            }
            i++;
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int arr[]={2,5,4,3,1,2};
        int target=10;
        findTarget(arr,target);
    }
}
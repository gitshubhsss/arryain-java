public class threesum {
     public static void threeSum(int[] nums) {
        int n=nums.length;
        int i=0;
        int target=0;
        while(i<n){
            int newTarget=target-nums[i];
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[j]+nums[k]==newTarget){
                        if(nums[i]==-1){
                            System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                        }
                    }
                }
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}

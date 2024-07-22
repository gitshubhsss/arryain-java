public class waterTank {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,2,3,8};
        int maxArea=Integer.MIN_VALUE;
        int n=arr.length;
        int start=0;
        int end=n-1;

        while (start<end) {
            int height=Math.min(arr[start], arr[end]);
            int width=end-start;
            int area=height*width;
            if(area>maxArea){
                maxArea=area;
            }
            if(start<end){
                start++;
            }
            else{
                end--;
            }

        }
        System.out.println(maxArea);


    }
}

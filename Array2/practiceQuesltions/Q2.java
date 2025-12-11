package Array2.practiceQuesltions;

public class Q2 {
    public static int printIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            //left half sorted
            else if (arr[start] <= arr[end]) {        
                if(arr[start] <= target && arr[end] >= target){
                    start = mid - 1;
                }
                else{
                    end  = mid + 1;
                }
            } 
            //Right halg sorted
            else {
                    if (target < arr[end] && target <= arr[end]) {
                        start = mid + 1;
                    }
                    else{
                        end = mid -1;
                    }
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int larget = 0;

        System.out.println(printIndex(arr, larget));
    }
}

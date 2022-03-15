package searching.linearSearching;

public class Main {

    public static void main(String[] args) {

        int[] nums = {23,10,58,14,19,55,77};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for (int index=0; index < arr.length; index++){
            //check element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;

    }
}

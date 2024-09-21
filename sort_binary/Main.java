import java.util.*; 

public class Main{


    public static void main(String[] args){

        // this code simply initializes an array and loops 
        // through them and displays the aray for us to see 
    

        int[] arrayOfNums = {8,6,9,5,3,2,0,1,10,4,7};
        System.out.print("original array: ");
        for(int i=0; i< arrayOfNums.length; i++)
        System.out.print(arrayOfNums[i] + " ");  

        // this is where the logic begins in sorting the array

        int temp= 0;

        for(int i=0; i< arrayOfNums.length; i++){
            for(int j = i +1; j< arrayOfNums.length; j++){
                if( arrayOfNums[j] < arrayOfNums[i]){
                    temp = arrayOfNums[i];
                    arrayOfNums[i] = arrayOfNums[j];
                    arrayOfNums[j] = temp;
                }
            }
        }
    

        // this code just prints out the new array for 
        //us to see with the logic implemented above 

        System.out.print("\n original array: ");
        for(int i=0; i< arrayOfNums.length; i++)
        System.out.print(arrayOfNums[i] + " "); 



        // Binary SEARCH for a target value

        int target = 8;

        // built in binary search 
        


        //

        // Custom Binary Search method

        public static int binarySearch(int[] arrayOfNums, int target){
            int low = 0;
            int high = arrayOfNums.length -1; 

            while (low <= high) {
                int middle = low + (high - low) / 2;
                int value = arrayOfNums[middle];
    
                if (value < target) {
                    low = middle + 1; // Search in the right half
                } else if (value > target) {
                    high = middle - 1; // Search in the left half
                } else {
                    return middle; // Target found
                }
            }
        

        return -1;

        

    }


}
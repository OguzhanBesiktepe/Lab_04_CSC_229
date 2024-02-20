public class BinarySearching {
    public static void main(String[] args) {
        //sorting the array by integers increasing by integers(multiples) of 3.
        int[] arr = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int target = 18;
        //Calling the Search itself:
        int index = BinarySearching(arr, target, 0, arr.length - 1);
        if (index != -1) {
            // Print Statements Listed Below
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    // Listed below is the search functions and calculations of the indexes.
    static int BinarySearching(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
            // searches the right half side of the array
        } else if (arr[mid] < target) {
            return BinarySearching(arr, target, mid + 1, right);
        } else {
            // this will search the left side of the array
            return BinarySearching(arr, target, left, mid - 1);
        }
    }
}

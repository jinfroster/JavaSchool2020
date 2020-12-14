public class BinarySearch {
    public BinarySearch() {
    }

    public int search(int[] arr, int val) {
        int left = 0, right = arr.length-1;
        int mid = (right + left) / 2;
        while(left < right) {
            if (arr[mid] < val) {
                left = mid+1;
            } else if (arr[mid] > val) {
                right = mid-1;
            } else {
                return mid;
            }
            mid = (right + left) / 2;
        }
        if(arr[mid]==val) {
            return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search");
        int arr[] = {3, 7, 1, 9, 888, 6, 6, 43, 19, 0, 22, 52};
        BubbleSort bubbleSort = new BubbleSort(arr);
        arr = bubbleSort.sort();
        bubbleSort.print();

        BinarySearch s = new BinarySearch();
        for (int i = 0; i < 10; i++) {
            //int i=1;
            System.out.printf("Search for %d: %d\n", i, s.search(arr, i));
        }
        System.out.printf("Search for %d: %d\n", 52, s.search(arr, 52));
        System.out.printf("Search for %d: %d\n", 887, s.search(arr, 887));
        System.out.printf("Search for %d: %d\n", 888, s.search(arr, 888));
        System.out.printf("Search for %d: %d\n", 889, s.search(arr, 889));
    }
}

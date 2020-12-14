public class BubbleSort {

    int[] arr;
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }
    void print() {
        for (int el: arr) {
            System.out.printf("%d ", el);
        }
        System.out.println("");
    }

    int[] sort() {
        return sort(true);
    }
    int[] sort(boolean asc) {
        int tmp;
        for (int pass = 0; pass < arr.length-1; pass++) {
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if ((asc && arr[i] > arr[i+1]) || (!asc && arr[i] < arr[i+1])) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int arr[] = {3,7,1,9,0,6,6};
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.print();
        bubbleSort.sort();
        bubbleSort.print();
        bubbleSort.sort(false);
        bubbleSort.print();
    }
}

public class SequentialSearch {
    public static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index of the key element if found
            }
        }
        return -1; // Return -1 if the key element is not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 1, 9, 4, 6};
        int key = 7;
        int index = sequentialSearch(numbers, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}

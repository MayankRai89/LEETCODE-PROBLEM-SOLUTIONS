
public class first_occurenceElement {

    public static void firstoccur(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5 };
        int target = 2;
        firstoccur(arr, target);

    }
}
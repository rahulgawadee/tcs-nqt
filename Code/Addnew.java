public class Addnew {

    public static void addnew(int arr[]) {
        int newE = 8;
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = newE;

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 3, 4, 6};
        addnew(arr);
    }
}

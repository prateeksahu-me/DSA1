import java.util.*;

class SortArray {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        String sortedArr[] = sortArray(n, arr);

        for (String word : sortedArr)
            System.out.print(word + " ");
    }

    // TODO: Implement this method
    static String[] sortArray(int n, String[] arr) {

        List<String> l1 = Arrays.asList(arr);
        Collections.sort(l1);

        String[] stringArray = l1.toArray(new String[0]);
        return stringArray;
    }
}

package tekrarcalismalarim;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        int brr[] = {12, 23, 12, 2, 3};
        Arrays.sort(brr);
        System.out.println(Arrays.binarySearch(brr, 12));


        char arr[] = new char[4];
        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';
        System.out.println(Arrays.toString(arr));


            String str = "Cok calis, mutevazi ol";
            String strArray[] = str.split(",");
            System.out.println(Arrays.toString(strArray));

        String tr = "Cok calis, mutevazi ol";
        String trArray[] = tr.split(" "); // cift tirnak içinde space var
        System.out.println(Arrays.toString(trArray));


    }
}

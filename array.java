import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /*
        //q.1  store a roll no
       // int a = 23;
        //q2. store person name
        //String name = " shainky thakur";
        //q3. store 5 roll no
       // int rno1 = 12;
        int rno2 = 131;
        int rno3 = 45;
        int rno4 = 14;
        int rno5 = 15;
        // Q4. if we need to store the 100000 student rno then why we need to do
        // this method are  not allow
        // we use the array to store the data of  similar data type

        // declaration of an array
        // datatype[] ref variable = new datatype[size]
           int[] arr = new int[5];
        // or diractly
          int[] arr2 = {2,3,4,5};// all the type of data should be same
          int[] rnos;// declaration of array rnos is geting defined in the stack
          rnos = new int[5];// initialization : actually hera boject is being created in the heap
        System.out.println(rnos[1]);
        String[] str = new String[5];
        System.out.println(str[0]);

         */
//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 13;
//        arr[2] = 14;
//        arr[3] = 125;
//        arr[4] = 126;
//        System.out.print(arr[0] + " , ");
//        System.out.print(arr[1] + " , " );
//        System.out.print(arr[2] + " , ");
//        System.out.print(arr[3] + " , ");
//        System.out.print(arr[4] + " ");
        // this is no t a suiatable method no we use the for loop
//       Scanner sc = new Scanner(System.in);
//       int[] arr= new int[5];
//       for(int i=0; i<arr.length; i++ ) {
//           arr[i] = sc.nextInt();
//       }
//        for(int i=0; i<arr.length; i++ ) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for(int num : arr) {// for every element in array , print the element
//            System.out.print(num + " ");// here num represents the element of an array
//        }
//        System.out.println(Arrays.toString(arr));// to add braces and ,
//        //  System.out.println(arr[5]);// error index are not bound




        // array of object
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0 ; i< str.length; i++) {
            str[i] = sc.next();
            System.out.print(str[i] + " ");
//           System.out.println(Arrays.toString(str));
        }
        System.out.println();
//       modify
        str[1] = " aa";
        System.out.println(Arrays.toString(str));


        //multidimentional array
    }
}
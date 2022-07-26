public class ArraysPracticeSet {
    public static void main(String[] args) {

        // practice problem 1 create an array of 5 floats and add them
        // 1st method
//        float []marks ={20.5f,30.5f,10.5f,40.5f,50.5f};
//        float sum=0;
//        for (int i=0;i< marks.length;i++){
//          sum+=marks[i];
//        }
//        System.out.println(sum);
        // for each loop method
//        float []marks ={20.5f,30.5f,10.5f,40.5f,50.5f};
//        float sum=0;
//        for (float element : marks){
//            sum+=element;
//        }
//        System.out.print("sum is equals to = "+sum);

        // Practice Problem 02

//        float []marks ={20.5f,30.5f,10.5f,40.5f,50.5f};
//        float num=40.5f;
//        boolean isInaArray = false ;
//        for (int i=0;i< marks.length;i++) {
//            if (num == marks[i]) {
//                isInaArray = true;
//                break;
//            }
//        }if (isInaArray){
//                System.out.println("present in array");
//            } else {
//                System.out.println("not present in array");
//            }
        // for each loop method
//        float []marks ={20.5f,30.5f,10.5f,40.5f,50.5f};
//        float num=30.55f;
//        boolean isInArray = false ;
//        for (float element : marks) {
//            if (num== element)
//            {
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//                System.out.println("present in array");
//            } else {
//            System.out.println("not present in array");
//           }
        // Practice Problem 4
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }

           // problem no 5 reverse an array
//        int[] a = {1, 2, 3, 4, 5, 6, 7};
//        int l = a.length;
//        int num = Math.floorDiv(l, 2);
//        int temp;
//        for (int i = 0; i < num; i++) {
//            temp = a[i];
//            a[i] = a[l - i - 1];
//            a[l - i - 1] = temp;
//        }
        //enhanced for loop ;
//        for (int j : a) {
//            System.out.print("" + j);
////        }
//       for (int i=0;i<l;i++){
//            System.out.print(""+a[i]);
//        }

        // Practice problem 6 maximum and minimum no
//        int []num={1,2,3,4,5,6};
//        int max=0,min=Integer.MAX_VALUE;
//        for (int i=0;i<num.length;i++){
//            if(num[i]>max){
//                max=num[i];
//            }
//            if (num[i]<min){
//                min=num[i];
//            }
//        }
//
//        System.out.println("Maximum no is : "+max+"\nMinimum no is : "+min);

        // practice problem 8 check whether array is sorted or not
//        int []num={5,2,3,4,5,6};
//        boolean isSorted = true;
//        for (int i=0 ;i< num.length-1;i++){
//            if (num[i]>num[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }

        int []num={1,2,10,4,6};
        for (int i=0 ;i< num.length;i++) {
            for (int j=i+1;j< num.length;j++)
            {
               if (num[i] > num[j])
               {
                 int temp=num[i];
                num[i]=num[j];
               num[j]=temp;
               }
            }
            System.out.println(num[i]);
        }


      }
    }


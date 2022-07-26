public class Arrays {
    public static void main(String[] args) {



//        int [] marks = {98, 45, 79, 99, 80}; // integer array
//
//        System.out.println(marks.length);
//        System.out.println(marks[1]);

//        float [] marks = {98.1f, 45.5f, 79f, 99f, 80f}; // floatin  array
//        System.out.println(marks.length); // array.length for the length of the array
//        System.out.println(marks[0]);   // for displaying an array
//
//        String []students = {"shoaib","shehbaz","kishore","akash"}; // String array
//        System.out.println(students.length);
//        System.out.println(students[1]);

        int [] marks = {98, 45, 79, 99, 80};
        // (Naive way) Displayimg an arry
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

         // Displaying array
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){

            System.out.println(marks[i]);
        }
        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

    }
}

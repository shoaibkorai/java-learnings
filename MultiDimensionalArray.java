public class MultiDimensionalArray {
    public static void main(String[] args) {

//          // 2d array displaying
//        int [][]marks= new int[2][3];
//        marks [0][0]=100;
//        marks [0][1]=200;
//        marks [0][2]=300;
//        marks [1][0]=400;
//        marks [1][1]=500;
//        marks [1][2]=600;
//        for (int i=0;i<marks.length;i++){
//            for (int j=0;j< marks[i].length;j++){
//                System.out.print(" "+marks[i][j]);
//
//            }
//            System.out.println("");
//        }
        // 3D-array displaying
        int[][][] marks = new int[2][2][2];
        System.out.println("legnth of the array "+marks.length);
        marks[0][0][0] = 100;
        marks[0][0][1] = 200;
        marks[0][1][0] = 300;
        marks[0][1][1] = 400;
        marks[1][0][0] = 500;
        marks[1][0][1] = 600;
        marks[1][1][0] = 700;
        marks[1][1][1] = 800;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[j].length; k++) {
                    System.out.print(" " + marks[i][j][k]);

                }
            }
        }
    }
}

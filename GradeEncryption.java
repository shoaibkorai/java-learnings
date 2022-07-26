public class GradeEncryption {
    public static void main(String[] args) {
        char grade;
        grade = 'B';
        grade= (char)(grade+8);
        System.out.println(grade);
        //Encrypt the grade by substracting 8
        grade= (char)(grade-8);
        System.out.println(grade);

    }

}

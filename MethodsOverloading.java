public class MethodsOverloading {

    static void gm(){
        System.out.println("Good Morning");
    }
    static void gm(int a){
        System.out.println(a+"Good  Morning");
    }
    static void gm(int a , int b){
        System.out.println(a+"Good "+b+"Morning");
    }

    public static void main(String[] args) {

    gm();
    gm(100);
    gm(200,300);

    }
}

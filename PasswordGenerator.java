import java.util.Random;

public class PasswordGenerator {
    public static void main (String[] args){

        String upper   ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower   ="abcdefghijklmnopqrstuvwxyz";
        String num     = "0123456789";
        String symbols ="/*-+,.!@#$%^&*_<>";
        String combination = upper+lower+num+symbols;
       int  len = 8;
       char [] password = new char[len];
        Random r = new Random();
        for(int i=0;i<len;i++)
        password[i] =combination.charAt (r.nextInt(combination.length()));
        System.out.println("Your Password is : "+new String(password));
    }
}

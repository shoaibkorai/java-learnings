import java.util.Locale;

public class StringsPracticeSet {
    public static void main(String[] args) {


        // Q1 convert string to uppercase
        String name = "shoaib korai";
        String str=name.toUpperCase();
        System.out.println(str);

        // Q2 replace spaces with underscores
        String name1 = "shoaib    korai";
        str = name1.replace(" ","_");
        System.out.println(str);

        // Q3 replace name with sourcre name
        String letter = "Dear <|name|> thanks a lot ";
        letter =letter.replace("<|name|>","shoaib");
        System.out.println(letter);


        }
    }


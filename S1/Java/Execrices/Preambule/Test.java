import java.lang.String;

public class Test{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            int j = i + 1;
            System.out.println("Argument numero : " + j + "\n Argument : " + args[i]);
        }
    }
}
import java.util.Scanner;
public class Person {
    static int codeStorage[]=new int[4];
    static int amountStorage[]=new int[4];
    static int idisStorage[]=new int[4];
    static String passwordStorage[]=new String[4];
    static String nameStorage[]=new String[4];
    static boolean onStorage[]=new boolean[4];
    public Scanner in=new Scanner(System.in);

    public void show(int code){
        System.out.println("---- INFO ----");
        System.out.println("\nYour amount : "+amountStorage[code]+" $$");
        System.out.println("Your ID : ("+idisStorage[code]+")");
        System.out.println("Your name : \""+nameStorage[code]+"\"");
    }
}

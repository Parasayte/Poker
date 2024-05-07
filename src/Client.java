public class Client extends Operation{
    private int idClient=230;
    private String passwordClient="AWM1234";
    static int amountClient=0;

    public void logInClient(){
        System.out.println("-------= PRO LOG IN =-------");
        System.out.print("\nEnter ID : ");
        int idLogin=in.nextInt();
        System.out.print("\nEnter password : ");
        String passwordLogin=in.next();
        if(idLogin==idClient&&passwordLogin.equals(passwordClient)){
            System.out.println("_- welcome -_\n");
            menuClient();
        }
        else{
            System.err.println("Check password or id and try again !\n");
            logInClient();
        }
    }
    public void menuClient(){
        System.out.println("Choose operation\n1.Show info\n2.Stop an accont\n3.Show users Accounts\n4.Exit");
        int choose=in.nextInt();
        switch (choose){
            case 1:
                System.out.println("\n ----- INFO -----");
                System.out.println("Your ID : "+idClient);
                System.out.println("Your Password : |"+passwordClient+"|");
                System.out.println("Your amount : "+amountClient+" $$");
                System.out.println();
                menuClient();
                break;
            case 2:
                System.out.println("Enter account code : ");
                int code= in.nextInt();
                if(code>4){
                    System.out.println("There is no Account !\n");
                menuClient();
                }
                else{
                System.out.println("The account name is : "+nameStorage[code]);
                System.out.println("Stoped !\n"+nameStorage[code]+" is stop !\n");
                onStorage[code]=false;
                }
                menuClient();
                break;
            case 3:
                for (int i=0;i<4;i++){
                    System.out.println("Name : -= "+nameStorage[i]+" =-");
                    System.out.println("------------------------");
                    System.out.println("Amount : "+amountStorage[i]+" $");
                    System.out.println("ID : "+idisStorage[i]);
                    System.out.println("Password : |"+passwordStorage[i]+"|");
                    System.out.println("Code : ("+codeStorage[i]+")");
                    System.out.println("Is on : \""+onStorage[i]+"\"");
                    System.out.println("\n");
                }
                menuClient();
                break;
            case 4:
                menu();
        }
    }
}

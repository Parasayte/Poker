

public class User extends Operation{
   static int i=0;

    public void loginUser(){
        if(nameStorage.equals(null)){
            System.err.println("There are no accounts !\n");
            menu();}
        else {
            System.out.println("------- USER LOGIN -------");
            System.out.print("\nEnter Your Code : ");
            int code=in.nextInt();
            if(code>=nameStorage.length||code<0){
                System.out.println("\nWrong Code !");
                menu();
            }
            else if (onStorage[code]=false) {
                System.err.println("Your account has stopped !\n");
                menu();
            }
            else{
                System.out.println("\nWELCOME =* "+nameStorage[code]+" *=\n");
                System.out.print("\nEnter ID :");
                int idLogin=in.nextInt();
                System.out.print("\nEnter Password : ");
                String passwordLogin=in.next();
                if(idLogin==idisStorage[code]&&passwordLogin.equals(passwordStorage[code])){
                    System.out.print("\n_- WELCOME -_\n");
                    menuUser(code);
                }
                else {
                    System.err.print("\nCheck password or ID and try again !\n");
                    menu();
                }
            }
        }
    }

    public void signUpUser(){
        System.out.println("-------= SIGN UP =-------");
        if(i>=nameStorage.length){
            System.err.println("Storage is full !");
            menu();
        }
        else {
            System.out.print("\nEnter name : ");
            String nameSignUp=in.next();
            nameStorage[i]=nameSignUp;
            System.out.print("\nEnter ID : ");
            int idSignUp=in.nextInt();
            idisStorage[i]= idSignUp;
            System.out.print("\nEnter password : ");
            String passwordSignUp=in.next();
            passwordStorage[i]=passwordSignUp;
            int code=i;
            codeStorage[i]=i;
            System.out.println("\nYour code : "+code+"\n");
            System.out.println("\n-= Succeful =-\n");
            onStorage[i]=true;
            i++;
            menu();
        }
    }

    public void menuUser(int code){
        System.out.println("\n------= USER MENU =------");
        System.out.println("Enter the operation :\n1.Deposit \n2.Withdraw\n3.Trans\n4.Show account info\n5.Show info \n6.Exit");
        int choosing=in.nextInt();
        switch (choosing){
            case 1:
                System.out.print("\nEnter deposit amount ");
                int depositMoney=in.nextInt();
                deposit(depositMoney,code);
                break;
            case 2:
                System.out.print("\nEnter withdraw amount : ");
                int withdrawMoney=in.nextInt();
                withdraw(withdrawMoney,code);
                break;
            case 3:
                System.out.println("---- trans ----");
                System.out.print("\nEnter trans code : ");
                int trans=in.nextInt();
                System.out.println("You will trans to \" "+nameStorage[trans]+" \"");
                System.out.print("\nEnter amount of trans : ");
                int trnamMoney=in.nextInt();
                trans(trnamMoney,code,trans);
                break;
            case 4:
                showinformation();
                break;
            case 5:
                show(code);
                menuUser(code);
                break;
            case 6:
                menu();
        }
    }}


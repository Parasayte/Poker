public class Operation extends Person{
    public void deposit(int depositMoney,int code){
        User runUser=new User();
        System.out.println("---- Deposit ----");
        amountStorage[code]=amountStorage[code]+depositMoney;
        show(code);
    runUser.menuUser(code);
    }

    public void withdraw(int withdrawMoney,int code){
        User runUser=new User();
        System.out.println("---- withdraw ----");

        if(withdrawMoney>amountStorage[code]){
            System.err.println("There is not enough money !\n");
            runUser.menuUser(code);
        }
        else {
            amountStorage[code]=amountStorage[code]-withdrawMoney;
        }
        show(code);
runUser.menuUser(code);    }

    public void trans(int transMoney,int code ,int transCode){

        User runUser=new User();
        if(transMoney>amountStorage[code]){
            System.err.println("There is not enough money !\n");
            show(code);
            runUser.menuUser(code);
        }
        else {
            amountStorage[code]=amountStorage[code]-transMoney;
            amountStorage[transCode]=amountStorage[transCode]+transMoney;
        }
        show(code);
runUser.menuUser(code);
    }

    public void showinformation(){
        User runUser=new User();
        System.out.println("---- YOUR INFO ----");
        System.out.print("\nEnter your code : ");
        int code= in.nextInt();
        System.out.print("\nEnter password : ");
        String password=in.next();
        if(password.equals(passwordStorage[code])) {
            System.out.println("\nYour ID : (" + idisStorage[code]+")");
            System.out.println("Your name : \"" + nameStorage[code]+"\" ");
            System.out.println("Your password : |" + passwordStorage[code]+"|");
            System.out.println("Your amount : " + amountStorage[code]+" $$");
            runUser.menuUser(code);
        }
        else{
            System.err.println("\nIncorrect password !");
        runUser.menuUser(code);
        }
    }

    public void menu(){
        User runUser=new User();
        Client run=new Client();
        System.out.println("-------= MAIN MENU =-------");
        System.out.println("\nEnter operation :\n1.Sign up as user\n2.Log in as user\n3.Client log in\n4.Exit\n");
        int choosing=in.nextInt();
        switch (choosing) {
            case 1:
                runUser.signUpUser();
                break;
            case 2:
             runUser.loginUser();
                break;
            case 3:
             run.logInClient();
                break;
            case 4:
                System.exit(0);
        }
    }
}

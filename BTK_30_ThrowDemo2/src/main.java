public class main {
    public static void main(String[]args){
        AccountManager manager = new AccountManager();
        System.out.println("Hesap : "+manager.getBallance());
        manager.deposit(100);
        System.out.println("Hesap : "+manager.getBallance());
        //throw olduğu metodda için try ve catch eklemeliyiz
        //veya en başa Exception implement ederiz
        try {
            manager.withdraw(90);
        }catch(BallanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap : "+manager.getBallance());
        try {
            manager.withdraw(20);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap : "+manager.getBallance());
    }
}

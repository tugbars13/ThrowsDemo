public class AccountManager {
    private double ballance;

    public double getBallance() {
        return ballance;
    }

    public void deposit(double amount){
        ballance += amount;
    }
    public void withdraw(double amount) throws BallanceInsufficentException{
        if (ballance >= amount) {
            ballance = getBallance() - amount;
        }else{
            throw new BallanceInsufficentException("Bakiye yetersiz");
        }
    }
}

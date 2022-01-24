public abstract class Worker implements Information {
    protected String name;
    protected int ID;
    protected int earnedMoney = 0;
    public abstract void doJob(int money);

    public abstract int getEarnedMoney();

    public abstract int getID();
}

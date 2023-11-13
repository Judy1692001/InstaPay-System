package registration;

public class InstaPayDB {

    private User [] systemDB;

    public InstaPayDB(User [] systemDB)
    {
        this.systemDB = systemDB;
    }

    public void setSystemDB(User [] systemDB)
    {
        this.systemDB = systemDB;
    }

    public User [] getSystemDB()
    {
        return systemDB;
    }
}

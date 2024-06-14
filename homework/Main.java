package homework;

public class Main{
    public static void main(String[] args){
        // User user = new User("Bob");
        // user.report();
        // user.save();

        User user = new User("Bob");
        
        Reporter reporter = new UserReporter(user);
        Persister persister = new UserPersister(user);

        persister.save();
        reporter.report();
        



    }
}
package homework;

// Переименовал класс из Persister в UserPersister и имплементировал его от интерфейса Persister

public class UserPersister implements Persister{
    private final User user;

    public UserPersister(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}

package homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    // Класс User отвечает за различные действия: возвращает поле name, сохраняет сам себя и выврдит отчет
    // необходимо вынести методы save и report в разные классы, а в классе User удалить данные методы

    // public void save(){
    //     UserPersister persister = new UserPersister(this); // Нарушение принципа инверсии зависимостей, т.к. тесно связан "сохраняльщик" и "юзер"
    //     persister.save();
    // }

    // public void report(){
    //     System.out.println("Report for user: " + name); // Вынесу данный метод в отдельный класс
    // }
}

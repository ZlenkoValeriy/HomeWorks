

public class Cat extends Animal implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    void run() {
        System.out.println("Вопроc: - чтобы ты сказал кице?");
        System.out.println("Ответ: - беги кица, беги!!!");
    }
    @Override
    void eat() {
        System.out.println("Кице надо кушать!");
    }
    @Override
    void sleep() {
        System.out.println("Кице надо спать!");
    }
    @Override
    public void meow() {
        System.out.println("Кица зараза миукает!");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

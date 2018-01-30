public abstract class Animal {

    private Integer age;
    private Integer weight;

    abstract void run();
    abstract void eat();
    abstract void sleep();

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

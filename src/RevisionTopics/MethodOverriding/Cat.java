package RevisionTopics.MethodOverriding;

public class Cat extends Dog{
    public void sound()
    {
        System.out.println("cat is meow");
    }

    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.sound();
        Dog dog = new Dog();
        dog.sound();
    }
}

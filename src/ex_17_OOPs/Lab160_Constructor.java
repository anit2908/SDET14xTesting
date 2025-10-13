package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args){
     Student s1 = new Student() {};
     Student s2 = new Student("Anit");
     s2.sleep();
     s2.eat();


    }
}

class Student {
    String name;

    // DC
    Student() {
        System.out.println("DC -> Hi, i am called.");
    }

    // PC
    Student(String name) {
        System.out.println("PC -> Hi," + name);
    }


    void sleep() {
        System.out.println("I am sleeping");
    }

    void study() {
    }

    void eat() {
        System.out.println("I am eating");
    }

}

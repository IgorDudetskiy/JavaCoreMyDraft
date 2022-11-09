package samples_31_10;

public abstract class Person {
    public Person(String name) {
        this.name = name;
    }

    String name;

    public abstract void print();
}

 abstract class Staff extends Person {
     final String TYPE_PERSON = "Staff";
     public Staff(String name) {
         super(name);
         this.name = TYPE_PERSON;

     }

     @Override
    public void print() {
        System.out.println("I am "+ name);
    }
    public abstract void salary();


}

class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        this.name = TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am "+ name);
    }
}

class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";


    public Teacher(String name) {
        super(name);
        this.name= TYPE_PERSON;
    }

    public void print() {
        System.out.println("I am "+name);
    }

    @Override
    public void salary() {
        System.out.println("1200");
    }
}

class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        this.name= TYPE_PERSON;
    }


    public void print() {
        System.out.println("I am "+ name);
    }

    @Override
    public void salary() {
        System.out.println("600");
    }

}
package BasicPrograms;

// main concepts
// class -- logical entity -- blueprint for the objects , objects  -- instance of a class
//  inheritance , polymorphism -- overloading and overriding , encapsulation , abstraction
// extra concepts - coupling -- coupling meaning dependency of other classes on class
//  cohesion -- mixing of classes java.io is highly cohesive , java.util is less cohesive, association , aggreagaaiton , composition

import java.security.spec.ECField;

interface testInterface {
    public void testMethodI();
}
class Student {
    int id ;
    String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

// different ways to initialize the object s
// using constructor , using method , using reference variable
// objects gets stored in the heap memory while its reference in the stack



// different ways to initialize the object
// new keyword
// new instance method
// clone method
// deserialization
// by factory methods

public class OopsClass {
    public static void main(String[] args)    {
        Student st = new Student(1,"one");
        System.out.println(st);

        try {
            Class c = Class.forName("Student");
            Student st1 =(Student) c.newInstance();
            System.out.println(st1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

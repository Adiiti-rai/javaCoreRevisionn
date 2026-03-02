package immutableClass;

public final class Student {

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


// How to create a custom immutable class----
// 1. making class final
//2. use only getter method
//3. don't use setter method
//4. all Fields making private and final.
//5. use a parameterized constructor
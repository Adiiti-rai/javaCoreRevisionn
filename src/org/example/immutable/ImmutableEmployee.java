package org.example.immutable;
import java.util.*;
//Here is  a custom immutable class named ImmutableEmployee that includes both an
// immutable field (name, id) and a mutable field (department a List).

public final class ImmutableEmployee {
    private final int id;
    private final String name;
    private final List<String> department;

    public ImmutableEmployee(int id, String name, List<String> department) {
        this.id = id;
        this.name = name;
        this.department = new ArrayList<>(department);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getDepartment() {
        return Collections.unmodifiableList(department);
    }
public static void main(String[] args){
    List<String>department= new ArrayList<>();
    department.add("HR");
        ImmutableEmployee employee= new ImmutableEmployee(101,"Aditi",department);
    System.out.println(employee.getId());
    System.out.println(employee.getName());
    System.out.println(employee.getDepartment());

}
}

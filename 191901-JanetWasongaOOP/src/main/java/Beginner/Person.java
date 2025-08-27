
package Beginner;

abstract class Person {
    private int id;
    private String name;
    private String contact;

    public Person(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Encapsulation (getters & setters)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }  // protected access

    // Abstract methods → must be implemented by subclasses
    public abstract String getRawName();
    public abstract void displayInfo();
}
    


public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(String name, String surname) {
        return this.getName() == name && this.getSurname() == surname;
    }

    public int hashCode() {
        return (int) (31*Math.random());
    }

}

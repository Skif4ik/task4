package people;

public class Person implements IOwner {
    private String passNumber;
    private String fullName;

    public Person() {
    }

    public Person(String passNumber, String fullName) {
        this.passNumber = passNumber;
        this.fullName = fullName;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getNumber() {
        return passNumber;
    }

    @Override
    public String getName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (passNumber != null ? !passNumber.equals(person.passNumber) : person.passNumber != null) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = passNumber != null ? passNumber.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "passNumber='" + passNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
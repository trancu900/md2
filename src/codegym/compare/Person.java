package codegym.compare;

public class Person {// implements Comparable<Person> {
    private Long id;
    private String fullName;
    private Double age;

    public Person(Long id, String fullName, Double age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
//
//    @Override
//    public int compareTo(Person o) {
//        return o.age - age;
//    }
}

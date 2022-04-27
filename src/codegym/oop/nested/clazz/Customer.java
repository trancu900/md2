package codegym.oop.nested.clazz;

public class Customer {
    private int id;
    private String fullName;
    Address address;

    public Customer(int id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address.Location location = new Address.Location(234.34, 3435.43);
        Address address = new Address("28", "Nguyen Tri Phuong", "Huế", location);
        Customer customer = new Customer(1, "Anh Nguyen", address);
        System.out.println(customer);
    }
}

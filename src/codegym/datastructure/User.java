package codegym.datastructure;

import java.time.Instant;

public class User implements Comparable<User> {
    private int id;
    private String username;
    private int age;

    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = o.age - age;
        if (result == 0) {
            result = o.username.compareTo(username);
        }
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

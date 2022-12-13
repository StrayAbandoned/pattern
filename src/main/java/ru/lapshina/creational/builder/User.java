package ru.lapshina.creational.builder;

public class User {
    private String name;
    private String username;
    private String email;
    private String address;
    private int age;
    private int weight;
    private int height;

    private User(Builder builder) {
        name = builder.name;
        username = builder.username;
        email = builder.email;
        address = builder.address;
        age = builder.age;
        weight = builder.weight;
        height = builder.height;
    }

    public static Builder newBuilder(User copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.username = copy.getUsername();
        builder.email = copy.getEmail();
        builder.address = copy.getAddress();
        builder.age = copy.getAge();
        builder.weight = copy.getWeight();
        builder.height = copy.getHeight();
        return builder;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String username;
        private String email;
        private String address;
        private int age;
        private int weight;
        private int height;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withUsername(String val) {
            username = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withAddress(String val) {
            address = val;
            return this;
        }

        public Builder withAge(int val) {
            age = val;
            return this;
        }

        public Builder withWeight(int val) {
            weight = val;
            return this;
        }

        public Builder withHeight(int val) {
            height = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

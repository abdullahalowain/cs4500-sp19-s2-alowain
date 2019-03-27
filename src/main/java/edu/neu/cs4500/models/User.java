package edu.neu.cs4500.models;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(int i, String username, String password, String firstName, String lastName) {
        this.id = i;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // provide a public set and get method for each of the class variables above
    // make sure to use proper naming conventions for Java methods, e.g.,
    // methods should be camelcase. Here's an example using the firstName variable:
     public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return this.id;
    }
}

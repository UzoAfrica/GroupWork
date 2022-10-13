package org.example;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String noOfLegs;


    public User(String name, String email, String phoneNumber, String noOfLegs) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.noOfLegs = noOfLegs;
    }

}

    public String dance() {
    if (noOfLegs == 2) return "I can dance";
    return "I cant dance with just a single leg";

    }
}

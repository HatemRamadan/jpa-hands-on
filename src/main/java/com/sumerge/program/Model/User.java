package com.sumerge.program.Model;

public class User {
        private String name;
        private int ID;
        private String address;
        private String email;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User(String name, int ID, String address, String email){
            this.name = name;
            this.ID = ID;
            this.address = address;
            this.email = email;
        }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.twu.biblioteca;

public class User {
    private String Name;
    private String Password;
    private String email;
    private String phone;

    public User(String name, String password, String email, String phone){
        this.email = email;
        this.phone = phone;
        this.Name = name;
        this.Password = password;
    }

    public String GetName(){
        return this.Name;
    }

    public boolean verify(String password){
        return this.Password.equals(password);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tEmail\tPhone:\n");
        stringBuilder.append(this.Name+"\t"+this.email+"\t"+this.phone+"\n");
        return stringBuilder.toString();
    }
}

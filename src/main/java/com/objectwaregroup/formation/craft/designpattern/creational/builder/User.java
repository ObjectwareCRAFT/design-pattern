package com.objectwaregroup.formation.craft.designpattern.creational.builder;

public class User {

  private String name;
  private String surname;
  private String email;
  private String phone;
  private String address;

  public User(String name,
              String surname,
              String email,
              String phone,
              String address) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.phone = phone;
    this.address = address;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withSurname(String surname) {
      this.surname = surname;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(name, surname, email, phone, address);
    }

  }

}

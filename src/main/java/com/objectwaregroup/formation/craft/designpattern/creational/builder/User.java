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

}

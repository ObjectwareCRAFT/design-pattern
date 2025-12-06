package com.objectwaregroup.formation.craft.designpattern.creational.builder;

public class CreateUserExample {

  public User createUser() {
    return User.builder()
        .withName("John")
        .withSurname("Smith")
        .withEmail("john.smith@objectwaregroup.fr")
        .withPhone("0123456789")
        .withAddress("10 rue messine")
        .build();
  }

  public User createUserWithoutBuilder() {
    return new User(
        "John",
        "Smith",
        "john.smith@objectwaregroup.fr",
        null,
        "10 rue messine"
    );
  }

}

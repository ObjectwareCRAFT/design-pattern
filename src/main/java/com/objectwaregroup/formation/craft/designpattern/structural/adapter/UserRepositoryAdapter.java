package com.objectwaregroup.formation.craft.designpattern.structural.adapter;

import com.objectwaregroup.formation.craft.designpattern.structural.adapter.domain.User;
import com.objectwaregroup.formation.craft.designpattern.structural.adapter.domain.UserRepository;

public class UserRepositoryAdapter implements UserRepository {

  private final UserJpaRepository userJpaRepository;

  public UserRepositoryAdapter(UserJpaRepository userJpaRepository) {
    this.userJpaRepository = userJpaRepository;
  }

  @Override
  public User findByName(String name) {
    UserEntity entity = userJpaRepository.findByName(name);
    return new User(entity.name(), entity.surname());
  }

}

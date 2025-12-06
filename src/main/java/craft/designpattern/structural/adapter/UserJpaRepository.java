package craft.designpattern.structural.adapter;

public interface UserJpaRepository {

  UserEntity findByName(String name);

}

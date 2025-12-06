package craft.designpattern.structural.adapter.domain;

public interface UserRepository {

  User findByName(String name);

}

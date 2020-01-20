package courses.practice.task00project.repository;

import courses.practice.task00project.domain.User;

public interface UserRepository extends CrudRepository<User> {

    User findByEmail(String email);
}

package courses.practice.task00project.repository.impl;

import courses.practice.task00project.domain.User;
import courses.practice.task00project.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public void save(User entity) {
        if (entity != null) {
            if (!users.containsKey(entity.getId())) {
                users.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("Cant found user with same id");
            }
        } else {
            throw new IllegalArgumentException("Err NullUser");
        }
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findById(Integer id) {
        if (id != null) {
            return users.get(id);
        } else {
            throw new IllegalArgumentException("Err NullID");
        }
    }

    @Override
    public void update(User entity) {
        if (entity != null) {
            if (users.containsKey(entity.getId())) {
                users.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("Cant found user with same id");
            }
        } else {
            throw new IllegalArgumentException("Err NullUser");
        }
    }

    @Override
    public void deleteById(Integer id) {
        if (id != null) {
            users.remove(id);
        } else {
            throw new IllegalArgumentException("Err NullID");
        }
    }

    @Override
    public User findByEmail(String email) {
        return users.values().stream().filter(o -> o.getEmail().equals(email)).findFirst().orElse(null);
    }


}
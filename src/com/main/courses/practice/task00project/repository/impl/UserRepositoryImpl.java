package courses.practice.task00project.repository.impl;

import courses.practice.task00project.domain.User;
import courses.practice.task00project.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> userIdToUser = new HashMap<>();

    @Override
    public void save(User entity) {
        if (entity != null) {
            if (!userIdToUser.containsKey(entity.getId())) {
                userIdToUser.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("Cant found user with same id");
            }
        } else {
            throw new IllegalArgumentException("Err NullUser");
        }
    }

    @Override
    public User findById(Integer id) {
        if (id != null) {
            return userIdToUser.get(id);
        } else {
            throw new IllegalArgumentException("Err NullID");
        }
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userIdToUser.values());
    }

    @Override
    public void update(User entity) {
        if (entity != null) {
            if (userIdToUser.containsKey(entity.getId())) {
                userIdToUser.put(entity.getId(), entity);
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
            userIdToUser.remove(id);
        } else {
            throw new IllegalArgumentException("Err NullID");
        }
    }

    @Override
    public User findByEmail(String email) {
        return userIdToUser.values().stream().filter(o -> o.getEmail().equals(email)).findFirst().orElse(null);
    }


}
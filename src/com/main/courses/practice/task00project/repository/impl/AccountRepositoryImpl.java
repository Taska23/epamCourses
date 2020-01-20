package courses.practice.task00project.repository.impl;

import courses.practice.task00project.domain.Account;
import courses.practice.task00project.repository.AccountRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {private final Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void save(Account entity) {
        if (entity != null) {
            if (!accounts.containsKey(entity.getId())) {
                accounts.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("Err");
            }
        }
    }


    @Override
    public Account findById(Integer id) {
        if (id != null) {
            return accounts.get(id);
        } else {
            throw new IllegalArgumentException("Err");
        }
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public void update(Account entity) {
        if (entity != null) {
            if (accounts.containsKey(entity.getId())) {
                accounts.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("Err");
            }
        }
    }

    @Override
    public void deleteById(Integer id) {
        if (id != null) {
            accounts.remove(id);
        } else {
            throw new IllegalArgumentException("Err");
        }
    }
}
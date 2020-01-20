package courses.practice.task00project.repository.impl;

import courses.practice.task00project.domain.Account;
import courses.practice.task00project.repository.AccountRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {private final Map<Integer, Account> accountIdToAccount = new HashMap<>();

    @Override
    public void save(Account entity) {
        if (entity != null) {
            if (!accountIdToAccount.containsKey(entity.getId())) {
                accountIdToAccount.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("There is no user with the same id");
            }
        } else {
            throw new IllegalArgumentException("User is null");
        }
    }

    @Override
    public Account findById(Integer id) {
        if (id != null) {
            return accountIdToAccount.get(id);
        } else {
            throw new IllegalArgumentException("Id is null");
        }
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountIdToAccount.values());
    }

    @Override
    public void update(Account entity) {
        if (entity != null) {
            if (accountIdToAccount.containsKey(entity.getId())) {
                accountIdToAccount.put(entity.getId(), entity);
            } else {
                throw new IllegalArgumentException("There is no user with the same id");
            }
        } else {
            throw new IllegalArgumentException("User is null");
        }
    }

    @Override
    public void deleteById(Integer id) {
        if (id != null) {
            accountIdToAccount.remove(id);
        } else {
            throw new IllegalArgumentException("Id null");
        }
    }
}
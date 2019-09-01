package com.rgy.atm.repository;

import com.rgy.atm.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {
}

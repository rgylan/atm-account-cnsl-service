package com.rgy.atm.service;

import com.rgy.atm.dto.AccountDTO;
import com.rgy.atm.entity.AccountEntity;
import com.rgy.atm.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDTO findAccount(Long id) {
        AccountDTO accountDTO = new AccountDTO();
        accountRepository.findById(id).ifPresent(accountEntity -> {
            BeanUtils.copyProperties(accountEntity, accountDTO);
            LOGGER.info("Balance: {}", accountEntity.getBalance());
        });
        LOGGER.info("Account found: {}", accountDTO);

        return accountDTO;
    }

    @Override
    public void save(AccountDTO accountDTO) {
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(accountDTO, accountEntity);

        accountRepository.save(accountEntity);
    }
}

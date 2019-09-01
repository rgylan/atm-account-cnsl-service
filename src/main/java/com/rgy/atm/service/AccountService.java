package com.rgy.atm.service;

import com.rgy.atm.dto.AccountDTO;

public interface AccountService {

    /**
     *
     * @param id
     * @return
     */
    AccountDTO findAccount(Long id);

    /**
     *
     * @param accountDTO
     */
    void save(AccountDTO accountDTO);
}

package com.rgy.atm.controller;

import com.rgy.atm.dto.AccountDTO;
import com.rgy.atm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountDTO> findAccount(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.findAccount(id), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveAccount(@RequestBody AccountDTO accountDTO) {
        accountService.save(accountDTO);
    }
}

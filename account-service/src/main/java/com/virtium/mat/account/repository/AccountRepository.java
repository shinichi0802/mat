package com.virtium.mat.account.repository;

import com.virtium.mat.account.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {

    Account findByName(String name);
}

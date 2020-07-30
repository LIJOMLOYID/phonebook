package com.thinkpalm.phonebook.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thinkpalm.phonebook.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

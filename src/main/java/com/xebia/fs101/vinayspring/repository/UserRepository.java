package com.xebia.fs101.vinayspring.repository;

import com.xebia.fs101.vinayspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}

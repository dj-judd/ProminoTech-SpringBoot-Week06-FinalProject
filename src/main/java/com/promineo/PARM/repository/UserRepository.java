package com.promineo.PARM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.PARM.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

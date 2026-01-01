package com.educandoweb.projetosb.respositories;

import com.educandoweb.projetosb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

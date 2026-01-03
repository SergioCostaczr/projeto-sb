package com.educandoweb.projetosb.respositories;

import com.educandoweb.projetosb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}

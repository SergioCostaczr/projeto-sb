package com.educandoweb.projetosb.respositories;

import com.educandoweb.projetosb.entities.OrderItem;
import com.educandoweb.projetosb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}

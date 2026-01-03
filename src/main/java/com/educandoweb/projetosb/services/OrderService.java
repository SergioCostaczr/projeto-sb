package com.educandoweb.projetosb.services;

import com.educandoweb.projetosb.entities.Order;
import com.educandoweb.projetosb.respositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findALl(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj =  repository.findById(id);
        return obj.get();
    }

}

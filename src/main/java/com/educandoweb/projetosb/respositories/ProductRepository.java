package com.educandoweb.projetosb.respositories;

import com.educandoweb.projetosb.entities.Category;
import com.educandoweb.projetosb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

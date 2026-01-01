package com.educandoweb.projetosb.respositories;

import com.educandoweb.projetosb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}

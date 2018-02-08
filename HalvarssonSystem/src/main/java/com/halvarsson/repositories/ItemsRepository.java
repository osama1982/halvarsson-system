package com.halvarsson.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halvarsson.models.Items;

@Repository
@Transactional
public interface ItemsRepository extends CrudRepository<Items, Integer> {
	
public List<Items> findAll();
	
	public Items findById(Integer id);
	
}

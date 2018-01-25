package com.halvarsson.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.halvarsson.models.Items;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Integer> {
	
	public List<Items> findAll();
	
	public Items findById(Integer id);
	

}

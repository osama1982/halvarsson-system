package com.halvarsson.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halvarsson.models.Categories;

@Repository
@Transactional
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}

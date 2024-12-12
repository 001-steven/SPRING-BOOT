package com.domain.models.repost;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entity.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {
       
}

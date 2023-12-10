package com.priyansh.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.priyansh.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
        
}

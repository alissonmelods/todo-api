package io.github.alissonmelods.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alissonmelods.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}

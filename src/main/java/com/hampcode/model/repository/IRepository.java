package com.hampcode.model.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> {

	Long insert(T entity) throws Exception;
	Long update(T entity) throws Exception;
	List<T> findAll() throws Exception;
	Optional<T> findById(T entity) throws Exception; //evita el null pointer exception
}

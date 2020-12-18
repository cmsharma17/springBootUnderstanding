package com.cms.app.repository;

import com.cms.app.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {
}

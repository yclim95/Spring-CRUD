package com.store;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.store.entity.Store;

public interface StoreRepository extends CrudRepository<Store,Long>{
	@Query(value = "SELECT c FROM Store c WHERE c.name LIKE '%' || :keyword || '%'"

	+ " OR c.email LIKE '%' || :keyword || '%'"
	+ " OR c.address LIKE '%' || :keyword || '%'")
	public List<Store> search(@Param("keyword") String keyword);
}

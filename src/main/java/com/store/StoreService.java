package com.store;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Store;

@Service
@Transactional
public class StoreService {
	@Autowired StoreRepository repo;
	public void save(Store store) {
		repo.save(store);
	}
	public List<Store> listAll() {
		return (List<Store>) repo.findAll();
	}
	public Store get(Long id) {
		return repo.findById(id).get();
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	public List<Store> search(String keyword) {
		return repo.search(keyword);
	}
}


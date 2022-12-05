package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

	@Autowired
	private PlacementRepository repo;
	
public List<Placement> showAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public Placement get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(Placement placement) {
		 repo.save(placement);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}
	
}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.StoreDetailRepo;

import com.example.demo.repo.*;
import com.example.demo.entity.*;
import com.example.demo.entity.Error;
import com.example.demo.entity.*;
@Service
public class StoreDetailService {
	@Autowired
	StoreDetailRepo Repository;

	public Result saveStore(StoreDetail storeDetail) {
		Repository.save(storeDetail);
		return new Result(200, Error.SAVED);
	}
	
	public Optional<StoreDetail> getProduct(String PINCODE) {
		return Repository.findById(PINCODE);
	}

//	public List<Store> getAll(String pinCode) {
//		return repo.findByPinCode(pinCode);
//	}

}

package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import common.beans.Store;
import com.example.demo.entity.*;

//@Repository
//public interface StoreDetailRepo extends MongoRepository<Store, String> {
	//@Query("{'addressLine1':{'pinCode':?0}}")
	//List<Store> findByPinCode(String pinCode);
//}

@Repository
public interface StoreDetailRepo extends MongoRepository<StoreDetail, String> {
	
	
	
}
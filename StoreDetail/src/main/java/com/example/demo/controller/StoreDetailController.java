package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.StoreDetailService;


import org.springframework.http.ResponseEntity;
import common.beans.Store;
import common.errormessages.ErrorMessages;

import common.result.StoreCollectionsResult;
import com.example.demo.service.*;
import com.example.demo.entity.*;
@RestController
@RequestMapping("/store")
public class StoreDetailController {

	@Autowired
	StoreDetailService storeDetailService;
	RestTemplate restTemplate;

	@PostMapping
	public Result createStore(@RequestBody StoreDetail storeDetail) {
		return storeDetailService.saveStore(storeDetail);
	}
	
	@GetMapping("/{PINCODE}")
	ResponseEntity<StoreDetail> getProductById(@PathVariable String PINCODE) {
		Optional<StoreDetail> storeDetail = storeDetailService.getProduct(PINCODE);
		
		return generateResponse(storeDetail);
	}

	private ResponseEntity<StoreDetail> generateResponse(Optional<StoreDetail> storeDetail) {
		return storeDetail.isPresent() ? new ResponseEntity(storeDetail, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}

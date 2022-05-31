package com.example.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import common.beans.Store;
import com.example.demo.entity.*;
@Document(collection = "storeCollection")
public class StoreDTO extends StoreDetail {
	@Id
	private String storeId;
}

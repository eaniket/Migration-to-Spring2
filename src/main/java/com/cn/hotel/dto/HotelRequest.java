package com.cn.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class HotelRequest {
//
//	private String name;
//	private Long rating;
//	private String city;
//	
//}

public record HotelRequest(String name, Long rating, String city) {}

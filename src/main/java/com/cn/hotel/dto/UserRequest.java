package com.cn.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class UserRequest {
//
//	private String username;
//	private String password;
//
//}

public record UserRequest(String username, String password) {}
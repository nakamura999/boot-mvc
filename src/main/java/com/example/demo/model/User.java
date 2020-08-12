package com.example.demo.model;

import lombok.Data;

@Data
public class User {
	private String name;
	private String email;
	private Integer age;
	private String address;
}
//Lombokの@Dataアノテーション。GetterやSetterなどの定型コードを自動生成

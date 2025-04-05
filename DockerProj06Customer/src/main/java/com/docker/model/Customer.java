package com.docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {

	private Integer cid;
	private String name;
	private String address;
	private Long contact;
}

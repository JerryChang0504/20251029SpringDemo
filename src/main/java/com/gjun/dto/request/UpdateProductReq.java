package com.gjun.dto.request;

import lombok.Data;

@Data
public class UpdateProductReq {
	private Long id;
	private String name;
	private String description;
	private Integer price;
	private String image;
}

package com.gjun.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product extends BaseEntity{

	  @Column(name = "product_id")
	  private Integer id;
	  @Column(name = "product_name")
	  private String name;
	  @Column(name = "product_description")
	  private String description;
	  @Column(name = "product_price")
	  private Integer price;
	  @Column(name = "product_image")
	  private String image;
}

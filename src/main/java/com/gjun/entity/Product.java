package com.gjun.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Product extends BaseEntity{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
	  @Column(name = "product_id")
	  private Long id;
	  @Column(name = "product_name")
	  private String name;
	  @Column(name = "product_description")
	  private String description;
	  @Column(name = "product_price")
	  private Integer price;
	  @Column(name = "product_image")
	  private String image;
}

package om.gjun.jds.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Data
@Builder
@Table(name = "product")
public class Product {

	// field
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	// cons
	public Product() {

	}

	public Product(Integer id, String name, String description, Integer price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
	}

}

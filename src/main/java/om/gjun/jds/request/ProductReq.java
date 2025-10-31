package om.gjun.jds.request;

import lombok.Data;

@Data
public class ProductReq {

	// field
	private String name;

	private String description;

	private Integer price;

	private String image;

}

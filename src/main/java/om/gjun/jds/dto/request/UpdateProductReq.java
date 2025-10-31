package om.gjun.jds.dto.request;

import lombok.Data;

@Data
public class UpdateProductReq {
	private Integer id;
	private String name;
	private String description;
	private Integer price;
	private String image;
}

package om.gjun.jds.request;

import lombok.Data;

@Data
public class UpdateReq {

	// field
	private Integer id;

	private String name;

	private String description;

	private Integer price;

	private String image;
}

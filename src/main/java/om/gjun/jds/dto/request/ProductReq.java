package om.gjun.jds.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "產品資料傳入值")
public class ProductReq {
  @Schema(description = "產品名稱", example = "Pro1")
  private String name;
  @Schema(description = "產品敘述", example = "description")
  private String description;
  @Schema(description = "產品價格", example = "100")
  private Integer price;
  @Schema(description = "產品圖片", example = "image")
  private String image;
}

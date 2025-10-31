package om.gjun.jds.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;

public class BaseEntity {

	@CreatedDate // 當 Entity 第一次儲存時自動填入時間
	@Column(updatable = false) // 此欄位建立後不可被更新
	protected LocalDateTime createdAt;

	@LastModifiedDate // 每次更新時會自動填入目前時間
	protected LocalDateTime updatedAt;
}

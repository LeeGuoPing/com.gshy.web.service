package com.gshy.web.service.entity;

import com.darengong.tools.dao.annotation.Column;
import com.darengong.tools.dao.annotation.Id;
import com.darengong.tools.dao.annotation.Table;

/**
 * 
 * @author liguoping
 *
 * 2018年5月5日-下午9:16:27
 *
 * @function 抵押图片
 */
@Table(name="tbl_image")
public class Image {
	
	@Id
	private long id;
	
	@Column(name="type")
	private int type;
	
	@Column(name="url")
	private String url;
	
	@Column(name="source_id")
	private long sourceId;
	
	@Column(name="valid")
	private int valid;
	
	@Column(name="remark")
	private String remark;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}
	
	
	
	
}

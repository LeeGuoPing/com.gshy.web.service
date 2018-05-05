package com.gshy.web.service.dao;

import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.Image;

public class ImageDAO extends BaseDAO<Image>{
	private static final ImageDAO imageDAO = new ImageDAO();
	
	
	public static ImageDAO getInstance(){
		return imageDAO;
	}
	
	private ImageDAO() {
		super(Image.class);
	}
}

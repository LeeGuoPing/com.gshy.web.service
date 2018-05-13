package com.gshy.web.service.bll;

import java.util.ArrayList;
import java.util.List;

import com.darengong.tools.dao.v2.DBQuery;
import com.gshy.web.service.entity.Image;

public class ImageBLL extends BaseBLL{

	public void batchInsert(String[] urls, long id,int imageType) throws Exception {
		if(urls==null || urls.length<1){
			return;
		}
		List<Image> images =  new ArrayList<Image>();
		for (String url : urls) {
			Image image = new Image();
			image.setType(imageType);
			image.setUrl(url);
			images.add(image);
		}
		imageDAO.add(images);
		
		
	}
	
	public long insert(Image image) throws Exception{
		return imageDAO.add(image);
	}
	
	public List<Image> getByType(int type,long id) throws Exception{
		DBQuery dbQuery = new DBQuery();
		dbQuery.select().from("tbl_image")
		.where().column("type").equal(type)
		.and().column("src_id").equal(id);
		return imageDAO.getList(dbQuery, 1, 100, "id desc");
	}

}

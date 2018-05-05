package com.gshy.web.service.dao.base;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.darengong.tools.dao.v2.DAOHelperV2;
import com.gshy.web.service.utils.PathUtil;



/**
 * 功能：创建DAOHelperV2
 * 作者：王鑫
 * 日期：2017年9月1日
 */
public abstract class DAOHelper {

	private static Logger log = LoggerFactory.getLogger(DAOHelper.class);
	
	public static DAOHelperV2 daoHelper = null;

	static {
		initDAOHelper(PathUtil.getAbsoluteConfigPath() + File.separatorChar + "car.properties");
	}

	private static void initDAOHelper(String carPath) {
		System.out.println("PATH:"+carPath);
		try {
			File carDB = new File(carPath);
			System.out.println(carDB.exists());
			if (carDB.exists()) {
				log.info("3config path:" + carPath);
				daoHelper = DAOHelperV2.createIntrance(carPath);
				System.out.println("daoHelper: "+daoHelper);
			}
			log.info("2config path:" + daoHelper);
		} catch (Exception e) {
			log.error("create auctionDao error(" + carPath, e);
		}
	}
}

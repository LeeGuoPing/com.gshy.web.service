
package com.gshy.web.service.utils;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bj58.wf.core.WF;

public class PathUtil {
	public static final String relativeConfigPath = "opt/wf";
	private static Logger logger = LoggerFactory.getLogger(PathUtil.class);
	private static String absoluteConfigPath = null;
	static {
		String nameSpace = WF.getNamespace();
		absoluteConfigPath = getAvailablePath(relativeConfigPath + File.separatorChar + nameSpace);
		logger.info("AbsoluteConfigPath:" + absoluteConfigPath);
	}

	public static String getAbsoluteConfigPath() {
		return absoluteConfigPath;
	}

	private static String getAvailablePath(String relativePath) {
		File configFileDir = null;
		for (File root : File.listRoots()) {
			configFileDir = new File(root, relativePath);
			if (configFileDir.exists()) {
				return configFileDir.getAbsolutePath();
			}
		}
		return null;
	}

}

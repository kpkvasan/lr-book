package com.inikah.util;

import java.util.HashMap;
import java.util.Map;

import com.cloudinary.Cloudinary;
import com.inikah.slayer.service.ConfigServiceUtil;

public class CloudinaryUtil {

	static Cloudinary cloudinary;
	
	static {
		String cloudName = ConfigServiceUtil.get(ConfigConstants.CLDY_CLOUD_NAME);
		Map<String, String> config = new HashMap<String, String>();
		config.put("cloud_name", cloudName);
		config.put("api_key", ConfigServiceUtil.get(ConfigConstants.CLDY_API_KEY));
		config.put("api_secret", ConfigServiceUtil.get(ConfigConstants.CLDY_API_SECRET));
		cloudinary = new Cloudinary(config);		
	}
	
	public static Cloudinary getService() {
		return cloudinary;
	}
}
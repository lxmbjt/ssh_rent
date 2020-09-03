package com.ssh.dao;

import java.util.List;

public interface PicDAO {
	public String getPicByHouse_id(int house_id) throws Exception;

	public String getAllPics();

	public List<String> getPic();

	public String getSixPic();
	public int getPicNum();
	public String getRemainPic();
}

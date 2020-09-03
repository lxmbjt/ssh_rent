package com.ssh.dao;

import com.ssh.dto.House;

public interface HouseInfoDAO {
	public House queryByHousetitle(String housetitle);
	public String recommendHouse(String city);
	public House  queryByHouseid(int house_id);
//	public String gethousePic(String house_id) throws Exception;
}

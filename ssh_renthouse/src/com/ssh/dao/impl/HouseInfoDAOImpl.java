package com.ssh.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ssh.dao.BaseDAO;
import com.ssh.dao.HouseInfoDAO;
import com.ssh.dto.House;

public class HouseInfoDAOImpl extends BaseDAO implements HouseInfoDAO {
House house;
	@Override
	public House queryByHousetitle(String housetitle){
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from house where housetitle=?";
		Query query  = session.createQuery(hql);
		query.setString(0, housetitle);
//		for(int i=0;i<query.list().size();i++){
//			House
//		}
		if(query.list().size()==1){
			house=(House)query.list().get(0);
		}

		session.close();	
		return house;
	}

	@Override
	public String recommendHouse(String city){
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from house where city=?";
		String houseItem_detail="";
		Query query  = session.createQuery(hql);
		for(int i=0;i<query.list().size();i++){
			House house=(House)query.list().get(i);
			String rent_type="";
			String decoration="";
			switch(house.getRentType()){
			case 1:rent_type="整租";break;
			case 2:rent_type="合租";break;
			default:rent_type="无限制";break;
			}
			switch(house.getDecoration()){
			case 1:decoration="/精装修";break;
			case 2:decoration="/简装修";break;			
			default:decoration="/未装修";break;
			
			}
			String pic="<div class=houseItem><div class=pic><img src=\""+"./image/2.jpg"+"\"/></div>";
			String housetitle="<div class=houseItem-detail><a class=houseItemtitle id=\""+house.getHousetitle()+"\" onclick=\"state(this.id)\">"+house.getHousetitle()+"</a>";
			String HouseItem_specific_info="<div class=HouseItem-specific-info><span class=HouseItem-specific-info-font>"+rent_type+decoration+"</span><br>"+"<span class=HouseItem-specific-info-font>"+house.getArea()+"平</span><br></div>";
			String charge="<div class=HouseItemcharge><p class=HouseItemcharge-font>"+house.getCharge()+"元/月</p></div></div></div>";
			houseItem_detail+=pic+housetitle+HouseItem_specific_info+charge;
			if(i==7)break;
		}
		return houseItem_detail;
	}

	@Override
	public House queryByHouseid(int house_id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from house where houseId=?";
		Query query  = session.createQuery(hql);
		query.setInteger(0, house_id);
		if(query.list().size()==1){
			house=(House)query.list().get(0);
		}

		session.close();	
		return house;
	}

	

}

package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ssh.dao.BaseDAO;
import com.ssh.dao.PicDAO;

public class PicDAOImpl extends BaseDAO implements PicDAO {
	String pics="";
	List<String> pic;
	@Override
	public String getPicByHouse_id(int house_id) throws Exception {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="select pic from pics where house.houseId=?";
		Query query  = session.createQuery(hql);
		query.setInteger(0, house_id);
		pics="";
		pic=query.list();
		for(int i=0;i<query.list().size();i++){
			pics+=query.list().get(i)+" ";
		}
		
		session.close();
		return pics;
	}

	public List<String> getPic(){
		return pic;
	}
	public int getPicNum(){
		return pic.size();
	}
	public String getSixPic(){

		String str="";
		for(int i=0;i<6;i++){		
			str+="<li class=house-pic-list-item><img data-action=\"zoom\" class=house_img src=\""+pic.get(i)+"\"/></a></li>";
		}
		return str;
	}
	public String getRemainPic(){
		
		String str="";
		for(int i=6;i<pic.size();i++){		
			str+="<li class=house-pic-list-item><img data-action=\"zoom\" class=house_img src=\""+pic.get(i)+"\"/></li>";
		}
		return str;
	}
}

package com.ssh.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ssh.dao.BaseDAO;
import com.ssh.dao.OwnerDAO;
import com.ssh.dto.House;
import com.ssh.dto.User;

public class OwnerDAOImpl extends BaseDAO implements OwnerDAO {

	// 根据用户ID查询用户_黎小曼，
	// 根据房主id查找房主信息显示在房源详细信息页。
	@Override
	public User queryById(int userId) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql = "from user where userId=?";
		Query query  = session.createQuery(hql);
		query.setInteger(0, userId);
		User u = new User();
		if(query.list().size()==1){
			u=(User)query.list().get(0);
		}
		
		session.close();	
		return u;
	}

}

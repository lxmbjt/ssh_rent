package com.ssh.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssh.dao.BaseDAO;
import com.ssh.dao.FavoriteDAO;
import com.ssh.dao.HouseInfoDAO;
import com.ssh.dao.OwnerDAO;
import com.ssh.dto.Favorite;
import com.ssh.dto.House;
import com.ssh.dto.User;

public class FavoriteDAOImpl extends BaseDAO implements FavoriteDAO {

	private HouseInfoDAO housedao;
	private OwnerDAO ownerdao;
	@Override
	public int addFavorite(int house_id, int user_id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		int result=ifInFavorite(house_id,user_id);
		House house=housedao.queryByHouseid(house_id);
		User user=ownerdao.queryById(user_id);
		Favorite f=new Favorite(house,user);
		if(result==0){
			//数据库中无该项纪录，加入该记录
//			String hql1 = "insert into favorite (f_user_id,f_house_id) VALUES (?,?);";
//			Query query  = session.createQuery(hql1);
//			query.setInteger(0, user_id);
//			query.setInteger(1, house_id);
			
			Transaction tran=session.beginTransaction();
			session.save(f);              
			tran.commit(); 
			session.close();
			return 1;
			
		}
		else{
			//数据库中有该项纪录，删除该记录
			Transaction tran = session.beginTransaction();
			session.delete(f);  
			tran.commit();
			session.close();
			return 0;
			
		}
		
	
	}

	@Override
	public int ifInFavorite(int house_id, int user_id) {
		// TODO Auto-generated method stub
		Session session=getSession();
//		House house=housedao.queryByHouseid(house_id);
//		User user=ownerdao.queryById(user_id);
//		Favorite f=new Favorite(house,user);
		String hql = "from favorite f where f.house.houseId=? and f.user.userId=?;";
		Query query  = session.createQuery(hql);
		query.setInteger(0, house_id);
		query.setInteger(1, user_id);
		if(query.list().size()==1)return 1;
		else return 0;
	}

	public HouseInfoDAO getHousedao() {
		return housedao;
	}

	public void setHousedao(HouseInfoDAO housedao) {
		this.housedao = housedao;
	}

	public OwnerDAO getOwnerdao() {
		return ownerdao;
	}

	public void setOwnerdao(OwnerDAO ownerdao) {
		this.ownerdao = ownerdao;
	}
	

}

package com.ssh.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ssh.dao.BaseDAO;
import com.ssh.dao.OwnerDAO;
import com.ssh.dto.House;
import com.ssh.dto.User;

public class OwnerDAOImpl extends BaseDAO implements OwnerDAO {

	// �����û�ID��ѯ�û�_��С����
	// ���ݷ���id���ҷ�����Ϣ��ʾ�ڷ�Դ��ϸ��Ϣҳ��
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

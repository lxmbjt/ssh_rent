package com.ssh.dao;

public interface FavoriteDAO {
	public int addFavorite(int house_id,int user_id);
	public int ifInFavorite(int house_id,int user_id);
}

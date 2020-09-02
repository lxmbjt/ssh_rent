package com.ssh.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.dao.HouseInfoDAO;
import com.ssh.dto.House;
import com.ssh.dto.User;





public class HouseAction extends ActionSupport {
	private String housetitle;
	private int user_id;
    private static String recommendHouses;
    private String pics_all;
    private String pics_six;
    private String pics_remain;
    private String[] pic;
    private House house;
    private User owner;
    private User user;
    private HouseInfoDAO dao;
    
    ActionContext actionContext = ActionContext.getContext(); 
    Map<String, Object> session = actionContext.getSession(); 
    public String execute() throws Exception {   
    	HttpServletRequest request = ServletActionContext.getRequest();
        housetitle = request.getParameter("housetitle");
        String re = housetitle;
        house=dao.queryByHousetitle(re);
        user_id=Integer.parseInt(session.get("user_id").toString());
        System.out.println("当前登录用户："+user_id);
        if (re !=""){  
        	 session.put("house",house);
        }else{
        	session.put("houseresult", "<div>搜索结果为空</div>");   
        }
        
        
        return "success";
    }
	public String getHousetitle() {
		return housetitle;
	}
	public void setHousetitle(String housetitle) {
		this.housetitle = housetitle;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public static String getRecommendHouses() {
		return recommendHouses;
	}
	public static void setRecommendHouses(String recommendHouses) {
		HouseAction.recommendHouses = recommendHouses;
	}
	public String getPics_all() {
		return pics_all;
	}
	public void setPics_all(String pics_all) {
		this.pics_all = pics_all;
	}
	public String getPics_six() {
		return pics_six;
	}
	public void setPics_six(String pics_six) {
		this.pics_six = pics_six;
	}
	public String getPics_remain() {
		return pics_remain;
	}
	public void setPics_remain(String pics_remain) {
		this.pics_remain = pics_remain;
	}
	public String[] getPic() {
		return pic;
	}
	public void setPic(String[] pic) {
		this.pic = pic;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 
	public HouseInfoDAO getDao(){
		return dao;
	}
	public void setDao(HouseInfoDAO dao){
		this.dao=dao;
	}
}

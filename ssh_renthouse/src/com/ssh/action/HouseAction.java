package com.ssh.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.dao.FavoriteDAO;
import com.ssh.dao.HouseInfoDAO;
//import com.ssh.dao.OwnerDAO;
import com.ssh.dao.PicDAO;
import com.ssh.dto.House;
import com.ssh.dto.User;







public class HouseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String housetitle;
	private int user_id;
    private static String recommendHouses;
    private String pics_all;
    private String pics_six;
    private String pics_remain;
    private List<String> pic;
    private House house;
    private User owner;
    private User user;

    private HouseInfoDAO dao;
    private PicDAO picdao;
    //private OwnerDAO ownerdao;
    private FavoriteDAO fdao;
  
    
    
    ActionContext actionContext = ActionContext.getContext(); 
    Map<String, Object> session = actionContext.getSession(); 
    public String execute() throws Exception {   
    	HttpServletRequest request = ServletActionContext.getRequest();
        housetitle = request.getParameter("housetitle");
        
        house=dao.queryByHousetitle(housetitle);
        user_id=Integer.parseInt(session.get("user_id").toString());
        
        System.out.println("当前登录用户："+user_id);
        int result=0;
        owner=house.getUser();
		session.put("ownerid", owner.getUserId()+"");
		
		/*取图片*/
		String str=picdao.getPicByHouse_id(house.getHouseId());
		pics_all=picdao.getAllPics();
		System.out.println(pics_all);
		pic=picdao.getPic();
		if(pic.size()>6){
			pics_six=picdao.getSixPic();
			pics_remain=picdao.getRemainPic();
			
		}
		/*收藏结果*/
		result=fdao.ifInFavorite(house.getHouseId(), user_id);
		System.out.println("收藏结果"+result);
        
        if (housetitle !=""){  
    		session.put("recommendHouses",recommendHouses);           
            session.put("pics_all", pics_all);
            session.put("pics_num",pic.size());
            session.put("pics_six", pics_six);
            session.put("pics_remain", pics_remain);
            session.put("house",house);
            session.put("firstpic",pic.get(0));
            session.put("slider_pic",pic);
            session.put("owner",owner);
            session.put("star_result",result);
        	 
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
	public List<String> getPic() {
		return pic;
	}
	public void setPic(List<String> pic) {
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

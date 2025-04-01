package com.entity.model;

import com.entity.JingqujingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 景区景点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public class JingqujingdianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 别名
	 */
	
	private String bieming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 占地面积
	 */
	
	private Integer zhandimianji;
		
	/**
	 * 著名景点
	 */
	
	private String zhumingjingdian;
		
	/**
	 * 地理环境
	 */
	
	private String dilihuanjing;
		
	/**
	 * 历史沿岸
	 */
	
	private String lishiyanan;
		
	/**
	 * 景观特色
	 */
	
	private String jingguantese;
		
	/**
	 * 景点详情
	 */
	
	private String jingdianxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：别名
	 */
	 
	public void setBieming(String bieming) {
		this.bieming = bieming;
	}
	
	/**
	 * 获取：别名
	 */
	public String getBieming() {
		return bieming;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：占地面积
	 */
	 
	public void setZhandimianji(Integer zhandimianji) {
		this.zhandimianji = zhandimianji;
	}
	
	/**
	 * 获取：占地面积
	 */
	public Integer getZhandimianji() {
		return zhandimianji;
	}
				
	
	/**
	 * 设置：著名景点
	 */
	 
	public void setZhumingjingdian(String zhumingjingdian) {
		this.zhumingjingdian = zhumingjingdian;
	}
	
	/**
	 * 获取：著名景点
	 */
	public String getZhumingjingdian() {
		return zhumingjingdian;
	}
				
	
	/**
	 * 设置：地理环境
	 */
	 
	public void setDilihuanjing(String dilihuanjing) {
		this.dilihuanjing = dilihuanjing;
	}
	
	/**
	 * 获取：地理环境
	 */
	public String getDilihuanjing() {
		return dilihuanjing;
	}
				
	
	/**
	 * 设置：历史沿岸
	 */
	 
	public void setLishiyanan(String lishiyanan) {
		this.lishiyanan = lishiyanan;
	}
	
	/**
	 * 获取：历史沿岸
	 */
	public String getLishiyanan() {
		return lishiyanan;
	}
				
	
	/**
	 * 设置：景观特色
	 */
	 
	public void setJingguantese(String jingguantese) {
		this.jingguantese = jingguantese;
	}
	
	/**
	 * 获取：景观特色
	 */
	public String getJingguantese() {
		return jingguantese;
	}
				
	
	/**
	 * 设置：景点详情
	 */
	 
	public void setJingdianxiangqing(String jingdianxiangqing) {
		this.jingdianxiangqing = jingdianxiangqing;
	}
	
	/**
	 * 获取：景点详情
	 */
	public String getJingdianxiangqing() {
		return jingdianxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}

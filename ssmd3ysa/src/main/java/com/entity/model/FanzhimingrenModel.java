package com.entity.model;

import com.entity.FanzhimingrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 繁峙名人
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public class FanzhimingrenModel  implements Serializable {
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
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 名族
	 */
	
	private String mingzu;
		
	/**
	 * 籍贯
	 */
	
	private String jiguan;
		
	/**
	 * 主要成就
	 */
	
	private String zhuyaochengjiu;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 编辑日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bianjiriqi;
		
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
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：名族
	 */
	 
	public void setMingzu(String mingzu) {
		this.mingzu = mingzu;
	}
	
	/**
	 * 获取：名族
	 */
	public String getMingzu() {
		return mingzu;
	}
				
	
	/**
	 * 设置：籍贯
	 */
	 
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
	}
				
	
	/**
	 * 设置：主要成就
	 */
	 
	public void setZhuyaochengjiu(String zhuyaochengjiu) {
		this.zhuyaochengjiu = zhuyaochengjiu;
	}
	
	/**
	 * 获取：主要成就
	 */
	public String getZhuyaochengjiu() {
		return zhuyaochengjiu;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：编辑日期
	 */
	 
	public void setBianjiriqi(Date bianjiriqi) {
		this.bianjiriqi = bianjiriqi;
	}
	
	/**
	 * 获取：编辑日期
	 */
	public Date getBianjiriqi() {
		return bianjiriqi;
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

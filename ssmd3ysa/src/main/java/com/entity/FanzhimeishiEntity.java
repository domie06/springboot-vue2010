package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 繁峙美食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@TableName("fanzhimeishi")
public class FanzhimeishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FanzhimeishiEntity() {
		
	}
	
	public FanzhimeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 别名
	 */
					
	private String bieming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 特征
	 */
					
	private String tezheng;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	/**
	 * 主要原料
	 */
					
	private String zhuyaoyuanliao;
	
	/**
	 * 由来
	 */
					
	private String youlai;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 编辑日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
	 * 设置：特征
	 */
	public void setTezheng(String tezheng) {
		this.tezheng = tezheng;
	}
	/**
	 * 获取：特征
	 */
	public String getTezheng() {
		return tezheng;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：主要原料
	 */
	public void setZhuyaoyuanliao(String zhuyaoyuanliao) {
		this.zhuyaoyuanliao = zhuyaoyuanliao;
	}
	/**
	 * 获取：主要原料
	 */
	public String getZhuyaoyuanliao() {
		return zhuyaoyuanliao;
	}
	/**
	 * 设置：由来
	 */
	public void setYoulai(String youlai) {
		this.youlai = youlai;
	}
	/**
	 * 获取：由来
	 */
	public String getYoulai() {
		return youlai;
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

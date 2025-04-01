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
 * 景区景点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@TableName("jingqujingdian")
public class JingqujingdianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingqujingdianEntity() {
		
	}
	
	public JingqujingdianEntity(T t) {
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

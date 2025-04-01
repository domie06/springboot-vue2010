package com.entity.view;

import com.entity.DiscussfanzhimeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 繁峙美食评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@TableName("discussfanzhimeishi")
public class DiscussfanzhimeishiView  extends DiscussfanzhimeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfanzhimeishiView(){
	}
 
 	public DiscussfanzhimeishiView(DiscussfanzhimeishiEntity discussfanzhimeishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfanzhimeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

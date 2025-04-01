package com.entity.view;

import com.entity.FanzhimingrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 繁峙名人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@TableName("fanzhimingren")
public class FanzhimingrenView  extends FanzhimingrenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanzhimingrenView(){
	}
 
 	public FanzhimingrenView(FanzhimingrenEntity fanzhimingrenEntity){
 	try {
			BeanUtils.copyProperties(this, fanzhimingrenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

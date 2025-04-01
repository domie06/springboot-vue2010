package com.entity.view;

import com.entity.DiscussfanzhizhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 繁峙周边评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@TableName("discussfanzhizhoubian")
public class DiscussfanzhizhoubianView  extends DiscussfanzhizhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfanzhizhoubianView(){
	}
 
 	public DiscussfanzhizhoubianView(DiscussfanzhizhoubianEntity discussfanzhizhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, discussfanzhizhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

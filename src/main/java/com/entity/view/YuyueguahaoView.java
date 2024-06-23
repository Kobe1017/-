package com.entity.view;

import com.entity.YuyueguahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 预约挂号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
@TableName("yuyueguahao")
public class YuyueguahaoView  extends YuyueguahaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueguahaoView(){
	}
 
 	public YuyueguahaoView(YuyueguahaoEntity yuyueguahaoEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueguahaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}

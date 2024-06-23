package com.entity.view;

import com.entity.HuanzhedanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 患者档案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
@TableName("huanzhedangan")
public class HuanzhedanganView  extends HuanzhedanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanzhedanganView(){
	}
 
 	public HuanzhedanganView(HuanzhedanganEntity huanzhedanganEntity){
 	try {
			BeanUtils.copyProperties(this, huanzhedanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}

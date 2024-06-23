package com.entity.vo;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
public class KeshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室分类
	 */
	
	private String keshifenlei;
		
	/**
	 * 科室封面
	 */
	
	private String keshifengmian;
		
	/**
	 * 科室位置
	 */
	
	private String keshiweizhi;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 挂号费
	 */
	
	private Double guahaofei;
		
	/**
	 * 配套设施
	 */
	
	private String peitaosheshi;
		
	/**
	 * 科室详情
	 */
	
	private String keshixiangqing;
				
	
	/**
	 * 设置：科室分类
	 */
	 
	public void setKeshifenlei(String keshifenlei) {
		this.keshifenlei = keshifenlei;
	}
	
	/**
	 * 获取：科室分类
	 */
	public String getKeshifenlei() {
		return keshifenlei;
	}
				
	
	/**
	 * 设置：科室封面
	 */
	 
	public void setKeshifengmian(String keshifengmian) {
		this.keshifengmian = keshifengmian;
	}
	
	/**
	 * 获取：科室封面
	 */
	public String getKeshifengmian() {
		return keshifengmian;
	}
				
	
	/**
	 * 设置：科室位置
	 */
	 
	public void setKeshiweizhi(String keshiweizhi) {
		this.keshiweizhi = keshiweizhi;
	}
	
	/**
	 * 获取：科室位置
	 */
	public String getKeshiweizhi() {
		return keshiweizhi;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(Double guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Double getGuahaofei() {
		return guahaofei;
	}
				
	
	/**
	 * 设置：配套设施
	 */
	 
	public void setPeitaosheshi(String peitaosheshi) {
		this.peitaosheshi = peitaosheshi;
	}
	
	/**
	 * 获取：配套设施
	 */
	public String getPeitaosheshi() {
		return peitaosheshi;
	}
				
	
	/**
	 * 设置：科室详情
	 */
	 
	public void setKeshixiangqing(String keshixiangqing) {
		this.keshixiangqing = keshixiangqing;
	}
	
	/**
	 * 获取：科室详情
	 */
	public String getKeshixiangqing() {
		return keshixiangqing;
	}
			
}

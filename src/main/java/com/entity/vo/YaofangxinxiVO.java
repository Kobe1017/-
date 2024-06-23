package com.entity.vo;

import com.entity.YaofangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药方信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
public class YaofangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 药物名称
	 */
	
	private String yaowumingcheng;
		
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 药物价格
	 */
	
	private Double yaowujiage;
		
	/**
	 * 药品数量
	 */
	
	private Integer yaopinshuliang;
		
	/**
	 * 总费用
	 */
	
	private Double zongfeiyong;
		
	/**
	 * 用法用量
	 */
	
	private String yongfayongliang;
		
	/**
	 * 药品剂量
	 */
	
	private String yaopinjiliang;
		
	/**
	 * 开方时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaifangshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：药物名称
	 */
	 
	public void setYaowumingcheng(String yaowumingcheng) {
		this.yaowumingcheng = yaowumingcheng;
	}
	
	/**
	 * 获取：药物名称
	 */
	public String getYaowumingcheng() {
		return yaowumingcheng;
	}
				
	
	/**
	 * 设置：药品图片
	 */
	 
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
				
	
	/**
	 * 设置：药物价格
	 */
	 
	public void setYaowujiage(Double yaowujiage) {
		this.yaowujiage = yaowujiage;
	}
	
	/**
	 * 获取：药物价格
	 */
	public Double getYaowujiage() {
		return yaowujiage;
	}
				
	
	/**
	 * 设置：药品数量
	 */
	 
	public void setYaopinshuliang(Integer yaopinshuliang) {
		this.yaopinshuliang = yaopinshuliang;
	}
	
	/**
	 * 获取：药品数量
	 */
	public Integer getYaopinshuliang() {
		return yaopinshuliang;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(Double zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public Double getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：用法用量
	 */
	 
	public void setYongfayongliang(String yongfayongliang) {
		this.yongfayongliang = yongfayongliang;
	}
	
	/**
	 * 获取：用法用量
	 */
	public String getYongfayongliang() {
		return yongfayongliang;
	}
				
	
	/**
	 * 设置：药品剂量
	 */
	 
	public void setYaopinjiliang(String yaopinjiliang) {
		this.yaopinjiliang = yaopinjiliang;
	}
	
	/**
	 * 获取：药品剂量
	 */
	public String getYaopinjiliang() {
		return yaopinjiliang;
	}
				
	
	/**
	 * 设置：开方时间
	 */
	 
	public void setKaifangshijian(Date kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开方时间
	 */
	public Date getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}

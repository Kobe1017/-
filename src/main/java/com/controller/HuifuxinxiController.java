package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuifuxinxiEntity;
import com.entity.view.HuifuxinxiView;

import com.service.HuifuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 回复信息
 * 后端接口
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
@RestController
@RequestMapping("/huifuxinxi")
public class HuifuxinxiController {
    @Autowired
    private HuifuxinxiService huifuxinxiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuifuxinxiEntity huifuxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			huifuxinxi.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			huifuxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuifuxinxiEntity> ew = new EntityWrapper<HuifuxinxiEntity>();

		PageUtils page = huifuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huifuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuifuxinxiEntity huifuxinxi, 
		HttpServletRequest request){
        EntityWrapper<HuifuxinxiEntity> ew = new EntityWrapper<HuifuxinxiEntity>();

		PageUtils page = huifuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huifuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuifuxinxiEntity huifuxinxi){
       	EntityWrapper<HuifuxinxiEntity> ew = new EntityWrapper<HuifuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huifuxinxi, "huifuxinxi")); 
        return R.ok().put("data", huifuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuifuxinxiEntity huifuxinxi){
        EntityWrapper< HuifuxinxiEntity> ew = new EntityWrapper< HuifuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huifuxinxi, "huifuxinxi")); 
		HuifuxinxiView huifuxinxiView =  huifuxinxiService.selectView(ew);
		return R.ok("查询回复信息成功").put("data", huifuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuifuxinxiEntity huifuxinxi = huifuxinxiService.selectById(id);
        return R.ok().put("data", huifuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuifuxinxiEntity huifuxinxi = huifuxinxiService.selectById(id);
        return R.ok().put("data", huifuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuifuxinxiEntity huifuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huifuxinxi);
        huifuxinxiService.insert(huifuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuifuxinxiEntity huifuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huifuxinxi);
        huifuxinxiService.insert(huifuxinxi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuifuxinxiEntity huifuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huifuxinxi);
        huifuxinxiService.updateById(huifuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huifuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

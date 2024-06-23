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

import com.entity.KeshifenleiEntity;
import com.entity.view.KeshifenleiView;

import com.service.KeshifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 科室分类
 * 后端接口
 * @author 
 * @email 
 * @date 2030-12-07 22:27:09
 */
@RestController
@RequestMapping("/keshifenlei")
public class KeshifenleiController {
    @Autowired
    private KeshifenleiService keshifenleiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KeshifenleiEntity keshifenlei,
		HttpServletRequest request){
        EntityWrapper<KeshifenleiEntity> ew = new EntityWrapper<KeshifenleiEntity>();

		PageUtils page = keshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, keshifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KeshifenleiEntity keshifenlei, 
		HttpServletRequest request){
        EntityWrapper<KeshifenleiEntity> ew = new EntityWrapper<KeshifenleiEntity>();

		PageUtils page = keshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, keshifenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KeshifenleiEntity keshifenlei){
       	EntityWrapper<KeshifenleiEntity> ew = new EntityWrapper<KeshifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( keshifenlei, "keshifenlei")); 
        return R.ok().put("data", keshifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KeshifenleiEntity keshifenlei){
        EntityWrapper< KeshifenleiEntity> ew = new EntityWrapper< KeshifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( keshifenlei, "keshifenlei")); 
		KeshifenleiView keshifenleiView =  keshifenleiService.selectView(ew);
		return R.ok("查询科室分类成功").put("data", keshifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KeshifenleiEntity keshifenlei = keshifenleiService.selectById(id);
        return R.ok().put("data", keshifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KeshifenleiEntity keshifenlei = keshifenleiService.selectById(id);
        return R.ok().put("data", keshifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KeshifenleiEntity keshifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(keshifenlei);
        keshifenleiService.insert(keshifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KeshifenleiEntity keshifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(keshifenlei);
        keshifenleiService.insert(keshifenlei);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KeshifenleiEntity keshifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(keshifenlei);
        keshifenleiService.updateById(keshifenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        keshifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

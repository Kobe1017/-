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

import com.entity.YaofangxinxiEntity;
import com.entity.view.YaofangxinxiView;

import com.service.YaofangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 药方信息
 * 后端接口
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
@RestController
@RequestMapping("/yaofangxinxi")
public class YaofangxinxiController {
    @Autowired
    private YaofangxinxiService yaofangxinxiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaofangxinxiEntity yaofangxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			yaofangxinxi.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yaofangxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YaofangxinxiEntity> ew = new EntityWrapper<YaofangxinxiEntity>();

		PageUtils page = yaofangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaofangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaofangxinxiEntity yaofangxinxi, 
		HttpServletRequest request){
        EntityWrapper<YaofangxinxiEntity> ew = new EntityWrapper<YaofangxinxiEntity>();

		PageUtils page = yaofangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaofangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaofangxinxiEntity yaofangxinxi){
       	EntityWrapper<YaofangxinxiEntity> ew = new EntityWrapper<YaofangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaofangxinxi, "yaofangxinxi")); 
        return R.ok().put("data", yaofangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaofangxinxiEntity yaofangxinxi){
        EntityWrapper< YaofangxinxiEntity> ew = new EntityWrapper< YaofangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaofangxinxi, "yaofangxinxi")); 
		YaofangxinxiView yaofangxinxiView =  yaofangxinxiService.selectView(ew);
		return R.ok("查询药方信息成功").put("data", yaofangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaofangxinxiEntity yaofangxinxi = yaofangxinxiService.selectById(id);
        return R.ok().put("data", yaofangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaofangxinxiEntity yaofangxinxi = yaofangxinxiService.selectById(id);
        return R.ok().put("data", yaofangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaofangxinxiEntity yaofangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yaofangxinxi);
        yaofangxinxiService.insert(yaofangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaofangxinxiEntity yaofangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yaofangxinxi);
        yaofangxinxiService.insert(yaofangxinxi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaofangxinxiEntity yaofangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaofangxinxi);
        yaofangxinxiService.updateById(yaofangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaofangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

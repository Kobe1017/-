package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanzhedanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanzhedanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanzhedanganView;


/**
 * 患者档案
 *
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
public interface HuanzhedanganService extends IService<HuanzhedanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanzhedanganVO> selectListVO(Wrapper<HuanzhedanganEntity> wrapper);
   	
   	HuanzhedanganVO selectVO(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
   	
   	List<HuanzhedanganView> selectListView(Wrapper<HuanzhedanganEntity> wrapper);
   	
   	HuanzhedanganView selectView(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanzhedanganEntity> wrapper);
   	

}


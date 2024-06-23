package com.dao;

import com.entity.HuanzhedanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanzhedanganVO;
import com.entity.view.HuanzhedanganView;


/**
 * 患者档案
 * 
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
public interface HuanzhedanganDao extends BaseMapper<HuanzhedanganEntity> {
	
	List<HuanzhedanganVO> selectListVO(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
	
	HuanzhedanganVO selectVO(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
	
	List<HuanzhedanganView> selectListView(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);

	List<HuanzhedanganView> selectListView(Pagination page,@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
	
	HuanzhedanganView selectView(@Param("ew") Wrapper<HuanzhedanganEntity> wrapper);
	

}

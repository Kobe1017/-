package com.dao;

import com.entity.YaofangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaofangxinxiVO;
import com.entity.view.YaofangxinxiView;


/**
 * 药方信息
 * 
 * @author 
 * @email 
 * @date 2030-12-07 22:27:10
 */
public interface YaofangxinxiDao extends BaseMapper<YaofangxinxiEntity> {
	
	List<YaofangxinxiVO> selectListVO(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
	
	YaofangxinxiVO selectVO(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
	
	List<YaofangxinxiView> selectListView(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);

	List<YaofangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
	
	YaofangxinxiView selectView(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
	

}

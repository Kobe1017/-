package com.dao;

import com.entity.KeshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshifenleiVO;
import com.entity.view.KeshifenleiView;


/**
 * 科室分类
 * 
 * @author 
 * @email 
 * @date 2030-12-07 22:27:09
 */
public interface KeshifenleiDao extends BaseMapper<KeshifenleiEntity> {
	
	List<KeshifenleiVO> selectListVO(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
	
	KeshifenleiVO selectVO(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
	
	List<KeshifenleiView> selectListView(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);

	List<KeshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
	
	KeshifenleiView selectView(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
	

}

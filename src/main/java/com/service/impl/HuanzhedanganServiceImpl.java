package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuanzhedanganDao;
import com.entity.HuanzhedanganEntity;
import com.service.HuanzhedanganService;
import com.entity.vo.HuanzhedanganVO;
import com.entity.view.HuanzhedanganView;

@Service("huanzhedanganService")
public class HuanzhedanganServiceImpl extends ServiceImpl<HuanzhedanganDao, HuanzhedanganEntity> implements HuanzhedanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanzhedanganEntity> page = this.selectPage(
                new Query<HuanzhedanganEntity>(params).getPage(),
                new EntityWrapper<HuanzhedanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanzhedanganEntity> wrapper) {
		  Page<HuanzhedanganView> page =new Query<HuanzhedanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanzhedanganVO> selectListVO(Wrapper<HuanzhedanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanzhedanganVO selectVO(Wrapper<HuanzhedanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanzhedanganView> selectListView(Wrapper<HuanzhedanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanzhedanganView selectView(Wrapper<HuanzhedanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

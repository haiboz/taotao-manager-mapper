package com.taotao.mapper;

import java.util.List;
import java.util.Map;

import com.taotao.common.LavaMapper;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.pojo.TbItemParamVo;

public interface TbItemParamMapperExt extends LavaMapper<TbItemParam, TbItemParamExample> {

	List<TbItemParamVo> queryPageList(Map<String,Object> map);
	
}

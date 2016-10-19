package com.taotao.mapper;

import java.util.List;
import java.util.Map;

import com.taotao.common.LavaMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;

public interface TbContentMapperExt extends LavaMapper<TbContent, TbContentExample> {
	public List<TbContent> getPageContentList(Map<String,Object> map);

	public int queryContentCount(Map<String, Object> map);
}

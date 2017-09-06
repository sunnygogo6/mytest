package cn.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.crm.mapper.BaseDictMapper;
import cn.itheima.crm.po.BaseDict;
import cn.itheima.crm.service.BaseDictService;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午5:21:52 
* @describe 
*/
@Service
public class BaseDictServiceImpl implements BaseDictService {
	// 注入数据字典mapper
	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> queryBaseDictByTypeCode(String typeCode) {
		// TODO Auto-generated method stub
		return baseDictMapper.queryBaseDictByTypeCode(typeCode);
	}

}

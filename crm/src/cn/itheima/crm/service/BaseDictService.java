package cn.itheima.crm.service;

import java.util.List;

import cn.itheima.crm.po.BaseDict;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午5:19:23 
* @describe 
*/
public interface BaseDictService {
	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}

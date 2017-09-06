package cn.itheima.crm.mapper;

import java.util.List;

import cn.itheima.crm.po.BaseDict;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午5:07:00 
* @describe 
*/
public interface BaseDictMapper {
	
	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}

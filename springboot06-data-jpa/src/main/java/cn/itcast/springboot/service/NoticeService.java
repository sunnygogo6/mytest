package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

/** 
* @author sunnygogo6 
* @date 2017年9月6日 下午2:07:03 
* @describe 
*/
public interface NoticeService {
	/** 查询所有的公告 */
	public List<Notice> findAll();
	
}

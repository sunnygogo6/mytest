package cn.itheima.crm.mapper;

import java.util.List;

import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午9:43:33 
* @describe 
*/
public interface CustomerMapper {
	// 综合查询客户列表  分页：作为当前页面的数据
	List<Customer> queryCustomerByCondition(QueryVo queryVo);
	
	// 综合统计客户记录 分页：作为查询的总记录数
	Integer countCustomerByCondition(QueryVo queryVo);
	
	// 根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	//  根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);
}

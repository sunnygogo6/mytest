package cn.itheima.crm.service;


import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.utils.Page;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午10:39:49 
* @describe 
*/
public interface CustomerService {
	
	// 分页查询客户信息
	Page<Customer> queryCustoerByCondition(QueryVo queryVo);
	
	// 根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	//  根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);
}

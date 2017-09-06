package cn.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.crm.mapper.CustomerMapper;
import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.service.CustomerService;
import cn.itheima.crm.utils.Page;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午10:54:57 
* @describe 
*/
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public Page<Customer> queryCustoerByCondition(QueryVo queryVo) {
		int start =(queryVo.getPage()-1)*queryVo.getRows();
		queryVo.setStart(start);
		
		// 2.查询客户列表
		List<Customer> list = customerMapper.queryCustomerByCondition(queryVo);
		
		// 3.统计客户记录数
		Integer tatals = customerMapper.countCustomerByCondition(queryVo);
		
		// 4.创建分页对象
		
		return new Page<>(tatals, queryVo.getPage(),queryVo.getRows(), list);
	}
	@Override
	public Customer queryCustomerById(Long id) {
		
		return customerMapper.queryCustomerById(id);
	}
	@Override
	public void updateCustomerById(Customer customer) {
		
		customerMapper.updateCustomerById(customer);
	}
	
	@Override
	public void deleteCustomerById(Long id) {
		customerMapper.deleteCustomerById(id);
	}

}

package cn.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itheima.crm.po.BaseDict;
import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.service.BaseDictService;
import cn.itheima.crm.service.CustomerService;
import cn.itheima.crm.utils.Page;

/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午3:54:37 
* @describe 
*/
@Controller
@RequestMapping("cust")
public class CustomerController {

	// 注入数据字典service
	@Autowired
	private BaseDictService baseDictService;
	// 注入客户service
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String list(Model model ,QueryVo queryVo){
		// 1.综合查询条件初始化
//		客户来源：fromType：002	
	List<BaseDict> fromType = baseDictService.queryBaseDictByTypeCode("002");

//		客户所属行业：industryType：001
	List<BaseDict> industryType = baseDictService.queryBaseDictByTypeCode("001");
		
//		客户所属行业：industryType：006
	List<BaseDict> levelType = baseDictService.queryBaseDictByTypeCode("006");
	
	model.addAttribute("fromType", fromType);
	model.addAttribute("industryType", industryType);
	model.addAttribute("levelType", levelType);
	
	Page<Customer> page = customerService.queryCustoerByCondition(queryVo);
	
	// 4.设置客户列表的模型数据
	model.addAttribute("page",page);
	
	// 5.综合查询条件回显
	model.addAttribute("custName",queryVo.getCustName());
	model.addAttribute("custSource",queryVo.getCustSource());
	model.addAttribute("custIndustry",queryVo.getCustIndustry());
	model.addAttribute("custLevel",queryVo.getCustLevel());
	
		return "customer";
	}
	
	//<%=basePath%>cust/edit]
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Long id){
		// 1.根据客户Id查询客户 
		Customer customer = customerService.queryCustomerById(id);
		
		return customer;
	}
	
	//<%=basePath%>cust/update
	// 保存客户信息
	@RequestMapping("update")
	@ResponseBody
	public void update(Customer customer){
		System.out.println(customer);
		// 1.保存客户信息
		customerService.updateCustomerById(customer);
	}
	
	//<%=basePath%>cust/delcust
	@RequestMapping("delcust")
	@ResponseBody
	public void delcust(Long id){
		// 1.删除客户信息
		customerService.deleteCustomerById(id);
	}
}

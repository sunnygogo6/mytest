package cn.itcast.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

/** 
* @author sunnygogo6 
* @date 2017年9月6日 下午2:14:13 
* @describe 
*/
//===================================================
@RestController
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
}

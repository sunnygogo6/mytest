package cn.itcast.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.service.NoticeService;

/** 
* @author sunnygogo6 
* @date 2017年9月6日 下午2:23:35 
* @describe 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class NoticeServiceTest {
	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void findAllTest(){
		System.out.println(noticeService.findAll());
	}
}

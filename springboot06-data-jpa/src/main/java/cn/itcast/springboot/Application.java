package cn.itcast.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @author sunnygogo6 
* @date 2017年9月5日 上午9:05:20 
* @describe 
*/
@SpringBootApplication// 代表为SpringBoot应用的启动类
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SpringApplication.run(Application.class, args);
		/** 创建SpringApplication应用对象 */
		SpringApplication springApplication=new SpringApplication(Application.class);
		/** 设置横幅模式(设置关闭) */
		springApplication.setBannerMode(Banner.Mode.OFF);
		/** 运行 */
		springApplication.run(args);
		
	}

}

package cn.itcast.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.entity.Notice;

/** 
* @author sunnygogo6 
* @date 2017年9月6日 下午12:51:18 
* @describe 
*/
@Repository
public interface NoticeDao extends JpaRepository<Notice,Long>{

}

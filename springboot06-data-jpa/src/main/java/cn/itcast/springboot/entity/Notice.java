package cn.itcast.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
* @author sunnygogo6 
* @date 2017年9月6日 下午12:49:05 
* @describe 
*/
@Entity
@Table(name="notice")
public class Notice {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id; //bigint(20) NOT NULL AUTO_INCREMENT,
    private String content; //longtext,
    private String title; //varchar(200) DEFAULT NULL,
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", content=" + content + ", title=" + title + "]";
	}
}

package cn.itheima.crm.po;
/** 
* @author sunnygogo6 
* @date 2017年8月29日 下午5:57:29 
* @describe 
*/
public class QueryVo {
//	客户名称
	private String custName;
//	客户来源
	private String custSource;
//	客户所属行业
	private String custIndustry;
//	客户级别
	private String custLevel;
	
	// 增加分页的属性：当前页，每一页显示的条数，记录起始数
	
	private Integer page=1;//默认是第一页
	private Integer rows=10;//默认每一页显示10条
	private Integer start;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	@Override
	public String toString() {
		return "QueryVo [custName=" + custName + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}
	
	
	
}

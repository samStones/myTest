package application.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "User")
public class User {
	@Id
	@Field("_id")
	private String id;

	/**
	 * 组织ID
	 */
	@Field("OrgId")
	private String orgId;

	/**
	 * 分组ID
	 */
	@Field("GroupId")
	private String groupId;

	/**
	 * 账号
	 */
	@Field("Account")
	private String account;

	/**
	 * 密码
	 */
	@Field("Password")
	private String password;

	/**
	 * 性别(0:女;1:男)
	 */
	@Field("Sex")
	private Integer sex;

	/**
	 * 用户名称
	 */
	@Field("UserName")
	Name userName;

	/**
	 * 联系方式
	 */
	@Field("Contact")
	private Contact contact;

	/**
	 * 地址
	 */
	@Field("Address")
	private Address address;

	/**
	 * 角色id列表
	 */
	@Field("Roles")
	private List<String> roles;

	/**
	 * 状态(0:无效;1:有效;){@link RecordStatus}
	 */
	@Field("Status")
	private Integer status;

	/**
	 * 出生日期(yyyy-MM-dd HH:mm:ss)
	 */
	@Field("BirthTime")
	private String birthTime;

	/**
	 * 创建日期(yyyy-MM-dd HH:mm:ss)
	 */
	@Field("CreateTime")
	private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Name getUserName() {
		return userName;
	}

	public void setUserName(Name userName) {
		this.userName = userName;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", orgId=" + orgId + ", groupId=" + groupId + ", account=" + account + ", password="
				+ password + ", sex=" + sex + ", userName=" + userName + ", contact=" + contact + ", address=" + address
				+ ", roles=" + roles + ", status=" + status + ", birthTime=" + birthTime + ", createTime=" + createTime
				+ "]";
	}

}

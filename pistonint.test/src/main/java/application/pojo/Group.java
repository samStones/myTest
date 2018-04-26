package application.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @Description:
 * @Author:Juntao Ye
 * @Date: Created in 9:45 2017/12/6
 * @Modified By:
 */
public class Group
{
    /**
     * 主键ID
     */
    @Id
    private String _id;

    /**
     * 组织ID
     */
    @Field("OrgId")
    private String orgId;

    /**
     * 名称
     */
    @Field("GroupName")
    private Name groupName;

    /**
     * 主键ID
     */
    @Field("SubId")
    private List<String> subId;

    /**
     * 层级
     */
    @Field("Level")
    private int level;

    /**
     * 排序号
     */
    @Field("SortNum")
    private int sortNum;

    /**
     * 状态(0:无效;1:有效){@link RecordStatus}
     */
    @Field("Status")
    private int status;

    /**
     * 创建时间(yyyy-MM-dd HH:mm:ss)
     */
    @Field("CreateTime")
    private String createTime;

    public String get_id()
    {
        return _id;
    }

    public void set_id(String _id)
    {
        this._id = _id;
    }

    public String getOrgId()
    {
        return orgId;
    }

    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public Name getGroupName()
    {
        return groupName;
    }

    public void setGroupName(Name groupName)
    {
        this.groupName = groupName;
    }

    public List<String> getSubId()
    {
        return subId;
    }

    public void setSubId(List<String> subId)
    {
        this.subId = subId;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getSortNum()
    {
        return sortNum;
    }

    public void setSortNum(int sortNum)
    {
        this.sortNum = sortNum;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    @Override
    public String toString()
    {
        return "Group{" + "_id='" + _id + '\'' + ", orgId='" + orgId + '\'' + ", groupName=" + groupName + ", subId=" + subId + ", level=" + level + ", sortNum=" + sortNum + ", status=" + status + ", createTime='" + createTime + '\'' + '}';
    }
}

package application.pojo;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Description:联系方式
 * @Author:Juntao Ye
 * @Date: Created in 16:00 2017/11/30
 * @Modified By:
 */
public class Contact
{
    /**
     * 邮箱
     */
    @Field("Email")
    private String email;

    /**
     * 手机
     */
    @Field("Mobile")
    private String mobile;

    /**
     * QQ
     */
    @Field("QQ")
    private String qq;

    /**
     * 微信
     */
    @Field("WeChar")
    private String weChar;

    /**
     * 电话
     */
    @Field("Phone")
    private String phone;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getQq()
    {
        return qq;
    }

    public void setQq(String qq)
    {
        this.qq = qq;
    }

    public String getWeChar()
    {
        return weChar;
    }

    public void setWeChar(String weChar)
    {
        this.weChar = weChar;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "Contact{" + "email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", qq='" + qq + '\'' + ", weChar='" + weChar + '\'' + ", phone='" + phone + '\'' + '}';
    }
}

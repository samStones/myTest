package application.pojo;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Description:名称
 * @Author:Juntao Ye
 * @Date: Created in 15:59 2017/11/30
 * @Modified By:
 */
public class Name
{
    /**
     * 中文
     */
    @Field("Cn")
    private String cn;

    /**
     * 英文
     */
    @Field("En")
    private String en;

    @Field("FullSpell")
    private String fullSpell;


    public Name()
    {
    }

    public Name(String cn, String en)
    {
        this.cn = cn;
        this.en = en;
    }

    public String getFullSpell()
    {
        return fullSpell;
    }

    public void setFullSpell(String fullSpell)
    {
        this.fullSpell = fullSpell;
    }

    public String getCn()
    {
        return cn;
    }

    public void setCn(String cn)
    {
        this.cn = cn;
    }

    public String getEn()
    {
        return en;
    }

    public void setEn(String en)
    {
        this.en = en;
    }

    @Override
    public String toString()
    {
        return "Name{" + "cn='" + cn + '\'' + ", en='" + en + '\'' + '}';
    }
}

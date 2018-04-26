package application.pojo;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Description:地址
 * @Author:Juntao Ye
 * @Date: Created in 16:03 2017/11/30
 * @Modified By:
 */
public class Address
{
    /**
     * 城市id
     */
    @Field("City")
    private String city;

    /**
     * 街道
     */
    @Field("Stree")
    private String stree;

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStree()
    {
        return stree;
    }

    public void setStree(String stree)
    {
        this.stree = stree;
    }

    @Override
    public String toString()
    {
        return "Address{" + "city='" + city + '\'' + ", stree='" + stree + '\'' + '}';
    }
}

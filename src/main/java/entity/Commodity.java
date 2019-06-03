package entity;

import java.util.Date;

public class Commodity {
    private Integer commodityId;
    private String commodityName;
    private Integer price;

    //image,des
    private String desc;
    private String imgAddr;
    private Category category;

    //库存数量
    private Integer stock;
    //我应该实际上的同一个商品应该都是同一个id吗？
    //我忘了商品的资料是怎么来的了，这是店家录入进来的
    private Integer status;
    //我需要通过categories找到商品，

    private Date createTime;
    private Date lastEditTime;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commdityName) {
        this.commodityName = commdityName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

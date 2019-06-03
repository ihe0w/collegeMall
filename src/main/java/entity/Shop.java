package entity;

public class Shop {
    private Integer shopId;
    private String shopName;

    private String shopImgAddr;
    private String shopDesc;
    //业务，shop可以定制自己的分类标签,商品只有缩略图与描述
    //需要mapper类还是直接在shop类中写与商品的映射关系呢？
    //在shop还应不应该分类展示呢？
    //如果允许shop自我定制分类标签的话，那么我必须为设计自有的分类表和entity，从技术上来说，不好

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopImgAddr() {
        return shopImgAddr;
    }

    public void setShopImgAddr(String shopImgAddr) {
        this.shopImgAddr = shopImgAddr;
    }
}

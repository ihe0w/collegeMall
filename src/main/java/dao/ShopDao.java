package dao;

import entity.Shop;

public interface ShopDao {
    int insertShop(Shop shop);
    int checkShopName(String shopName);
}

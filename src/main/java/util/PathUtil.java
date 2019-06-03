package util;

/*提供获取路径的方法及常量*/
public class PathUtil {
    private static String seperator=System.getProperty("file.separator");
    public static String getImgBasePath(){
        String os =System.getProperty("os.name");
        String basePath="";
        if (os.toLowerCase().startsWith("win")){
            basePath="D:/collegeMall/image/";
        }
        else {
            basePath="/home/collegeMall/image/";
        }
        basePath=basePath.replace("/",seperator);
        return basePath;
    }
    //13 13
    public static String getShopImagePath(Integer shopId){
        String imagePath="/upload/item/shop/img/"+shopId+"/";
        return imagePath.replace("/",seperator);
    }
}

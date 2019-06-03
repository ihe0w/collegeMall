package entity;

/*所以我想entity的设计似乎是可以不管entity之间的关系的，这是有dao去弄的*/
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private String portraitImgAddr;
    //收藏，购买记录怎么弄是？


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPortraitImgAddr() {
        return portraitImgAddr;
    }

    public void setPortraitImgAddr(String portraitImgAddr) {
        this.portraitImgAddr = portraitImgAddr;
    }
}

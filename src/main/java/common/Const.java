package common;

/*即使是修改const也是牵一发而动全身的,所以如果这个常量类被多次使用要么加封装要么不要使用多次*/
public interface Const {
    int SUCCESS = 0;
    int FAILED = -1;

    String CURRENT_USER = "currentUser";

    String EMAIL = "email";
    String USERNAME = "username";
    enum ResultStatusEnum{
        SUCCESS(1,"在线");
        //todo:failed how to handle it??? 要返回的result种类相当多，有登陆注册的，有购买失败的，有数据库问题，我难道想把所有的错误都列举出来吗？
        //异常处理到了后台的异常还是让后台来吧！
        private String value;
        private int code;
        ResultStatusEnum(int code,String value){
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }


    interface Cart {
        int CHECKED = 1;//即购物车选中状态
        int UN_CHECKED = 0;//购物车中未选中状态

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }




}

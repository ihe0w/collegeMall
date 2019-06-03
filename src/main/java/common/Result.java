package common;
/*在result这里有两种方式一种是
* private Integer resultCode;
    private String msg;
    private T data;
    * 另一种是
    * 	private boolean success;// 是否成功标志
	private T data;// 成功时返回的数据
	private String errorMsg;// 错误信息
	private int errorCode;*/
public class Result<T> {
    //int or enum?
    private Integer resultCode;
    private T data;

    public Result(Integer resultCode,T data) {
        this.resultCode = resultCode;
        this.data=data;
    }

    public static <T> Result<T> createBySuccess(T data){
        return new Result<T>(Const.SUCCESS,data);
    }
    public static <T> Result<T> createByFailed(){};
    public boolean isSuccess(){
        return resultCode==Const.SUCCESS;
    }
}

public class InvalidParamException extends Exception {
    String msg;
    public InvalidParamException(String msg) {
        super();
        this.msg = msg;
    }
}

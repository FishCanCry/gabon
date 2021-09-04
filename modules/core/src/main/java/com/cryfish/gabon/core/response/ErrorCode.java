package com.cryfish.gabon.core.response;

public class ErrorCode {
    public static ErrorCode OK = new ErrorCode(0, "OK");

    public static ErrorCode BAD_REQUEST = new ErrorCode(-400, "Bad request");
    public static ErrorCode UNAUTHORIZED = new ErrorCode(-401, "Unauthorized");

    public static ErrorCode SERVER_ERROR = new ErrorCode(-500, "Internal Server Error");
    public static ErrorCode SERVICE_UNAVAILABLE = new ErrorCode(-503, "Service unavailable");

    protected int code;
    protected String Message;

    public ErrorCode(int code, String message) {
        this.code = code;
        Message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return Message;
    }
}

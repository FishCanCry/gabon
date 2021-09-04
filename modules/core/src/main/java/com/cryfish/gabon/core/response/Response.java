package com.cryfish.gabon.core.response;

public class Response {
    protected Integer code;
    protected String message;

    public Response(ErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

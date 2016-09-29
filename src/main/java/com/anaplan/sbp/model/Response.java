package com.anaplan.sbp.model;


public class Response {
    private final String msg;

    public Response(final String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

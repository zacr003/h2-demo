package com.teamsparq.h2demo.payload.response;

import org.aspectj.bridge.Message;

public class MessageResponse {


    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

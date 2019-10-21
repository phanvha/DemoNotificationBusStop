package com.map4d.demonotificationbusstop.model;

import com.google.gson.annotations.Expose;

public class Data {
    @Expose
    private int id;
    @Expose
    private String email;
    @Expose
    private String token;
    @Expose
    private Boolean error;
    @Expose
    private String message;
    @Expose
    private int success;
//    @SerializedName("Success")
//    @Expose
//    private Boolean Success;
//    @SerializedName("Message")
//    @Expose
//    private String Message;

    public Data(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public Data(Boolean error, String message) {
        this.error = error;
        this.message = message;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data() {
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        token = token;
    }

//    public Boolean getSuccess() {
//        return Success;
//    }
//
//    public void setSuccess(Boolean success) {
//        Success = success;
//    }
//
//    public String getMessage() {
//        return Message;
//    }
//
//    public void setMessage(String message) {
//        Message = message;
//    }
}
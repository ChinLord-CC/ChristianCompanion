package com.glorytog_d.app2;

/**
 * Created by Chinonso25 on 18/06/2015.
 */
public class UserInfo {
    private int _id;
    private String _username;

    public UserInfo(){

    }

    public UserInfo(String username) {
        this._username = username;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }
}


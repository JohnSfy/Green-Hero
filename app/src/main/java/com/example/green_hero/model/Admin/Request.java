package com.example.green_hero.model.Admin;

import com.example.green_hero.model.User.ClassicUser;

import org.bson.types.ObjectId;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Request extends RealmObject {
    @PrimaryKey
    private ObjectId _id;
    private ClassicUser user;
    private String status;

    public Request(ObjectId _id, ClassicUser user, String status) {
        this._id = _id;
        this.user = user;
        this.status = status;
    }

    public Request() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public ClassicUser getUser() {
        return user;
    }

    public void setUser(ClassicUser user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

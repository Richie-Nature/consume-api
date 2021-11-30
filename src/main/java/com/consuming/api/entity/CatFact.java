package com.consuming.api.entity;

import com.consuming.api.Status;

import java.util.Date;

public class CatFact {

    private Status status;
    private String _id;
    private String user;
    private String text;
    private int _v;
    private String source;
    private Date updatedAt;
    private String type;
    private Date createdAt;
    private Boolean deleted;
    private Boolean used;

    public CatFact() {}

    public CatFact(String _id, String user, String text, int _v, String source, String type,
                   Date updatedAt, Date createdAt, Boolean deleted, Boolean used, Status status) {
        this._id = _id;
        this.user = user;
        this.text = text;
        this._v = _v;
        this.source = source;
        this.type = type;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.deleted = deleted;
        this.used = used;
        this.status = status;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int get_v() {
        return _v;
    }

    public void set_v(int _v) {
        this._v = _v;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "_id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", _v=" + _v +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", deleted=" + deleted +
                ", used=" + used +
                '}';
    }
}

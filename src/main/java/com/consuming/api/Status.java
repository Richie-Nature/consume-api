package com.consuming.api;

public class Status {
     private Boolean verified;
     private int sentCount;

     public Status() {

     }

    public Status(Boolean verified, int sentCount) {
        this.verified = verified;
        this.sentCount = sentCount;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }
}

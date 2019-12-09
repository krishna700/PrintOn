package com.printon.user.dbmodel;

public class EventModel {
    String eventType,name,phone,address,landmark,id;

   public EventModel(){}

    public EventModel(String id,String name, String eventType, String phone, String address, String landmark)
    {
        this.name=name;
        this.eventType=eventType;
        this.phone=phone;
        this.address=address;
        this.landmark=landmark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEventType() {
        return eventType;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

}

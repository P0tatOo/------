package com.example.moapp_project;

public class MemberInfo {

    private String name;
    private String phoneNumber;
    private String birthDay;
    private String address;
    //히히
    public MemberInfo(String name, String phoneNumber,String birthDay,String address){
        this.name= name;
        this.phoneNumber=phoneNumber;
        this.birthDay=birthDay;
        this.address=address;
    }
//쨘
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getBirthDay(){
        return this.birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay=birthDay;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }

}

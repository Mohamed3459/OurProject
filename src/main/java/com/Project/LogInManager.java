package com.Project;

public class LogInManager{
    private String username;
    private String password;


    public LogInManager(String username,String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
       }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public boolean isLoginSuccessful(String username,String password){
        return this.username.equals(username) && this.password.equals(password);
    }

//
//    public static void main(String[]args){
//        Login user = new Login("oop","1234567");
//        if(user.login("oop","1234567"))
//
//    System.out.println("تم تسجيل الدخول بنجاح");
//
//                  else {
//     System.out.println("فشل في تسجيل الدخول برجاء المحاولة مرة اخرى");    
//                  }
//    }
}

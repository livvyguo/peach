package org.lvy.wwt.domain

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/3/21.
 * @author livvy
 * @date 2017/03/21
 */
class User {

    String uno;
    String uname;
    String upassword;
    String uclass;


    @Override
    public String toString() {
        return "User{" +
                "uno='" + uno + '\'' +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uclass='" + uclass + '\'' +
                '}';
    }
}

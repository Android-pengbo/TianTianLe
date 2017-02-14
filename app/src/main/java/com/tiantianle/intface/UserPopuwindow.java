package com.tiantianle.intface;

/**
 * Created by PengBo  on 2017/2/10.
 */

public class UserPopuwindow {
        private  MyInterface mMyInterface;
    public void setMyInterface(MyInterface myInterface){
        mMyInterface=myInterface;
    }
    public void userPopu(){
        mMyInterface.showPopuwindow();
    }
}

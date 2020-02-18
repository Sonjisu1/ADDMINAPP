package com.example.addminapp;

import android.os.Parcel;

//아이템 뷰에 표시될 데이터를 저장할 클래스 정의
public class ListViewItem {
    private int iconDrawable;  //그림1
    private String titleStr ;  //사용자 이름



    public ListViewItem(){

    }

    public ListViewItem(int icon, String title){
        this.iconDrawable = icon;
        this.titleStr = title;


    }

    protected ListViewItem(Parcel in) {
        iconDrawable = in.readInt();
        titleStr = in.readString();

    }



    public void setIcon(int icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }


    public int getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }




}

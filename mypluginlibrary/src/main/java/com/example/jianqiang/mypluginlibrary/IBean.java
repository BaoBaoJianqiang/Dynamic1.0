package com.example.jianqiang.mypluginlibrary;

/**
 * Created by baojianqiang on 16/2/23.
 */
public interface IBean {
    String getName();

    void setName(String paramString);

    void register(ICallback callBack);
}

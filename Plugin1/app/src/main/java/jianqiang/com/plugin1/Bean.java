package jianqiang.com.plugin1;

import com.example.jianqiang.mypluginlibrary.IBean;
import com.example.jianqiang.mypluginlibrary.ICallback;

public class Bean implements IBean {
    private String name = "jianqiang";

    private ICallback callback;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String paramString) {
        this.name = paramString;
    }

    @Override
    public void register(ICallback callback) {
        this.callback = callback;

        //clickButton();
    }

    public void clickButton() {
        callback.sendResult("Hello: " + this.name);
    }
}

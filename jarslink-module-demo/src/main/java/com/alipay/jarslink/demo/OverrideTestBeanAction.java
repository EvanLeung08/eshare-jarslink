package com.alipay.jarslink.demo;

import com.alipay.jarslink.api.Action;
import org.springframework.stereotype.Component;

/**
 * @author joe
 * @version 2018.03.29 17:37
 */
@Component
public class OverrideTestBeanAction implements Action<String, String> {
    private HelloWorldBean helloWorldBean;

    @Override
    public String execute(String s) {
        return helloWorldBean.work(s);
    }

    @Override
    public String getActionName() {
        return "overrideTestBeanAction";
    }

    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }
}

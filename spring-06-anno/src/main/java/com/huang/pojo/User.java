package com.huang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component 组件  等价于<bean id="user" class="com.huang.pojo.User"/>
@Component
@Scope("prototype")
public class User {
    /*public String name = "黄亮";*/

/*    @Value("黄亮二号")
    public String name;*/

    public String name;

    @Value("黄亮二号")
    public void setName(String name) {
        this.name = name;
    }
}

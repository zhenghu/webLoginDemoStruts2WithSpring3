package com.zhenghu.demo.web.actions;

import org.apache.struts2.StrutsSpringTestCase;

/**
 * Created by hz on 7/22/2014.
 */
public class ConfigTest extends StrutsSpringTestCase {
    @Override
    public String[] getContextLocations(){
        return new String[]{"file:src/main/webapp/WEB-INF/applicationContext.xml"};
    }
}

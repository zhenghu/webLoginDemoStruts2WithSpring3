package com.zhenghu.demo.web.actions.testutils;

import org.apache.struts2.StrutsSpringTestCase;

/**
 * Created by hz on 7/22/2014.
 */
public abstract class ConfigTest extends StrutsSpringTestCase {

    @Override
    public String[] getContextLocations(){
        return new String[]{"file:src/main/webapp/WEB-INF/applicationContext.xml"};
    }
}

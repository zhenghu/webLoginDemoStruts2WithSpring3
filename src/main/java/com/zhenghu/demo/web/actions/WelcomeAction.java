package com.zhenghu.demo.web.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import com.zhenghu.demo.web.model.InformationBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hz on 7/22/2014.
 */
public class WelcomeAction extends ActionSupport implements ModelDriven<InformationBean> {

    @Autowired
    private InformationBean informationBean;

    public String execute(){
        return ActionSupport.SUCCESS;
    }

    public String add(){
        return ActionSupport.SUCCESS;
    }

    @Override
    public InformationBean getModel(){
        return informationBean;
    }
}

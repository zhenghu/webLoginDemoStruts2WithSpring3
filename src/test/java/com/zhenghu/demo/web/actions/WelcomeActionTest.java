package com.zhenghu.demo.web.actions;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;
import com.zhenghu.demo.web.actions.testutils.ConfigTest;
import org.fest.assertions.api.Assertions;

public class WelcomeActionTest extends ConfigTest{

   public void test_add_should_return_success(){
       //Given
       ActionProxy actionProxy = getActionProxy("jsp/welcome");
       WelcomeAction action = (WelcomeAction)actionProxy.getAction();

       //When
       String addResult = action.add();
       String result = action.execute();

       //Then
       Assertions.assertThat(addResult).isEqualTo(ActionSupport.SUCCESS);
       Assertions.assertThat(result).isEqualTo(ActionSupport.SUCCESS);
   }
}
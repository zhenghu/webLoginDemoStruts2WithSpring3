package com.zhenghu.demo.web.actions;

import com.zhenghu.demo.web.model.InformationBean;
import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeActionSpringTest {

    @InjectMocks
    private WelcomeAction welcomeAction = new WelcomeAction();

    @Mock
    private InformationBean informationBean;

    @Test
    public void test_getModel_return_information_bean(){
        //Given
        final String information = "information";
        Mockito.when(informationBean.getInformation()).thenReturn(information);

        //When
        InformationBean result = welcomeAction.getModel();

        //Then
        Assertions.assertThat(result.getInformation()).isEqualTo(information);
    }

}
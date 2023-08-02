package com.play.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
public class TestHelloWorld {

    //private final AemContext aemContext = AppAemContext.newAemContext();
    private final AemContext aemContext = new AemContext();
    @Mock
    private HelloWorldModel helloWorldModel;

    @BeforeEach
    public void setup() throws Exception {
        aemContext.addModelsForClasses(HelloWorldModel.class);
        aemContext.load().json("/com/play/core/models/helloworldmodel.json","/content/playstation/us/en/home");

    }

    @Test
    void testMessage() throws Exception {
        aemContext.currentPage("/content/playstation/us/en/home");
        aemContext.currentResource("/content/playstation/us/en/home/jcr:content/root/container/container/helloworld");
        helloWorldModel =aemContext.request().adaptTo(HelloWorldModel.class);
        String expected= "IN_LINE1";
        String actual = helloWorldModel.getType();
        assertEquals(expected, actual);

    }
}

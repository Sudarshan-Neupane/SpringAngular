package com.vastika.springAngular;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import  static org.springframework.test.web.servlet.MockMvcBuilderSupport.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
public class BlogEntryControllerTest {
  @InjectMocks
  private BlogEntryController controller;
  
  private MockMvc mockMvc;
  @Before
  public void setup(){
	MockitoAnnotations.initMocks(this); 
	mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
  }
  @Test
  public void test() throws Exception{
	  
//	 mockMvc.perform(get("/test")).andDo(print());
  }
}

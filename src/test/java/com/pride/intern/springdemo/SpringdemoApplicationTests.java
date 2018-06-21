//package com.pride.intern.springdemo;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@SpringBootTest
//public class SpringdemoApplicationTests {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void shouldReturnMessage() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/welcome/deepanshu").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk()).andExpect(content().string("deepanshu"));
//    }
//
//}
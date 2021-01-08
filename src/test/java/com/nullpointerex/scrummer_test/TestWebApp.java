package com.nullpointerex.scrummer_test;

import com.nullpointerex.scrummer_test.entity.models.Circulo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



public class TestWebApp extends ScrummerTestApplicationTests{

    @Autowired
    private WebApplicationContext webadppcomtext;

    private MockMvc mockMvc;
    private FiguraTest ft;

    @Before
    public void before(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webadppcomtext).build();
    }

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }

    @Test
    public void figutatest() throws Exception{
        ft = new FiguraTest();
        ft.perimetro();
        ft.area();
    }




}


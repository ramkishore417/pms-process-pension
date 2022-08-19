package com.ramkishore.processpension.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramkishore.processpension.model.ProcessPensionInput;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class ProcessPensionControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Mock
    private ProcessPensionController controller;


    @Test
    public void contextLoads() {
        assertNotNull(controller);
    }

    @Test
    public void SuccessTest1() throws Exception {

        ResultActions actions = mockMvc.perform(get("/"));
        actions.andExpect(status().isOk());
    }
    @Test
    public void FailureTest1() throws Exception {

        ResultActions actions = mockMvc.perform(post("/"));
        actions.andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void ProcessPensionFailureTest() throws Exception {
        ProcessPensionInput processPensionInput = new ProcessPensionInput("123456789012");
        ResultActions actions = mockMvc.perform(post("/ProcessPension").contentType(MediaType.APPLICATION_JSON).content(asJsonString(processPensionInput)));
        actions.andExpect(status().isBadRequest());
    }

    @Test
    public void ProcessPensionFailureTest1() throws Exception {

        ResultActions actions = mockMvc.perform(get("/ProcessPension"));
        actions.andExpect(status().isMethodNotAllowed());
    }


    @Test
    public void PensionStatusFailureTest() throws Exception {

        ResultActions actions = mockMvc.perform(get("/ProcessPension"));
        actions.andExpect(status().isMethodNotAllowed());
    }

    public static String asJsonString(ProcessPensionInput input) {
        try {
            return new ObjectMapper().writeValueAsString(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String asJsonString1(ProcessPensionInput input) {
        try {
            return new ObjectMapper().writeValueAsString(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

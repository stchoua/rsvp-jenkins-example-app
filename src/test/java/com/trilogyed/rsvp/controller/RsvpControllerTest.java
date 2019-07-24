package com.trilogyed.rsvp.controller;

import com.trilogyed.rsvp.dao.RsvpDao;
import com.trilogyed.rsvp.model.Rsvp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RsvpController.class)
public class RsvpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RsvpDao rsvpDao;

    @Test
    public void getRsvpByIdReturnsRsvp() throws Exception {

//        int id = 5;
//
//        // assemble/arrange
//        Rsvp myRsvpInput = new Rsvp(id,"Keanu Reeves",2);
//
//        when(rsvpDao.getRsvp(id)).thenReturn(myRsvpInput);
//
//        // act and assert at the same time! what?!?!?!
//        this.mockMvc.perform(get("/rsvps" + id)).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().json("{\"guestName\":\"Keanu Reeves\", \"id\":" + 5 + "}" ));
//                .andExpect(content().json("{\"guestName\":\"Keanu Reeves\", \"id\":" + 5 + "}" ));
    }
}

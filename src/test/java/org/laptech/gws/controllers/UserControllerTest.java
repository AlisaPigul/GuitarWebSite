package org.laptech.gws.controllers;

import org.junit.Test;
import org.laptech.gws.data.repositories.UserRepository;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author rlapin on 12/13/16.
 */
public class UserControllerTest {


    @Test
    public void shouldSignUp() throws Exception {
        UserRepository repository = mock(UserRepository.class);
        UserController controller = new UserController(repository);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/signup.jsp")).build();
        mockMvc.perform(get("/signup")).andExpect(view().name("signup"));
    }


}
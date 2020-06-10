package br.ufpe.cin.if1007.springactuators;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import br.ufpe.cin.if1007.springactuators.controllers.HelloWorldController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

    // @LocalServerPort
    // private int port;

    @Autowired
    private HelloWorldController helloWorldController;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void smokeTest() throws Exception {
        assertThat(helloWorldController).isNotNull();
    }

    // @Test
    // public void helloWorldTest() throws Exception {
    // this.restTemplate.getForObject("http://localhost:" + port + "/",
    // String.class)
    // .contains("\"content\":\"Hello, ");
    // }
}
package pl.jojczykp.jenkins_pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {

    private Service service = new Service();

    @Test
    void shouldSayHello() {
        String result = service.sayHello();

        assertEquals("Hello!", result);
    }
    
    
    @Test
    void someMaths() {
        int x = 1;
        int y = 2
        int result = 3; // FIX ME PLEASE! (THIS TEST BREAKE THE PIPELINE) 

        assertEquals(x+y, result);
    }
}

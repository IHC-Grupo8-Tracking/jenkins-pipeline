package pl.jojczykp.jenkins_pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class OtherTest {

    @Test
    void shouldPrintAndPass() {
        System.out.println("========");
        System.out.println(" Step 1 ");
        System.out.println("========");
        System.out.println("--------");
        System.out.println("Request");
        System.out.println("--------");
        System.out.println("Header1: abc");
        System.out.println("Header2: xyz");
        System.out.println("");
        System.out.println("{");
        System.out.println("   \"json\": \"body\"");
        System.out.println("}");
        System.out.println("--------");
        System.out.println("Response");
        System.out.println("--------");
        System.out.println("Header1: abc");
        System.out.println("Header2: xyz");
        System.out.println("");
        System.out.println("{");
        System.out.println("   \"json\": \"body\"");
        System.out.println("}");

        System.err.println("Some Error Log Message");

        //fail("Oooopppsss.... Failing :)");
    }

    @Test
    void shouldPrintAndFail() {
        System.out.println("Some StdOut Log Message");
        System.err.println("Some StdErr Log Message");
    }
}

package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {
    int result;
    @BeforeAll
    static void beforeAll(){
        System.out.println("######      beforeAll()\n");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("\n###      beforeAll()\n");
    }
    @BeforeEach
    void beforEach(){
        result=getResult();
        System.out.println("###       beforEach");
    }
    @AfterEach
    void afterEach(){
        result=0;
        System.out.println("####          afterEach()\n");
    }
    @Test
    void firstTest(){
        Assertions.assertTrue(3>2);
        System.out.println("###          firstTest()");
    }
  private int getResult(){
        return 3;
    }
    @Test
    void secondTest(){
        Assertions.assertTrue(4>2);
        System.out.println("###        secondtest");
    }
    @Test
    void thirdTest(){
        Assertions.assertTrue(5>2);
        System.out.println("####        thirdtest");
    }


}


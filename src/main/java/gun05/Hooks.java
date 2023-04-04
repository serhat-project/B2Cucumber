package gun05;

import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    // her senaryo öncesi
    @Before(order = 1)
    public void before1(){
        System.out.println("before1");
    }


    // her senaryo sonrasi
    @After
    public void after1(Scenario scenario){
        System.out.println("after1 " + scenario.isFailed());
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }


    // her senaryo öncesi
    @Before(order = 2)
    public void before2(){
        System.out.println("before2");
    }


    // her senaryo öncesi
    @Before("@login and @logout")
    public void before3(){
        System.out.println("before2");
    }

/*          @Before("@login")               ->
            @Before("@login and @logout")
            @Before("@login and not @logout")
            @Before("~@logout")


 */


}

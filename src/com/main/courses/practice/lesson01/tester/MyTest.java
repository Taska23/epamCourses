package courses.practice.lesson01.tester;

public class MyTest {

    @Before
    public void before1(){
        System.out.println("before 1");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }


    private void noTest(){
        System.out.println("no a test");
    }
}

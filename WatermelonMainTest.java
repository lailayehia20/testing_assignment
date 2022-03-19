import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class WatermelonMainTest {
    @Test
    // testing weight out of range >100
    public void test1(){
        String x = "200";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()== null);
    }
    @Test
    // testing weight out of range <1
    public void test2(){
        String x = "0";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()==null);
    }
    @Test
    //testing weight in range and can be divided into 2 even numbers
    public void test3(){
        String x = "50";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()=="yes");
    }
    @Test
    //testing weight in range and cannot be divided into 2 even numbers
    public void test4(){
        String x = "47";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()=="No");
    }
    @Test
    //testing weight in range and cannot be divided into 2 even numbers but is divisible by 2
    public void test5(){
        String x = "2";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()=="No");
    }
    @Test
    // codeforces testcase
    public void test6(){
        String x = "8";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(WatermelonMain.checker()=="yes");
    }
}

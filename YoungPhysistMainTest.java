import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.*;

public class YoungPhysistMainTest {
    @Test
    //testing n out of range > 100
    public void test1(){
        String x = "200";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()==null);
    }
    @Test
    // testing n out of range < 1
    public void test2(){
        String x = "-10";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()==null);
    }
    @Test
    // testing equilibrium state
    public void test3(){
        /*     entered data:
                   n=4
        x1= 6     y1= -10     z1= 8
        x2= 2     y2= 5       z2= 2
        x3= 1     y3= -2      z3=-14
        x4= -9    y4= 7       z4= 4
                 */
        String x = "4 6 -10 8 2 5 2 1 -2 -14 -9 7 4 ";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()=="yes");
    }
    @Test
    //testing unequilibrium state
    public void test4(){
         /*     entered data:
                   n=4
        x1= 6     y1= 5       z1= 8
        x2= 2     y2= -1      z2= 2
        x3= 3     y3= -2      z3=-4
        x4= -9    y4= 2       z4= 4
                 */
        String x = "4 6 5 8 2 -1 2 3 -2 -4 -9 2 4 ";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()=="No");
    }
    @Test
    //testing z out of range <-100
    public void test5(){
         /*     entered data:
                   n=4
        x1= 6     y1= 5       z1= 5
        x2= 2     y2= -1      z2= 2
        x3= 3     y3= -2      z3=-4
        x4= -9    y4= 2       z4= -200
                 */
        String x = "4 6 5 8 2 -1 2 3 -2 -4 -9 2 -200 ";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()==null);
    }
    @Test
    //testing y out of range >100
    public void test6(){
         /*     entered data:
                   n=4
        x1= 6     y1= 5       z1= 8
        x2= 2     y2= -1      z2= 2
        x3= 3     y3= -2      z3=-4
        x4= -9    y4= 200     z4= 4
                 */
        String x = "4 6 5 8 2 -1 2 3 -2 -4 -9 200 4 ";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()==null);
    }
    @Test
    // testing x out of range >100
    public void test7(){
         /*     entered data:
                   n=4
        x1= 6     y1= 5       z1= 8
        x2= 2     y2= -1      z2= 2
        x3= 300   y3= -2      z3=-4
        x4= -9    y4= 200     z4= 4
                 */
        String x = "4 6 5 8 2 -1 2 300 -2 -4 -9 200 4 ";
        System.setIn(new ByteArrayInputStream(x.getBytes()));
        assertTrue(YoungPhysistMain.equilibriumChecker()==null);
    }

}
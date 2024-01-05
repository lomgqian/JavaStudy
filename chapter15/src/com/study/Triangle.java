package com.study;

/**
 * @date 2023/12/28 14:08
 */
public class Triangle {

    protected long lborderA = 0;
    protected long lborderB = 0;
    protected long lborderC = 0;

    public Triangle(long lborderA, long lborderB, long lborderC) {
        this.lborderA = lborderA;
        this.lborderB = lborderB;
        this.lborderC = lborderC;
    }
    public boolean isTriangle(Triangle triangle) {
        boolean isTriangle = false;
        if ((triangle.lborderA > 0 && triangle.lborderA <= 100)
                && (triangle.lborderB > 0 && triangle.lborderB <= 100)
                && (triangle.lborderC > 0 && triangle.lborderC <= 100)) {
            if (diffOfBorders(triangle.lborderA, triangle.lborderB) < triangle.lborderC
                    && diffOfBorders(triangle.lborderB, triangle.lborderC) < triangle.lborderA
                    && diffOfBorders(triangle.lborderC, triangle.lborderA) < triangle.lborderB) {
                isTriangle = true;
            }
        }
        return isTriangle;
    }


    public String getType(Triangle triangle) {
        String strType = "不构成三角形";
        if (isTriangle(triangle)) {
            if (triangle.lborderA == triangle.lborderB
                    && triangle.lborderB == triangle.lborderC) {
                strType = "等边三角形";
            }	else if ((triangle.lborderA != triangle.lborderB)
                    && (triangle.lborderB != triangle.lborderC)
                    && (triangle.lborderA != triangle.lborderC)) {
                strType = "一般三角形";
            }	else {
                strType = "等腰三角形";
            }
        }
        return strType;
    }


    public long diffOfBorders(long a, long b) {
        return (a > b) ? (a - b) : (b - a);
    }

    public long[] getBorders() {
        long[] borders = new long[3];
        borders[0] = this.lborderA;
        borders[1] = this.lborderB;
        borders[2] = this.lborderC;
        return borders;
    }}

//import static org.junit.Assert.*;
//import org.junit.Test;
//public class TestTriangle{
//
//    @Test
//    public void testIsTriangle1(){
//        Triangle t = new Triangle(-1,10,2);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle2(){
//        // according to the mutant, this test case should fail
//        Triangle t = new Triangle(3,2,1);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle3(){
//        Triangle t = new Triangle(3,1,2);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle4(){
//        Triangle t = new Triangle(2,1,3);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle5(){
//        Triangle t = new Triangle(2,3,1);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle6(){
//        Triangle t = new Triangle(1,2,3);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testIsTriangle7(){
//        Triangle t = new Triangle(1,3,2);
//        assertFalse(t.isTriangle(t));
//    }
//
//    @Test
//    public void testType1(){
//        Triangle t = new Triangle(4,3,2);
//        assertEquals(t.getType(t),"S一般三角形");
//    }
//
//    @Test
//    public void testType2(){
//        Triangle t = new Triangle(3,3,2);
//        assertEquals(t.getType(t),"等腰三角形");
//    }
//
//    @Test
//    public void testType3(){
//        Triangle t = new Triangle(3,3,3);
//        assertEquals(t.getType(t),"等边三角形");
//    }
//
//    @Test
//    public void testType4(){
//        Triangle t = new Triangle(2,3,3);
//        assertEquals(t.getType(t),"等腰三角形");
//    }
//}


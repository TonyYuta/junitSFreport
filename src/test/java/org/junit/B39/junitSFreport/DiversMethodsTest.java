/**
 *   File Name: DiversMethodsTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 28, 2016
 *   
 */

package org.junit.B39.junitSFreport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DiversMethodsTest {

@BeforeClass
public static void beforeClass() throws Exception {}
@AfterClass
public static void afterClass() throws Exception {}
@Before
public void before() throws Exception {}
@After
public void after() throws Exception {}

@Test
public void test_01_AssertEquals_Positive() {
	assertEquals("String not the same", "Testing JUnit 4", DiversMethods.s);
	}

@Test
public void test_02_AssertEquals_Negative() {
	assertEquals("String not the same.", "Testing TestNG 6", DiversMethods.s);
	}

@Ignore
@Test
public void test_03_AssertEquals_Ignored() {
	assertEquals("String not the same.", "Testing JUnit 3", DiversMethods.s);
}

@Test
public void test_04_AssertSame_Positive() {
	assertSame("Integer not the same.", 55,DiversMethods.i);
}

@Test
public void test_05_AssertSame_Negative() {
	assertSame("Integer not the same.", 54,DiversMethods.i);
}

@Ignore
@Test
public void test_06_AssertSame_Ignored() {
	assertSame("Integer not the same.", 56,DiversMethods.i);
}

@Test
public void test_07_AssertFalse_Positive() {
	assertFalse("Boolean should be false", DiversMethods.f);
}

@Test
public void test_08_AssertFalse_Negative() {
	assertFalse("Boolean should be false", DiversMethods.t);
}

@Test
public void test_09_AssertTrue_Positive() {
	assertTrue("Boolean should be true", DiversMethods.t);
}

@Test
public void test_10_AssertTrue_Negative() {
	assertTrue("Boolean should be true", DiversMethods.f);
	}
}


package pkdm2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNamNhuan {

	@Test
	public void test() {
		NamNhuan a = new NamNhuan();
		assertEquals(y.TimNamNhuan(2000),1);
	}
	@Test
	public void test1() {
		NamNhuan b = new NamNhuan();
		assertEquals(y.TimNamNhuan(2012),0);
	}
	@Test
	public void test2() {
		NamNhuan c = new NamNhuan();
		assertEquals(y.TimNamNhuan(1900),2);
	}
	@Test
	public void test3() {
		NamNhuan d = new NamNhuan();
		assertEquals(y.TimNamNhuan(2001),2);
	}

}

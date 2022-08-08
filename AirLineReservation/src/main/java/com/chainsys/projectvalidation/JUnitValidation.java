package com.chainsys.projectvalidation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitValidation {
	
	AirLineValidation alv=new AirLineValidation();
	
	@Test
	public void nameTest1() {
		assertEquals("Arunachalam", alv.pnameVal("Arunachalam"));
	}
	
	@Test
	public void nameTest2() {
		assertEquals("Arunachalam", alv.pnameVal(" "));
	}
	@Test
	public void nameTest3() {
		assertEquals("Arunachalam", alv.pnameVal("Ar"));
	}
	
	@Test
	public void addrTest1() {
		assertEquals("12,KVP@Vnr", alv.paddrVal("12,KVP@Vnr"));
	}
	
	@Test
	public void addrTest2() {
		assertEquals("12,KVP@Vnr", alv.paddrVal("Kvp"));
	}
	@Test
	public void addrTest3() {
		assertEquals("12,KVP@Vnr", alv.paddrVal(""));
	}
	
	@Test
	public void mobileTest1() {
		assertEquals("9282281090", alv.pmobNoVal("9282281090"));
	}
	
	@Test
	public void mobileTest2() {
		assertEquals("8283183209", alv.pmobNoVal("92822810"));
	}
	@Test
	public void mobileTest3() {
		assertEquals("7282281090", alv.pmobNoVal(""));
	}
	
	@Test
	public void unameTest1() {
		assertEquals("Arunach@192", alv.puserNameVal("Arunach@192"));
	}
	
	@Test
	public void unameTest2() {
		assertEquals("Parthiban@1928", alv.puserNameVal("9282swAcd"));
	}
	@Test
	public void unameTest3() {
		assertEquals("Arunac@9w8u", alv.puserNameVal(""));
	}
	
	@Test
	public void passwordTest1() {
		assertEquals("Arun@1925", alv.ppasswordValidation("Arunach@192"));
	}
	
	@Test
	public void passwordTest2() {
		assertEquals("Parthi@1928", alv.ppasswordValidation("wuyhuyqw"));
	}
	@Test
	public void passwordTest3() {
		assertEquals("Arun@9w82", alv.ppasswordValidation(""));
	}

}

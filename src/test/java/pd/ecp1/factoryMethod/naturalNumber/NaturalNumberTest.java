package pd.ecp1.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {
	NaturalNumber nEs;
	NaturalNumber nEn;
	
	@Before
    public void ini() {
		NumbersManager manager = new NumbersManager();
		manager.setCreator(new NumberCreatorEs());
		manager.createNumber(2);
		nEs = manager.getNumber();
		
		manager.setCreator(new NumberCreatorEn());
		manager.createNumber(3);
		nEn = manager.getNumber();
	}
	
	@Test
    public void testGetValue() {
		assertEquals(2, nEs.getValue());
		assertEquals(3, nEn.getValue());
	}
	
	@Test
	public void testSetValue(){
		nEs.setValue(0);
		nEn.setValue(1);
		
		assertEquals(0, nEs.getValue());
		assertEquals(1, nEn.getValue());
	}
	
	@Test
	public void testAdd(){
		nEs.add(2);
		nEn.add(1);
		
		assertEquals(4, nEs.getValue());
		assertEquals(4, nEn.getValue());
	}
	
	@Test
	public void testGetTextValue(){
		assertEquals("dos", nEs.getTextValue());
		assertEquals("three", nEn.getTextValue());
	}
}

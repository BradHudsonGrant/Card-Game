/**
 * 
 * @author Bradley Hudson-Grant
 *
 */
import java.util.*;
import javax.management.Attribute;

/** Card class that links the cards values and attributes together. */
public class Card {
	Random rn = new Random();
	public String cardName;
	Attribute[] attributesArr;
	public String attrName;
	int attrValue;
	
	
	
	public Card(String CardName, String[] attrName, int[] attrValue) {
		this.cardName = CardName;
		attributesArr = new Attribute[4];
		for (int i = 0; i < 4; i++){
			this.attributesArr[i] = new Attribute(attrName[i], attrValue[i]);
		}
	}
	
	public String getCardName(){
		return cardName;
	}
	
	public String getAttrName(){
		return cardName;
	}
	public int getAttrValue(){
		return attrValue;
	}
	public Attribute[] getAttributesArr(){
		return attributesArr;
	}	

}

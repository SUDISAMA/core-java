package com.collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
product p1= new product("Apple");

product p2= new product("ThinkPad");

product p3= new product("MackBook");

product p4= new product("oneplus");

product p5= new product("Rockwell");

product p6= new product("Himalaya");
HashSet<product> no_duplicate= new HashSet<product>();

no_duplicate.add(p1);
no_duplicate.add(p2);
no_duplicate.add(p3);
no_duplicate.add(p4);
no_duplicate.add(p5);
no_duplicate.add(p6);

//the duplicate object addition
no_duplicate.add(p3);
System.out.println(no_duplicate);

	}

}
class product {
private String p_name;
public product(String p_name) {
	this.p_name=p_name;
	
}
@Override
public String toString(){
    return "Product name: "+p_name;
}
}

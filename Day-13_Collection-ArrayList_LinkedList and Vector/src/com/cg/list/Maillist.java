
package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int PlotNo;
	private String Street;
	private String Area;
	private String city;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		PlotNo = plotNo;
		Street = street;
		Area = area;
		this.city = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [PlotNo=%s, Street=%s, Area=%s, city=%s, State=%s]", PlotNo, Street, Area, city,
				State);
	}
	
}

public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add element to the link list
		obj.add(new Address(121,"Lane no2","Airoli","Navi Mumbai","Maharashtra"));
		obj.add(new Address(533,"Lane no3","Vishrantwadhi","pune","Maharashtra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
		}
		System.out.println();
	}

}
package ua.khpi.oop.zavadskyi06;

import java.io.Serializable;

import java.util.Iterator;

public class Container implements Serializable {
	private String [] container;
	private int size;
	
	public String[] getContainer() {
		return container;
	}

	public void setContainer(String[] container) {
		this.container = container;
	}

	public String toString() // ������� ���� ���������� � ������ �����;
	{
		
		String str = "";
		for (String string : container) {
			str += string + " ";
		} 
		return str;
		
	}
	
	public void add(String str) //���� �������� ������� �� ���� ����������;
	{
		int size = container.length;
		String [] new_container = new String[size+1];
		for (int i=0;i<size;i++) {
			new_container[i]=container[i];
		}
		new_container[size]=str;
		size++;
		container = new_container;
	}
 
	public void clear() //������� �� �������� � ����������;
	{
		for (int i = 0; i < container.length; i++) {
			container[i]=null;
			
		}
		size =0;
	}

	public boolean remove(String str) // ������� ������ ������� ��������� �������� � ����������;
	{
		 
		boolean flag = false;
		String [] new_container = new String[size-1]; 
		for(int i=0;i<size;i++) {
			if(container[i].equals(str))
				flag = true;
		}
		if(flag) {
			for(int i=0,j=0;i<size;i++) {
				if(container[i].equals(str))
					i++;
				new_container[j]=container[i];
				j++;
			}
			size--;
			container = new_container; 
			return flag;
		} 
		else
		{
			return flag;
		} 
	}

	public String[] toArray()  //������� �����, �� ������ �� �������� � ���������;
	{
		return container;	
	}
	
	public int size()  //������� ������� �������� � ���������;
	{
		return size;	
	}
	
	public boolean containsAll(Container cont) //������� true, ���� ��������� ������ �� �������� � ����������� � ����������;
	{
		int count = 0; 
		for (int i = 0; i < container.length; i++) {
			for (int j = 0; j < cont.container.length; j++) {
				if(cont.container[j].equals(container[i]))
					count++;
			}
		}
		if(count == cont.container.length)
			return true;
		else
			return false;
	}
	
	
	public boolean contains(String str) //������� true, ���� ��������� ������ �������� �������;
	{
		boolean flag = false;
		for (String string : container) {
			if(string.equals(str))
				flag=true;
		}
		return flag;
	}
	 
	public void Sort() {
		
		String temp;
		
		 for(int a = 0; a < size - 1; a++) {
	         for(int b = a + 1; b < container.length; b++)
	         {
	            if(container[a].compareTo(container[b]) > 0)
	            {
	               temp = container[a];
	               container[a] = container[b];
	               container[b] = temp;
	            }
	         }
	      }
	}
	
	public Container(String... str) {
		if(str.length!=0) {
			size = str.length;
			container = new String[size];
			for (int i=0;i<size;i++) {
				container[i]=str[i];
			}
		} 
	}
	
	
	
	public Iterator<String> getIterator() {
		return new My_iterator<String>();
	}
	
	public class My_iterator<String> implements Iterator {
		int index;
 
		@Override
		public boolean hasNext() {
			return index < size ? true : false;
		}
 
		@Override
		public Object next() {
			return container[index++];
		}
		
		/*Method that removes from the underlying collection the last element returned by this iterator*/
		@Override
		public void remove() {
			Container.this.remove(container[--index]);
		}
	} 
}

package ArrayList;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(6);
		ArrayList<String> obj1=new ArrayList();
		
		System.out.println(obj);
		

	}

}
/*
Object[] a=new Object[5];
	int ind1=0;
	public void myAdd(d data)
	{
		if(ind1==a.length)
		{
			grow();
		}
		a[ind1++]=data;
	}
	public void grow()
	{
		Object[] b=new Object[a.length*2];
		for(int i=0;i<ind1;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	public void set(int index,int num)
	{
		for(int i=0;i<ind1;i++)
		{
			if(i==index)
			{
				a[i]=num;
			}
		}
	}
	public Object get(int index)
	{
		for (int i = 0; i < ind1; i++)
		{
			if(i==index)
			{
				return a[index];
			}
		}
		return -1;
	}

	public int indexOf(d data)
	{
		for (int i = 0; i < ind1; i++)
		{
			if(a[i]==data)
			{
				return i;
			}
		}
		return -1;
	}

	public void remove(int index)
	{
		if(index<0||index>ind1)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		else
		{
			for(int i=index;i<ind1;i++)
			{
				a[i]=a[i+1];
			}
			ind1--;
		}
	}

	public int size() 
	{
		return ind1;
	}

	public void addAtIndex(int index, int num) {
		if(ind1>=a.length)
		{
			grow();
		}
		if (index < 0 || index > ind1) {
			System.out.println("out of range");
			System.exit(0);
		} else {
			for (int i = ind1; i >=index; i--) {
				a[i] = a[i - 1];

			}
			a[index] = num;
			ind1++;
		}
	}
	public boolean contains(d data)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==data)
			{
				return true;
			}
		}
		return false;
	}

	public int lastIndexOf(d data)
	{
		int cnt=0;
		for(int i=0;i<ind1;i++)
		{
			if(a[i]==data)
			{
				cnt=i;
			}
		}
		return cnt;
	}

	public boolean isEmpty()
	{
		if(ind1==0)
		{
			return true;
		}
		return false;
	}

	public int[] toArray()
	{
		int[] c=new int[ind1];
		for (int i = 0; i<ind1; i++)
		{
			c[i]=(int)a[i];
		}
		return c;

	}

	public Object clone()
	{
		ArrayListImpli<d> list1=new ArrayListImpli<d>();
		for(int i=0;i<ind1;i++)
		{
			list1.myAdd((d) a[i]);
		}
		return list1;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < ind1; i++) {
			if (i < ind1 - 1) {
				str = str + a[i] + ", ";
			} else {
				str = str + a[i] + "]";
			}
		}
		return str;
	}
 */

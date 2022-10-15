package LinkedList;

import java.util.LinkedList;

public class Linkedlist123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(40);
		System.out.println(obj);
		//System.out.println(obj.indexOf(400));

	}

}
/*

		linkedList obj=new linkedList();
		obj.myAdd(10);
		obj.myAdd(20);
		obj.myAdd(30);
		obj.myAdd(10);
		obj.myAdd(20);
		//obj.set(0,100);
		System.out.println(obj.size());

	}

}

class Node<T>
{
	T data;
	Node<T>next;
	Node(T data)
	{
		this.data=data;
	}
}
//@SuppressWarnings("unchecked")
class linkedList<T>
{
	Node<T> root;
	public void myAdd(T data)
	{
		Node<T> newobj=new Node<>(data);
		if(root==null)
		{
			root=newobj;
		}
		else
		{
			Node<T> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newobj;
		}
	}
	public String toString()
	{
		String str="[";
		Node<T> temp=root;
		while(temp!=null)
		{
			if(temp.next!=null)
			{
				str=str+temp.data+", ";
			}
			else
			{
				str=str+temp.data;
			}
			temp=temp.next;
		}
		str=str+"]";
		return str;
	}
	public void addAt(int ind,T data)
	{
		Node<T> newobj=new Node<T>(data);
		Node<T> temp=root;
		int cnt=0;
		//out of range
		if(ind<0)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		//add at zeroth index
		if(ind==0)
		{
			newobj.next=root;
			root=newobj;
			return;
		}
		else
		{
			while(temp.next!=null)
			{
				if(cnt==ind-1)
				{
					newobj.next=temp.next;
					temp.next=newobj;
					return;
				}
				cnt++;
				temp=temp.next;
			}

		}
		System.out.println("out of range");
		System.exit(0);

	}
	public void clear()
	{
		root=null;
	}
	public Object clone()
	{
		Node<T> temp=root;
		linkedList<T> list2=new linkedList<T>();
		while(temp!=null)
		{
			list2.myAdd(temp.data);
			temp=temp.next;
		}

		return list2;
	}
	public boolean contains(T data)
	{
		Node<T> temp=root;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public Object get(int index)
	{
		Node<T> temp=root;
		int cnt=0;
		if(index<0)
		{
			System.out.println("Out of bounds..");
			System.exit(0);
		}
		else
		{
			while(temp!=null)
			{
				if(cnt==index)
				{
					return temp.data;
				}
				cnt++;
				temp=temp.next;
			}
		}
		return "out of bounds..";
	}
	public int indexOf(T data)
	{
		Node<T> temp=root;
		int cnt=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return cnt;
			}
			cnt++;
			temp=temp.next;
		}
		return -1;
	}
	public boolean isEmpty()
	{
		if(root==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int lastIndexOf(T data)
	{
		Node<T> temp=root;
		int cnt=0;
		int num=-1;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				num=cnt;
			}
			cnt++;
			temp=temp.next;
		}
		if(num==-1)
		{
			return -1;
		}
		else
		{
			return num;
		}

	}
	public void remove(int ind)
	{
		Node<T> temp=root;
		int cnt=0;
		if(ind<0)
		{
			System.out.println("out of bound...");
			System.exit(0);
		}
		if(ind==0)
		{
			root=root.next;
			return;
		}
		else
		{
			while(temp!=null)
			{
				if(cnt==ind-1)
				{
					temp.next=temp.next.next;
					return;
				}
				cnt++;
				temp=temp.next;
			}
		}
		System.out.println("Out of bounds...");
		System.exit(0);

	}
	public void set(int ind,T data)
	{
		Node<T> temp=root;
		int cnt=0;
		if(ind<0)
		{
			System.out.println("Out of range");
			System.exit(0);
		}
		else
		{
			while(temp!=null)
			{
				if(cnt==ind)
				{
					temp.data=data;
				}
				cnt++;
				temp=temp.next;
			}
		}
	}
	public int size()
	{
		int cnt=0;
		Node<T> temp=root;
		while(temp!=null)
		{
			cnt++;
			temp=temp.next;
		}
		return cnt;
	}
	
 */

package LinkedList;
/*
 **add
1.add
2.toString
3.Addat(addfirst,addlast)
4.clear---
5.clone-
6.contains
7.getMethod
8.indexOf
9.isEmpty
10.lastindexOf
11.remove
12.setToString
13.size
14.addAndTo String
 */


public class Mylinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedll<Integer> obj=new Linkedll<>();
		obj.myAdd(10);
		obj.myAdd(20);
		obj.myAdd(30);
		obj.myAdd(40);
		obj.myAdd(50);
		System.out.println(obj);
		
		
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
class Linkedll<T>
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
		Node<T> temp=root;
		Node<T> newobj=new Node<T>(data);
		int cnt=0;
		if(ind<0)
		{
			System.out.println("Out of range");
			System.exit(0);
		}
		if(ind==0)
		{
			newobj.next=root;
			root=newobj;
			return;
		}
		else
		{
			while(temp!=null)
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
		System.out.println("Out of range");
		System.exit(0);
	}
	public void clear()
	{
		root=null;
	}
	public Object clone()
	{
		Node<T> temp=root;
		Linkedll<T> list2=new Linkedll<T>();
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
		int num=-1;
		int cnt=0;
		Node<T> temp=root;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				num=cnt;
			}
			cnt++;
			temp=temp.next;
		}
		return num;
	}
	public void remove(int ind)
	{
		Node<T> temp=root;
		int cnt=0;
		if(ind<0)
		{
			System.out.println("Out of range");
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
		System.out.println("Out of range");
		System.exit(0);
	}
	public void set(int ind,T data)
	{
		Node<T> temp=root;
		int cnt=0;
		if(ind<0)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		else
		{
			while(temp!=null)
			{
				if(cnt==ind)
				{
					temp.data=data;
					return;
				}
				cnt++;
				temp=temp.next;
			}
		}
		System.out.println("out of range");
		System.exit(0);
	}
	public int size()
	{
		Node<T> temp=root;
		int cnt=0;
		while(temp!=null)
		{
			cnt++;
			temp=temp.next;
		}
		return cnt;
	}
	
}

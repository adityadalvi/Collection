package HashMap;
/*
Hash Map - add
replace
remove
get	Load
isEmpty
containsKey
containsValue
size
 */
public class MyPractice 
{

	public static void main(String[] args) 
	{
		Hashmap123 obj=new Hashmap123();
		obj.add(1,"Aditya");
		obj.add(2,"Ravindra");
		obj.add(3,"Dalvi");
		obj.add(4,"Patne");
		obj.replace(11, "12345");
		System.out.println(obj);
	}

}
class Node<k,v>
{
	k key;
	v value;
	Node<k,v> next;
	Node(k key,v value)
	{
		this.key=key;
		this.value=value;
	}
}

class Hashmap123<k,v>
{
	@SuppressWarnings("rawtypes")
	Node<k,v>[] roots=new Node[16];
	@SuppressWarnings("unchecked")
	public void add(k key, v value)
	{
		int index=key.hashCode()%roots.length;
		Node<k,v> root=roots[index];
		Node<k,v> obj=new Node(key,value);
		if(root==null)
		{
			roots[index]=obj;
		}
		else
		{
			Node<k,v> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}


	}
	public void replace(k key, v value)
	{
		int  index=key.hashCode()%roots.length;
		Node<k,v> temp=(Node<k,v>)roots[index];
		while(temp!=null)
		{

			if(temp.key!=key)
			{
				temp.value=value;
			}
			/*if(temp==null)
			{
				System.out.println("null");
			}*/
			temp=temp.next;
		}

	}
	/*public void remove(k key)
	{
		int  index=key.hashCode()%roots.length;
		Node<k,v> temp=(Node<k,v>)roots[index];
		while(temp!=null)
		{

			if(temp.key!=key)
			{
				temp.value=value;
			}
			temp=temp.next;
		}
		
	}*/
	@SuppressWarnings("unchecked")
	public String toString()
	{
		String str="{";
		for (int i = 0; i < roots.length; i++)
		{
			if(roots[i]!=null)
			{
				Node<k,v> temp=(Node<k,v>)roots[i];
				while(temp!=null)
				{
					str=str+temp.key+" "+temp.value+", ";
					temp=temp.next;
				}
			}
		}
		str=str.substring(0,str.length()-2);
		str=str+"}";
		return str;
	}


}

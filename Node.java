package LinkedHashMap;

public class Node<d1,d2>
{
	d1 key;
	d2 value;
	Node<d1,d2> rednext;
	Node<d1,d2> bluenext;
	public Node(d1 key, d2 value)
	{
		this.key=key;
		this.value=value;
	}
}

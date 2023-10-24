package org.collection3;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Collection3_1 
{
	int x,y;
	
	Collection3_1() 
	{
		x=10;
		y=20;
	}
	
	public static void main(String[] args)
	{
		
	int n=5;
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	
	for(int i=1;i<=n;i++)
	{
		arr1.add(i);
	}
System.out.println(arr1);

System.out.println("Add All Method...");
ArrayList<String> s1=new ArrayList<String>();
s1.add("Apple");
s1.add("Orange");
s1.add("Cat");
s1.add("Dog");

for(String x:s1)
{
	System.out.println(x);
}


ArrayList<String> s2=new ArrayList<String>();

s2.add("Elephant");
s2.add("Format");

for(String y:s2)
{
	System.out.println(y);
}


s1.addAll(s2);

System.out.println(s1);
System.out.println();
System.out.println("Get of method...");
String gt=s1.get(1);
System.out.println("Index1 of the element is :"+gt);


ArrayList<Integer> i1=new ArrayList<Integer>();

i1.add(11);
i1.add(12);
i1.add(13);
i1.add(14);
i1.add(15);

System.out.println("Index of method...");

System.out.println("Element 15 index is :"+i1.indexOf(15));
System.out.println();
System.out.println("Size of method...");
System.out.println(i1.size());
System.out.println();
System.out.println("Before clear method...");
System.out.println(i1);

System.out.println("After clear method...");
i1.clear();
System.out.println(i1);
System.out.println();
System.out.println("Before clone of method...");
Collection3_1 c31=new Collection3_1();
System.out.println(c31.x+" "+c31.y);
System.out.println("After clone of method...");
Collection3_1 c32=c31;
c31.x=100;
System.out.println(c31.x+" "+c31.y);
System.out.println();
System.out.println("Contains of method...");
ArrayList<String> arr4=new ArrayList<String>();
arr4.add("Kala");
arr4.add("Ramya");
arr4.add("Roja");

boolean b1=arr4.contains("Kala");

if(b1)
{
	System.out.println("kala is present");
}

else
{
	System.out.println("kala is absent");
}

 b1=arr4.contains("Raju");

if(b1)
{
	System.out.println("raju is present");
}

else
{
	System.out.println("raju is absent");
}

System.out.println();
ArrayList<String> arr5=new ArrayList<String>();

arr5.add("number1");
arr5.add("number2");
arr5.add("number3");
arr5.add("number4");



System.out.println("Before empty of method");
boolean b3=arr5.isEmpty();

if(b3)
{
	System.out.println("Its empty");
}

else
{
	System.out.println("Its not empty");
}

arr5.clear();//clear of method for isempty element
System.out.println("After empty of method");
b3=arr5.isEmpty();

if(b3)
{
	System.out.println("Its empty");
}
else
{
	System.out.println("Its not empty");
}
System.out.println();
System.out.println("last index of method..");
ArrayList<Integer> arr6=new ArrayList<Integer>();
arr6.add(100);
arr6.add(200);
arr6.add(300);
arr6.add(400);
arr6.add(500);

int lsi=arr6.lastIndexOf(400);
System.out.println("last element index is :"+lsi);

System.out.println();
System.out.println("remove of method..");
List<String> rm1=new ArrayList<String>();
rm1.add("gt1");
rm1.add("gt2");
rm1.add("gt3");


System.out.println(rm1.remove("gt2"));
System.out.println(rm1);

System.out.println();
System.out.println("remove all method..");
ArrayList<Integer> arr7=new ArrayList<Integer>();
arr7.add(100);
arr7.add(200);
arr7.add(300);
arr7.add(400);
arr7.add(500);


ArrayList<Integer> arr8=new ArrayList<Integer>();
arr8.add(100);
arr8.add(200);
arr8.add(300);

arr7.removeAll(arr8);
System.out.println("remove all method is :"+arr7);

System.out.println();
System.out.println("vector class...");
System.out.println("add method");
Vector<Integer> v1=new Vector<Integer>(4);
v1.add(1000);
v1.add(2000);
v1.add(3000);
v1.add(4000);

System.out.println(v1);

Vector<Integer> v2=new Vector<Integer>(4);
v2.add(100);
v2.add(200);
v2.add(300);
v2.add(400);

System.out.println(v2);

System.out.println();
System.out.println("Add all method in vector...");
v1.addAll(v2);
System.out.println(v1);

System.out.println();
System.out.println("vector get of method...");
System.out.println("Index1 of  element is :"+v2.get(0));

System.out.println();
System.out.println("vector size of method...");
System.out.println("Size  in vector1 class is:"+v2.size());


System.out.println();
System.out.println("vector contains of method...");
boolean bool5=v2.contains(200);

if(bool5)
{
	System.out.println("vector element 200 is present");
}

else
{

	System.out.println("vector element 200 is absent");
	
}

bool5=v2.contains(600);

if(bool5)
{
	System.out.println("vector element 600 is present");
}

else
{

	System.out.println("vector element 600 is absent");
	
}

System.out.println();
System.out.println("vector isempty of method...");

boolean bool6=v2.isEmpty();

if(bool6)
{
	System.out.println("vector is empty");
}
else
{
	System.out.println("vector is not empty");
}

v2.clear();
System.out.println(v2);

bool6=v2.isEmpty();

if(bool6)
{
	System.out.println("vector is empty");
}
else
{
	System.out.println("vector is not empty");
}

Vector<Integer> v3=new Vector<Integer>(3);
v3.add(500);
v3.add(1000);
v3.add(1500);

System.out.println();
System.out.println("Index of method...");

System.out.println(v3.indexOf(1000));

System.out.println();
System.out.println("Last index of method...");

System.out.println(v3.lastIndexOf(1500));

System.out.println();
System.out.println("Equals of method...");

Vector<Integer> v4=new Vector<Integer>(3);
v4.add(500);
v4.add(1000);
v4.add(1500);

boolean eq=v3.equals(v4);

if(eq)
{
	System.out.println("both are equal");
}

else
{
	System.out.println("both are not equal");
}

System.out.println();
System.out.println("Iterator method in vector...");
Vector<String> v5=new Vector<String>();
v5.add("cricket");
v5.add("football");
v5.add("volleyball");

Iterator it=v5.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
}

System.out.println();
System.out.println("Linkedlist...");

System.out.println("add method in linkedlist class without any declaration..");
LinkedList l1=new LinkedList();
l1.add("kathir");
l1.add("ravi");
l1.add("suresh");

System.out.println(l1);
System.out.println("add method in linkedlist class...");

LinkedList<String> l2=new LinkedList<String>();
l2.add("jackie");
l2.add("brucelee");
l2.add("jetlee");
l2.add(0,"IPman");
System.out.println(l2);

System.out.println();
System.out.println("replace method in linkedlist class...");

LinkedList<Integer> l3=new LinkedList<Integer>();
l3.add(1);
l3.add(2);
l3.add(3);

l3.set(1,-2);
System.out.println(l3);

System.out.println();
System.out.println("remove method in linkedlist");
LinkedList<Integer> l4=new LinkedList<Integer>();
l4.add(110);
l4.add(111);
l4.add(112);



System.out.println(l4);

System.out.println();
l4.remove();
System.out.println("by default head of element is removed :"+l4);
System.out.println();
System.out.println("remove element using index in linkedlist...");
l4.remove(0);
System.out.println(l4);
System.out.println();
System.out.println("adding one more element..");
l4.add(113);
System.out.println(l4);

System.out.println();
System.out.println("total size of linked list elements..");
LinkedList<String> l5=new LinkedList<String>();
l5.add("suvapna");
l5.add("ilagiya");
l5.add("thamarai");
int sz=l5.size();
System.out.println(sz);

System.out.println();
System.out.println("linked list get of method...");
System.out.println(l5.get(1));

System.out.println();
System.out.println("linked list addfirst method ...");

LinkedList<String> l6=new LinkedList<String>();
l6.add("right");
l6.add("straight");
l6.add("left");

l6.addFirst("ball");
l6.addFirst("apple");
System.out.println(l6);

System.out.println();
System.out.println("linked list addlast method ...");

l6.addLast("revathi");
l6.addLast("guna");
System.out.println(l6);

System.out.println();
System.out.println("linked list index of method ...");

System.out.println("ball index is :"+l6.indexOf("ball"));

System.out.println();
System.out.println("linked list lastindex of method ...");
System.out.println("ball index is :"+l6.lastIndexOf("revathi"));

System.out.println();
System.out.println("iterator with start from specific index in elements..");
ListIterator li=l6.listIterator(1);

while(li.hasNext())
{
	System.out.println(li.next());
}

System.out.println();
System.out.println("Descending iterator in linkedlist..");
LinkedList<String> li2=new LinkedList<String>();
li2.add("abc");
li2.add("cde");
li2.add("efg");

Iterator it12 =li2.descendingIterator();

while(it12.hasNext())
{
	System.out.println(it12.next());
}

System.out.println();
System.out.println("get first of method in linkedlist..");

System.out.println(li2.getFirst());

System.out.println();
System.out.println("get last of method in linkedlist..");

System.out.println(li2.getLast());

System.out.println();
System.out.println("contains of method in linkedlist..");
System.out.println(li2.contains("cde"));
System.out.println(li2.contains("ghi"));

System.out.println();
System.out.println("offer,offerfirst,offerlast method in linkedlist..");
li2.offer("swetha");
li2.offerFirst("revi");
li2.offerLast("reddy");
System.out.println(li2);

System.out.println();
System.out.println("peak,peakfirst,peaklast method in linkedlist..");
System.out.println(li2.peek());
System.out.println(li2.peekFirst());
System.out.println(li2.peekLast());

System.out.println();
System.out.println("poll,pollfirst,polllast method in linkedlist..");
System.out.println(li2.poll()+" "+li2.pollFirst()+" "+li2.pollLast());

System.out.println();
System.out.println("push and pop method in linkedlist..");

li2.push("ramya");
System.out.println(li2);

li2.pop();
System.out.println(li2);

System.out.println();
System.out.println("HashMap Collection...");
System.out.println("for loop iterator...");

HashMap<Integer,String> map1=new HashMap<Integer,String>();
map1.put(1,"Array1");
map1.put(2,"Array2");
map1.put(3,"Array3");
map1.put(4,"Array4");
map1.put(1,"Array0");
for(Map.Entry m:map1.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}
System.out.println();
System.out.println("Hashmap size of method...");
System.out.println(map1.size());

boolean boc1=map1.containsKey(2);
boolean boc2=map1.containsValue("Array2");
if(boc1 ||boc2)
{
	System.out.println("hashmap is true");
}

else
{
	System.out.println("hashmap is false");
}

boc1=map1.containsKey(4);
boc2=map1.containsValue("Array5");

if(boc1&&boc2)
{
	System.out.println("hashmap is true");
}
else
{
	System.out.println("hashmap is false");
}

map1.clear();

boolean boc3=map1.isEmpty();

if(boc3)
{
	System.out.println("hashmap is empty");
}

else
{
	System.out.println("hashmap is not empty");
}


HashMap<Integer,String> map2=new HashMap<Integer,String>();
map2.put(10,"apple");
map2.put(20,"ball");
map2.put(30,"carbage");

System.out.println(map2.get(10));
map2.remove(10);
System.out.println(map2);
	

HashMap<Integer,String> hm1=new HashMap<Integer,String>();
HashMap<Integer,String> hm2=new HashMap<Integer,String>();


hm1.put(1, "one");
hm1.put(2, "two");
hm1.put(3, "three");
	
	
hm2.put(4, "four");
hm2.put(5, "five");
hm2.put(6, "six");

System.out.println("Mapping of Hashmap hm1 are :"+hm1);
System.out.println("Mapping of Hashmap hm2 are :"+hm2);

	

HashMap<Integer,String> hm3=new HashMap<Integer,String>();

System.out.println();
System.out.println("hashmap copy from map into another hashmap");
	
hm3.put(400, "four hundred");
hm3.put(500, "five hundred");
hm3.put(600, "six hundred");

HashMap<Integer,String> hm4=new HashMap<Integer,String>(hm3);

System.out.println(hm3);
System.out.println("copy of hashmap3 into hashmap4 :"+hm4);

System.out.println();
System.out.println("hashmap clone of method");

HashMap<Integer,String> hm5=new HashMap<Integer,String>();
hm5.put(100, "hundred");
hm5.put(200, "two hundred");
hm5.put(300, "three hundred");

System.out.println("Hashmap hm5 are :"+hm5);
System.out.println("Hashmap hm5 are :"+hm5.clone());

System.out.println();
System.out.println("hashmap containskey of method");

System.out.println(hm5.containsKey(200));

System.out.println();
System.out.println("hashmap containsvalue of method");

System.out.println(hm5.containsValue("six hundred"));
System.out.println(hm5.containsValue("two hundred"));

System.out.println();
System.out.println("hashmap entry set of method...");
System.out.println(hm5.entrySet());

System.out.println();
System.out.println("hashmap equals of method...");

System.out.println(hm4.equals(hm5));

System.out.println();
System.out.println("hashmap for loop iterator of method...");

HashMap<Integer,String> hm6=new HashMap<Integer,String>();
hm6.put(1, "rat1");
hm6.put(2, "rat2");
hm6.put(3, "rat3");
	
for(Map.Entry<Integer, String> m3:hm6.entrySet())
{
	System.out.println(m3.getKey()+" "+m3.getValue());
}

System.out.println();
System.out.println("hashmap for-each of method...");

HashMap<Integer,String> hm7=new HashMap<Integer,String>();
hm7.put(4, "rat4");
hm7.put(5, "rat5");
hm7.put(6, "rat6");

hm7.forEach((Integer,String)->System.out.println(Integer+" "+String));
System.out.println();
System.out.println("hashmap while loop iterator of method...");

Map<Integer,String> hm8=new HashMap<Integer,String>();
hm8.put(7, "rat7");
hm8.put(8, "rat8");
hm8.put(9, "rat9");


Iterator<Entry<Integer,String>> it2=hm8.entrySet().iterator();

while(it2.hasNext())
{
	Map.Entry<Integer,String> map34=(Map.Entry<Integer, String>)it2.next();
	System.out.println(map34.getKey()+" "+map34.getValue());
}
	
System.out.println();
System.out.println("hashtable for loop iterator of method...");

Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();
ht1.put(1,"Rekha");
ht1.put(2,"Revi");
ht1.put(3,"Revathi");
ht1.put(4,"Renuka");

for(Map.Entry<Integer, String> htab1:ht1.entrySet())
{
	System.out.println(htab1.getKey()+" "+htab1.getValue());
}

Hashtable<Integer,String> ht2=new Hashtable<Integer,String>();
ht2.put(5,"Ragu");
ht2.put(6,"Raam");
ht2.put(7,"Ramya");
ht2.put(8,"Raja");

System.out.println();
System.out.println("hashmap for-each loop iterator of method...");

ht2.forEach((Integer,String)->System.out.println(Integer+" "+String));

System.out.println();
System.out.println("hashmap while loop iterator of method...");

Set<Entry<Integer,String>> st1=ht2.entrySet();
Iterator<Entry<Integer,String>> itr1=st1.iterator();

while(itr1.hasNext())
{
	Map.Entry<Integer,String> map3=(Map.Entry<Integer, String>)itr1.next();
	System.out.println(map3.getKey()+" "+map3.getValue());
}
System.out.println();
System.out.println("Always hashset is not provide constant value or integer");
HashSet<String> hs1=new HashSet<String>();
hs1.add("number1");
hs1.add("number2");
hs1.add("number3");
hs1.add("number4");
System.out.println(hs1);
System.out.println();
System.out.println("hashset contains of method...");
System.out.println(hs1.contains("number3"));
System.out.println(hs1.contains("number5"));
System.out.println();
System.out.println("hashset isEmpty of method...");
System.out.println(hs1.isEmpty());
System.out.println();
System.out.println("hashset iterator of method...");

Iterator itr22=hs1.iterator();

while(itr22.hasNext())
{
	System.out.println(itr22.next());
}

System.out.println();
System.out.println("treeset isEmpty of method...");

TreeSet<String> ts1=new TreeSet<String>();
ts1.add("ready");
ts1.add("steady");
ts1.add("go");

System.out.println(ts1);

TreeSet<String> ts2=new TreeSet<String>();
ts2.add("ready2");
ts2.add("steady2");
ts2.add("go2");


System.out.println();
System.out.println("treeset add-all of method...");

ts1.addAll(ts2);
System.out.println(ts1);

System.out.println();
System.out.println("treeset clone of method...");

TreeSet<String> ts3=new TreeSet<String>();

ts3.add("deva");
ts3.add("ramana");
ts3.add("arjun");

System.out.println(ts3);

System.out.println(ts3.clone());

TreeSet<Integer> ts4=new TreeSet<Integer>();
ts4.add(1000);
ts4.add(2000);
ts4.add(3000);
Iterator<Integer> in1=ts4.descendingIterator();

while(in1.hasNext())
{
	System.out.println(in1.next());
}

	}

	
}

package Data_Structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Learn_List {

	public static void main(String[] args) {
		
		
		
//		ArrayList <Object> a = new ArrayList <Object> ();
//		
//		a.add("Java");
//		a.add('A');
//		a.add(25);
//		a.add(23.5f);
//		a.add(true);
//		a.add('A');
//		
//		System.out.println(a);
//		System.out.println(a.contains(255));
//		ArrayList <Object> a1 = (ArrayList<Object>) a.clone();
//		System.out.println(a1);
//		a1.add("Praveen");
//		System.out.println(a1);
//		System.out.println(a.equals(a1));
//		System.out.println(a.remove(4));
//		System.out.println(a);
//		System.out.println(a.get(2));
//		System.out.println(a.indexOf('A'));
//		System.out.println(a1.getFirst());
//		System.out.println(a1.getLast());
//		System.out.println(a1.isEmpty());
//		System.out.println(a1.removeAll(a));
//		System.out.println(a1);
//		
//		System.out.println(a1.addAll(a));
//		System.out.println(a1);
//		
//		System.out.println(a1.set(4, "Abinaya"));
//		System.out.println(a1);
//		
//		System.out.println(a1.size());
//		System.out.println(a1.reversed());
////		a1.clear();
////		System.out.println(a1);
//		
//		Object ar[] = a1.toArray();
//		for(Object v:ar) {
//			System.out.println(v);
//		}
//		
//		System.out.println("********************");
//		
//		Iterator i = a1.iterator();
//		
////		System.out.println(i.next());
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
//		LinkedList<Object> l = new LinkedList<Object>();
//		l.add("Java");
//		l.add('A');
//		l.add(25);
//		l.add(23.5f);
//		l.add(true);
//		l.add('A');
//		l.add("Python");
//		
//		System.out.println(l);
//		System.out.println(l.element());
//		System.out.println(l.peek());
//		System.out.println(l);
//		System.out.println(l.peekFirst());
//		System.out.println(l.peekLast());
//		System.out.println(l);
//		System.out.println(l.poll());
//		System.out.println(l);
//		System.out.println(l.pollFirst());
//		System.out.println(l.pollLast());
//		System.out.println(l);
//		
//		System.out.println(l.pop());
//		System.out.println(l.offer(l));
//		
//		 
//		Spliterator s = l.spliterator();
//		
//		s.forEachRemaining(q->System.out.println(q));
		
		
		
//		Hash-Set
//		HashSet <Object> h = new HashSet <Object>();
//		
//		h.add("Praveen");
//		h.add("Kumar");
//		h.add(34);
//		h.add(55.8);
//		h.add(34);
//		h.add("Kumar");
//		System.out.println(h);
//		
//		System.out.println(h.remove(55.8));
//		
//		System.out.println(h.hashCode());
//		
//		Object ar1[] = h.toArray();
//		for(Object v: ar1) {
//			System.out.println(v);
//		}
//		
//		String ss = h.toString();
		
		
		
//		TreeSet <Object> t = new TreeSet <Object>();	
//		t.add('A');
//		t.add('a');
//		t.add('!');
//		t.add('4');
//		t.add('Z');
//		t.add('~');
//		t.add('a');
//		System.out.println(t);
//		System.out.println(t.lower('A'));
//		System.out.println(t.higher('A'));
		
		
		
		
//		HashMap
		
//		HashMap <Object,Object> m = new HashMap <Object,Object>();
//		
//		m.put("Name","Pradeepan");
//		m.put("Age", 25);
//		m.put('B', true);
//		m.put(1, 100);
//		m.put(null,"Subash");
//		
//		System.out.println(m);
//		
//		System.out.println(m.get(null));
//		
//		System.out.println(m.keySet());
//		System.out.println(m.values());
//		System.out.println(m.get("Age"));
//		
//		System.out.println(m.replace('B', true, false));
//		System.out.println(m);
//		
//		System.out.println(m.remove(1));
//		System.out.println(m);
//		
//		System.out.println(m.size());
//		
		
		
//		TreeMap <Object,Object> tm = new TreeMap <Object,Object>();
//		tm.put('A', "Apple");
//		tm.put('Z', "Zipper");
//		tm.put('1', 1000);
//		tm.put('!', null);
//		tm.put('b', "bat");
//		tm.put('^', "Live");
//		
//		System.out.println(tm);
//		System.out.println(tm.pollFirstEntry());
//		System.out.println(tm);
//		
//		System.out.println(tm.lowerEntry('b'));
//		System.out.println(tm);
//		
//		System.out.println(tm.ceilingKey('Z'));
//		System.out.println(tm.firstKey());
//		System.out.println(tm.higherKey('A'));
//		System.out.println(tm.lowerKey('A'));
//		System.out.println(tm.lastKey());
		
		
		
//		Queue
//		PriorityQueue <Object> q = new PriorityQueue <Object>();
//		q.add("Subash");
//		q.add("Ragul");
//		q.add("Pradeepan");
//		q.add("Devadharshini");
//		q.add("Java");
//		q.add("Springboot");
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q);
//		System.out.println(q.add("Praveen"));
//		System.out.println(q);
		
		
		
		Stack<Object> t = new Stack<Object>();
		
		t.add("Subash");
		t.add("Ragul");
		t.add("Pradeepan");
		t.add("Devadharshini");
		t.add("Java");
		t.add("Springboot");
		
		System.out.println(t);
		
		System.out.println(t.pop());
		System.out.println(t);
		System.out.println(t.push("React.Js"));
		System.out.println(t);
		System.out.println(t.pop());
		System.out.println(t.pop());
		System.out.println(t.pop());
		System.out.println(t);
		
	}

}

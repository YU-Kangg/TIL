import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

public class Stack1<E> {
	private List<E> list = new ArrayList<>();

	public Stack1() {
		list = new ArrayList<>();
	}

	public void push(E a) {
		list.add(a);
	}

	public E pop() {
		E last = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return last;
	}

	public E peek() {
		return list.get(list.size() - 1);
	}
}

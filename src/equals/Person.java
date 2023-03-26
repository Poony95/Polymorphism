package equals;

import java.util.Objects;

// 객체 참조변수의 == 은 같은 메모리를 참조하고 있는지 평가합니다.
// 그래서 같은 메모리를 참조하고 있는 지 판별하려면 object의 equals를 오버라이딩 합니다.

public class Person {
	String name;
	int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}

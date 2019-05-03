package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.naming.NameNotFoundException;

public class Stream1 {

	public static void main(String[] args) {
		
		getAllLikeOneString();
	}
	public static enum UserDays{
		MONDAY,
		tuesday,
		wednesday,
		thurdsay,
		friday
	}
	//user embeded class
	static class User{
		String name;
		String subname;
		Integer number;
		User(String name, String subname, Integer number){
			this.name = name;
			this.subname = subname;
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubname() {
			return subname;
		}
		public void setSubname(String subname) {
			this.subname = subname;
		}
		public Integer getNumber() {
			return number;
		}
		public void setNumber(Integer number) {
			this.number = number;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", subname=" + subname + ", number=" + number + "]";
		}
		
		
	}//user end
	//person
	static class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	}

	
static List<User> listOfUsers() {
	List<User> list = Arrays.asList(
	new User("nikola", "misic", 1),
	new User("misa", "stan", 2),
	new User("milan", "stanojevic", 3),
	new User("aca", "usic", 4));
	
	return list;
}

static List<Person> listOfPerson() {
	return  Arrays.asList(
	        new Person("Max", 18),
	        new Person("Peter", 23),
	        new Person("Pamela", 23),
	        new Person("David", 12));
}

public static List<User> filterUsersWithId(int id, String name) {
	return  listOfUsers()
			.stream()
			.filter(f -> f.getNumber() == id)
			.filter(f -> f.getName() == name)
			.collect(Collectors.toList());
}

public static List<String> filterUsersWithIdReturnName(int id) {
	
	Integer num = Integer.valueOf(id);
	
	List<String> list = listOfUsers()
			.stream()
			.filter(f -> f.getNumber() == num)
			.map(f -> f.getName().toUpperCase())
			.collect(Collectors.toList());
	
	list.forEach(p -> System.out.println(p));
	
	return list;
}

public static void nameF() {
	List<User> filtered =
		    listOfUsers()
		        .stream()
		        .filter(p -> p.name.startsWith("n"))
		        .collect(Collectors.toList());

		System.out.println(filtered);    // [Peter, Pamela]
}

static List<String> filterBySubname() {
	return listOfUsers().stream()
			.map(m -> m.getSubname().toUpperCase())
			.collect(Collectors.toList());
}

static void listOfPersonsWithAgeOnBigging(){
	Map<Integer, List<Person>> list = listOfPerson()
			.stream()
			.collect(Collectors.groupingBy(p -> p.age));
	
	list.forEach((age, p) -> 
	System.out.format("age %s: person %s\n",age,p));
}

static String getAllLikeOneString() {
	String str = listOfPerson()
			.stream()
			.filter(s -> s.age > 18)
			.map(p -> p.name)
			.collect(Collectors.joining("---","-----","---"));
	System.out.println(str);
	return str;
}

static void convertintListToMap() {
	Map<Integer, String> map = listOfPerson()
		    .stream()
		    .collect(Collectors.toMap(
		        p -> p.age,
		        p -> p.name,
		        (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
}


}
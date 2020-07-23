package comparablesandcomparators;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		List<Students> students = new ArrayList<>();
		students.add(new Students(23, "Harry"));
		students.add(new Students(41, "Liam"));
		students.add(new Students(25, "Niall"));
		students.add(new Students(63, "Zyan"));
		students.add(new Students(85, "Louis"));
		
		Collections.sort(students , new SortByNameThenMarks());
		
		students.forEach(System.out::println);

		
	}

}

class SortByNameThenMarks implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;
		} else {
			return o1.name.compareTo(o2.name);
		}
	}
	
}
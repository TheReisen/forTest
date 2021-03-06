package Assignment_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> students;

	public MapTest() {
		this.students = new HashMap<String, Student>();
	}

	public void inputST() {
		Scanner console = new Scanner(System.in);
		int i = 0;

		System.out.println("请输入学生人数：");
		int number = console.nextInt();

		while (i < number) {
			System.out.println("请输入学生ID：");
			String ID = console.next();

			Student st = students.get(ID);
			if (st == null) {

				System.out.println("请输入学生姓名：");
				String name = console.next();

				Student newStudent = new Student(ID, name);

				students.put(ID, newStudent);
				System.out.println("成功添加学生：" + students.get(ID).name);
				i++;
			} else {
				System.out.println("该学生ID已被占用");
				continue;
			}
		}
	}


	public void totalST() {

		Set<String> keySet = students.keySet();

		System.out.println("总共有:" + students.size() + "个学生DA⭐ZE");

		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if (st != null)
				System.out.println("学生：" + st.name);
		}
	}


	public void removeST() {

		Scanner console = new Scanner(System.in);
		while (true) {

			System.out.println("请输入要删除的学生ID");
			String ID = console.next();

			Student st = students.get(ID);
			if (st == null) {

				System.out.println("该ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生：" + st.name);
			break;
		}
	}

	public void modifyST() {

		System.out.println("请输入要修改的学生ID：");

		Scanner console = new Scanner(System.in);
		while (true) {

			String stuID = console.next();

			Student student = students.get(stuID);
			if (student == null) {
				System.out.println("该ID不存在,请重新输入");
				continue;
			}

			System.out.println("当前该学生ID，所对应的学生为：" + student.name);

			System.out.println("请输入新的学生姓名：");
			String name = console.next();
			Student newStudent = new Student(stuID, name);
			students.put(stuID, newStudent);
			System.out.println("修改成功DA⭐ZE");
			break;
		}
	}
}

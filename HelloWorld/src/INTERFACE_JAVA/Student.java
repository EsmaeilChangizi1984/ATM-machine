package INTERFACE_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Student implements Records {

	private String name;
	private int studentId;
	private boolean graduate;

	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.graduate = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

    @Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", graduate=" + graduate + "]";
	}

	// @Override
	public List<String> addRecords() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, " " + this.studentId);
		values.add(2, " " + this.graduate);
		return values;
	}

	// @Override
	public void retrievRecords(List<String> values) {

		if (values!= null && values.size() > 0) {
			this.name = values.get(0);
			this.studentId = Integer.parseInt(values.get(1));
			this.graduate = Boolean.parseBoolean(values.get(2));

		}

	}

}

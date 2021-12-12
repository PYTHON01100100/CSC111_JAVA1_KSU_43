import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class course {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	Random r=new Random();
	private int hrs;
	private String coursename;
	private student st[];
	//no of student
	private int nbs;
	//
	public course() {
		coursename="NA";
		hrs=1;
		st=new student[30];
		nbs=0;
	}
	public course(String coursename,int hrs, int size) {
		this.coursename=coursename;
		this.hrs=hrs;
		st=new student[size];
		nbs=0;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getNbs() {
		return nbs;
	}
	public student getStudent(int index) {
		if(index>=0&& index <nbs)
		return st[index]; 
		else
			return null;
	}
	public int searchId(int id) {
		//do not say st.length it cuses run time error
		/*
		 		for(int i =0;i<st.length ;i++) {
			if(st[i].getId()==id)
				return i;
		} 
		 
		 */
		
		for(int i =0;i<nbs;i++) {
			if(st[i].getId()==id)
				return i;
		}
		//it does not exsist
		return -1;
	}

public int searchName(String name) {
	//do not say == it cuses compile error
	/*
	 		for(int i =0;i<st.length ;i++) {
		if(st[i].getName()==name)
			return i;
	} 
	 
	 */
	
	for(int i =0;i<nbs;i++) {
		if(st[i].getName().equalsIgnoreCase(name))
			return i;
	}
	//it does not exsist
	return -1;
}

public student searchStudent(int id) {
	//do not say st.length it cuses run time error
	/*
	 		for(int i =0;i<st.length ;i++) {
		if(st[i].getId()==id)
			return i;
	} 
	 
	 */
	
	for(int i =0;i<nbs;i++) {
		if(st[i].getId()==id)
			return st[i];
	}
	//it does not exsist
	//return -1;
	return null;
}
public boolean add(student s) {
	if(nbs<st.length) {
	st[nbs]=s;
	nbs++;
	return true;
	}
	else return false;
	
}
public void printArray() {
	System.out.println("COURSE NAME: "+coursename);
	System.out.println("COURSE HOURS: "+hrs);
	System.out.println("LIST OF STUDENTS:\n---------------------------------------------------------------------------------------------------------------- ");
	for(int i=0;i<nbs;i++) {
		st[i].print();
	}

		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
}
 
public boolean adduni(student s) {
	if(nbs<st.length) {
		int index = searchId(s.getId());
		if(index==-1){//not found go ahed and add this studnet
			st[nbs]=s;
	nbs++;
	return true;
}
		else 
			return false;
		}
	else return false;
	
}
public void printArrayToString() {
	System.out.println("COURSE NAME: "+coursename);
	System.out.println("COURSE HOURS: "+hrs);
	System.out.println("LIST OF STUDENTS:\n---------------------------------------------------------------------------------------------------------------- ");
	for(int i=0;i<nbs;i++) {
		System.out.println(st[i]);
	}

		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
}
public boolean delete(int id) {
	int index = searchId(id);
	// id not found
	if(index==-1)
		return false;
	else {
		st[index]=st[nbs-1];
	nbs--;
	return true; 
	}
}





















}
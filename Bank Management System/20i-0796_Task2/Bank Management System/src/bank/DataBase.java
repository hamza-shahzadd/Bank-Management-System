package bank;
import java.sql.*;
public class DataBase {
	public DataBase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataBase(int rollNumber, String name, String section, String batch) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.section = section;
		this.batch = batch;
	}
	private int rollNumber;
	private String name;
	private String section;
	private String batch;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}



	public void write()
	{
		try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
            System.out.println("Connected With the database successfully");
            Statement stmt=con.createStatement();
            stmt.execute("insert into student_info values(" + rollNumber + ",'" + name + "','" + section + "','" + batch + "')");
            con.close();
            }catch(Exception e){ 
                System.out.println(e);
            }
	}
	
	public void read()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student_info");
        while(rs.next())
            System.out.println("Roll-No: " + rs.getInt(1)+" - Name: "+rs.getString(2)+" - Section: "+rs.getString(3) + " - Batch: " + rs.getString(4)); 
        con.close();
    }
	catch(Exception e)
    { 
        System.out.println(e);
    }
	}
}
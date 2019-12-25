package com.dataobjects;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;



public class EmployeeDAO {
    private Connection con; 
	Employee e=null;
/*
    static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e){
			System.out.println("Driver class is not found");
		}
	}*/
	
	public EmployeeDAO()throws SQLException{
		con=DriverManager.getConnection("jdbc:oracle:thin:@Oracle02:1521:Xe","Test1","Test1");
		Statement st=con.createStatement();
		if(!st.execute("create table JDBCEMP(eid NUMBER(4) primary key,ename VARCHAR2(50),esalary NUMBER(8,2),erole VARCHAR2(10),sques VARCHER2(80),sans VARCHAR2(80),password VARCHAR2(50)")){
			System.out.println("Table is created");
		}
	}
	
	public Employee getEmployee(int eid)throws SQLException{
		PreparedStatement ps=con.prepareStatement("select * from JDBCEMP where eid=?");
		ps.setInt(1,eid);
		ResultSet table=ps.executeQuery();
		if(table.next()){
			e=new Employee();
			e.setEid(table.getInt(1));
			e.setEname(table.getString("ename"));
			e.setSalary(table.getDouble(3));
			e.setErole(table.getString("erole"));
			e.setSques(table.getString("sques"));
			e.setSans(table.getString("sans"));
			e.setPassword(table.getString("password"));
			
		}
		return e;
	}
	public int addEmployee(Employee e) throws SQLException
	{
		int flag;
		PreparedStatement ps1=con.prepareStatement("insert into JDBCEMP values(?,?,?)");
		ps1.setInt(1,e.getEid());
		ps1.setString(2,e.getEname());
		ps1.setDouble(3,e.getSalary());
		ps1.setString(5, e.getSques());
		ps1.setString(6,e.getSans());
		ps1.setString(4,e.getErole());
		ps1.setString(7,e.getPassword());
		
		flag=ps1.executeUpdate();
		return flag;
	}
	
	
	public int updateEmployee(int eid,double salary) throws SQLException
	
	{
		int update;
		PreparedStatement ps2=con.prepareStatement("update JDBCEMP set esalary=? where eid=?");
		ps2.setDouble(1,salary);
		ps2.setInt(2,eid);
		update=ps2.executeUpdate();
		return update;
	}
	
	public int deleteEmployee(int eid) throws SQLException{
		
		int delete;
		PreparedStatement ps3=con.prepareStatement("delete from JDBCEMP where eid=?");
		ps3.setInt(1,eid);
		delete=ps3.executeUpdate();
		return delete;
		
	}
	public Set<Employee> selectEmployee()throws SQLException{
		Statement ps4=con.createStatement();
		ResultSet rs1=ps4.executeQuery("select * from JDBCEMP");
Employee e1=null;
Set<Employee> s1=new HashSet<Employee>();
	while(!rs1.next())
	{e1=new Employee();
		e1.setEid(rs1.getInt(1));
		e1.setEname(rs1.getString(2));
		e1.setSalary(rs1.getDouble(3));
		e1.setErole(rs1.getString(4));
		/*e1.setSques(rs1.getString(5));
		e1.setSans(rs1.getString(6));*/
	
	s1.add(e1);
	}
	return s1;
	}
	
	

	
	@Override
	protected void finalize() throws Throwable {
	  con.close();
	}
	
}

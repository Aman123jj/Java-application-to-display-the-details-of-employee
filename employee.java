package pack2;

import java.util.Scanner;

public class employee {

public static void main(String[] args) {

String array[][]=new String[][]{{"1001","Ashish","01/04/2009","e","R&D","2000","8000","3000"},
{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};



String detail[][]=new String[][] {{"e","engineer","2000"},
 {"c","consultant","32000"},
 {"k","clerk","12000"},
 {"r","receptionist","15000"},
 {"m","manager","40000"}};
 

 int eid;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee Id");
eid=sc.nextInt();
  int total=98;
  int i=0;
  String name;
  String doe;
 
  String dept;
 
  String degcode=array[i][3];
String deg;
char c=degcode.charAt(0);
int da;

switch(c)
{
case  'e' :  total=Integer.parseInt(array[0][7])+Integer.parseInt(array[0][5])+Integer.parseInt(array[0][6])+Integer.parseInt(detail[0][2]);
      deg="Engineer";
      da=15000;
      break;
case  'c' :  total=Integer.parseInt(array[1][7])+Integer.parseInt(array[1][5])+Integer.parseInt(array[1][6])+Integer.parseInt(detail[1][2]);
deg="Consultant";
da=32000;
break;
case  'k' :  total=Integer.parseInt(array[2][7])+Integer.parseInt(array[2][5])+Integer.parseInt(array[2][6])+Integer.parseInt(detail[2][2]);
deg="Clerk";
da=12000;
break;
case  'r' :  total=Integer.parseInt(array[3][7])+Integer.parseInt(array[3][5])+Integer.parseInt(array[3][6])+Integer.parseInt(detail[3][2]);
deg="Receptionist";
da=15000;
      break;
case  'm' :  total=Integer.parseInt(array[4][7])+Integer.parseInt(array[4][5])+Integer.parseInt(array[4][6])+Integer.parseInt(detail[4][2]);
deg="Manager";
da=40000;
      break;
}
if(eid==Integer.parseInt(array[i][0]))
  { int id=Integer.parseInt(array[i][0]);
// name=array[i][1];
//doe=array[i][2];
//degcode=array[i][3];
//dept =array[i][4];
System.out.println("Empno.\tEmpName\tDepartment\tDesignation\tSalary"+"\n"+eid+"\t"+array[i][1]+"  \t"+array[i][4]+"\t");

  }
  else
  System.out.println("there is no emplyee with Eid :"+eid);


sc.close();
}
}
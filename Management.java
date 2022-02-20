import java.util.*;
class Management{
	public static void bestIndbms(String[][] student) {
		Scanner input=new  Scanner(System.in);
		clearConsole();
		System.out.print("---------------------------------------------------------------------------------");
		System.out.print("\n|\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t|\n");
		System.out.println("---------------------------------------------------------------------------------\n");
		System.out.println();
		
		int c=0;
		L1:	for (int i = 0; i < student.length; i++){
			if (student[i][0].equals("0")){
				c=i;
				break L1;
			}else{
				c=-1;
			}	
		}
		
		if (c!=-1) { 
		for (int i = 0; i < student.length; i++){
			for (int j = 0; j < student.length; j++){
				for (int k = 0; k <student.length-1 ; k++){
						int mark1=Integer.valueOf(student[k][3]);
						int mark2=Integer.valueOf(student[k+1][3]);
						if (mark1<mark2){
							//sort array
							String temp1=student[k][3];
							student[k][3]=student[k+1][3];
							student[k+1][3]=temp1;
							
							String temp2=student[k][2];
							student[k][2]=student[k+1][2];
							student[k+1][2]=temp2;
							
							String temp3=student[k][1];
							student[k][1]=student[k+1][2];
							student[k+1][1]=temp3;
							
							String temp4=student[k][0];
							student[k][0]=student[k+1][0];
							student[k+1][0]=temp4;
						}
				}
			}
		}
		
L3:	while (true){
		System.out.println("+---------------+-----------------------+-----------+----------+");
		System.out.println("|ID		|Name			|DBMS Marks |PF Marks  |");
		System.out.println("+---------------+-----------------------+-----------+----------+");
		//check students with marks and print
	L4:	for(int z=0;z<student.length;z++) {
			if(student[z][3].equals("0") || student[z][2].equals("0")) {
				continue L4;
			}else {
				System.out.println("|"+student[z][0]+"		|"+student[z][1]+"		        |"+student[z][3]+"         |"+student[z][2]+"	       |");
			}
		}
			System.out.println("+---------------+-----------------------+-----------+----------+");
			System.out.println();
			System.out.print("Do you want to go back to main menu? (Y/N)");	
			char yn=input.next().charAt(0);
			switch(yn) {
			case 'Y' :
				printHome(student);
			case 'N' :
				clearConsole();
				System.out.print("---------------------------------------------------------------------------------");
				System.out.print("\n|\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t|\n");
				System.out.println("---------------------------------------------------------------------------------\n");
				System.out.println();
				continue L3;
				
			}
		}
	}
	}
	public static void bestInProgramimg(String[][] student){
	Scanner input=new  Scanner(System.in);
	clearConsole();
	System.out.print("---------------------------------------------------------------------------------");
	System.out.print("\n|\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t|\n");
	System.out.println("---------------------------------------------------------------------------------\n");
	System.out.println();
	
		int c=0;
	L1:	for (int i = 0; i < student.length; i++){
			if (student[i][0].equals("0")){
				c=i;
				break L1;
			}else{
				c=-1;
				}
		}
			
	if (c!=-1){
	for (int i = 0; i < student.length; i++){
				for (int j = 0; j < student.length; j++){
					for (int k = 0; k <student.length-1 ; k++){
						//sort array
							int mark1=Integer.valueOf(student[k][2]);
							int mark2=Integer.valueOf(student[k+1][2]);
							if (mark1<mark2){
							String temp1=student[k][2];
							student[k][2]=student[k+1][2];
							student[k+1][2]=temp1;
												
							String temp2=student[k][0];
							student[k][0]=student[k+1][0];
							student[k+1][0]=temp2;
											
							String temp3=student[k][1];
							student[k][1]=student[k+1][1];
							student[k+1][1]=temp3;
											
							String temp4=student[k][3];
							student[k][3]=student[k+1][3];
							student[k+1][3]=temp4;
						}
					}								
				}
				L3:	while (true){
				System.out.println("+---------------+-----------------------+-----------+----------+");
				System.out.println("|ID		|Name			|PF Marks   |DBMS Marks|");
				System.out.println("+---------------+-----------------------+-----------+----------+");
				//check students with marks and print
			L2:	for (int m = 0; m < student.length; m++){
					if (student[m][2].equals("0") || student[m][3].equals("0")){
						continue L2;
					}else{
						System.out.println("|"+student[m][0]+"		|"+student[m][1]+"		        |"+student[m][2]+"         |"+student[m][3]+"	       |");
					}
				}
				System.out.println("+---------------+-----------------------+-----------+----------+");
				System.out.println();
				System.out.print("Do you want to go back to main menu? (Y/N)");	
				char leter=input.next().charAt(0);
				if (leter=='Y'){
					printHome(student);
				}else {
					clearConsole();
					System.out.print("---------------------------------------------------------------------------------");
					System.out.print("\n|\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t|\n");
					System.out.println("---------------------------------------------------------------------------------\n");
					System.out.println();
				}
				
		}
	}
	}
}
	public static void printStudentRank(String[][] student){
		Scanner input=new  Scanner(System.in);
		clearConsole();
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tPRINT STUDENT RANK\t\t\t|\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println();
		
		int c=0;
		for (int h = 0; h < student.length; h++){
			if (student[h][0].equals("0")){
				c=h;
				break;
			}else{
				c=-1;
			}
		}
		
		if (c!=-1){
		for (int i = 0; i < student.length; i++){
			int  total=Integer.valueOf(student[i][4]);
			student[i][5]=((double)total/student.length+"");
		}
		for (int j = 0; j < student.length; j++){
			for (int k = 0; k <student.length-1 ; k++){
				int total1=Integer.valueOf(student[k][4]);
					int total2=Integer.valueOf(student[k+1][4]);
					if (total1<total2){
					String temp1=student[k][4];
					student[k][4]=student[k+1][4];
					student[k+1][4]=temp1;
										
					String temp2=student[k][0];
					student[k][0]=student[k+1][0];
					student[k+1][0]=temp2;
									
					String temp4=student[k][1];
					student[k][1]=student[k+1][1];
					student[k+1][1]=temp4;
										
					String temp5=student[k][2];
					student[k][2]=student[k+1][2];
					student[k+1][2]=temp5;
									
					String temp6=student[k][3];
					student[k][3]=student[k+1][3];
					student[k+1][3]=temp6;
										
					String temp3=student[k][5];
					student[k][5]=student[k+1][5];
					student[k+1][5]=temp3;
				}
			}								
		}
		
		L3:	while (true){	
		System.out.println("+-------+---------------+-----------------------+-----------+----------+");
		System.out.println("|Rank	|ID		|Name			|Total Marks|Avg. Marks|");
		System.out.println("+-------+---------------+-----------------------+-----------+----------+");
	L1:	for (int i = 0; i < student.length; i++){
			if (student[i][2].equals("0") || student[i][3].equals("0")){
				continue L1;
			}else{
				System.out.println("|"+(i+1)+"	|"+student[i][0]+"		|"+student[i][1]+"			|"+"	 "+student[i][4]+"|"+"	   "+student[i][5]+"|");
			}
		}
		System.out.println("+-------+---------------+-----------------------+-----------+----------+");
		System.out.println();
		System.out.print("Do you want to go back to main menu? (Y/N)");	
		char leter=input.next().charAt(0);
		if (leter=='Y'){
			printHome(student);
		}else {
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tPRINT STUDENT RANK\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println();
			continue L3;
		}

		}
		}
		
			
}

	public  static void printStudentDetails(String[][] student){
		Scanner input=new Scanner(System.in);
		clearConsole();
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tPRINT STUDENT DEAILS\t\t\t|\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println();
	L1:	while (true){

			System.out.print("Enter Student Id : ");
			String number=input.next();

			if (number.indexOf("S")==0){
				int f=0;
			L2:for (int i = 0; i < student.length; i++) {
					if (number.equals(student[i][0])){
						f=i;
						break L2;
					}else {
						f=-1;
					}
			}
						
						if(f!=-1) {
						if(student[f][2].equals("0") || student[f][3].equals("0")){
							System.out.println("Student Name : "+student[f][1]);
							System.out.println();
							System.out.println("Marks yet to added.");
							System.out.println();
							System.out.print("Do you want to search another student details? (Y/N) ");
							char yn=input.next().charAt(0);
							switch(yn){
							case 'Y':
									clearConsole();
									System.out.print("-----------------------------------------------------------------");
									System.out.print("\n|\t\t\tPRINT STUDENT DEAILS\t\t\t|\n");
									System.out.println("-----------------------------------------------------------------\n");								
									System.out.println();
									continue L1;
							case 'N':	
								printHome(student);
							}
						}else{
							System.out.println("Student Name : "+student[f][1]);
							System.out.println("+---------------------------------------+--------------------------+");
							System.out.println("|Programing Fundamentals Marks	 	|			 "+student[f][2]+"|");
							System.out.println("|Database Managment System marks        |			 "+student[f][3]+"|");
							int  total=Integer.valueOf(student[f][4]);
							student[f][5]=((double)total/2+"");
							System.out.println("|Total Marks   			    	|	           	"+student[f][4]+"|");
							System.out.println("|Avg. Marks				|		       "+student[f][5]+"|");
							
							for (int j = 0; j < student.length; j++){
								for (int k = 0; k <student.length-1 ; k++){
									int total1=Integer.valueOf(student[k][4]);
									int total2=Integer.valueOf(student[k+1][4]);
									if (total1<total2){
										String temp1=student[k][4];
										student[k][4]=student[k+1][4];
										student[k+1][4]=temp1;
										
										String temp2=student[k][0];
										student[k][0]=student[k+1][0];
										student[k+1][0]=temp2;
										
										String temp3=student[k][1];
										student[k][1]=student[k+1][1];
										student[k+1][1]=temp3;
										
										String temp4=student[k][2];
										student[k][2]=student[k+1][2];
										student[k+1][2]=temp4;
										
										String temp5=student[k][3];
										student[k][3]=student[k+1][3];
										student[k+1][3]=temp5;
										
										String temp6=student[k][5];
										student[k][5]=student[k+1][5];
										student[k+1][5]=temp6;
									}
								}
								
							}
							
							for (int s = 0; s < student.length; s++){
								if (number.equals(student[s][0])){
									if ((s+1)!=student.length){
										switch(s+1){
											case 1 : System.out.println("|Rank					|		   "+(s+1)+"(First)|");break;
											case 2 : System.out.println("|Rank					|		  "+(s+1)+"(Second)|");break;
											case 3 : System.out.println("|Rank					|		   "+(s+1)+"(Third)|");break;
											default : System.out.println("|Rank					|		          "+(s+1)+"|");break;
												}
										}else{
											System.out.println("|Rank					|		"+(s+1)+"(Last)|");break;
										}
									System.out.println("+---------------------------------------+--------------------------+");
									break;
								}
							}

							System.out.println();
							System.out.print("Do you want to search another student details? (Y/N)");
							char yn=input.next().charAt(0);
							switch(yn){
							case 'Y':
									clearConsole();
									System.out.print("-----------------------------------------------------------------");
									System.out.print("\n|\t\t\tPRINT STUDENT DEAILS\t\t\t|\n");
									System.out.println("-----------------------------------------------------------------\n");								System.out.println();
									continue L1;
							case 'N':	
								printHome(student);
							}
						}
					
					}else {
					System.out.print("Invalid index. Do you want to search another student details? (Y/N)");
						char yn=input.next().charAt(0);
						switch(yn){
						case 'Y':
								clearConsole();
								System.out.print("-----------------------------------------------------------------");
								System.out.print("\n|\t\t\tPRINT STUDENT DEAILS\t\t\t|\n");
								System.out.println("-----------------------------------------------------------------\n");								System.out.println();
								continue L1;
						case 'N':	
							printHome(student);

				}
					}
				
			}else{
				System.out.print("Invalid index. Do you want to search another student details? (Y/N)");
				char yn=input.next().charAt(0);
				switch(yn){
				case 'Y':
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tPRINT STUDENT DEAILS\t\t\t|\n");
						System.out.println("-----------------------------------------------------------------\n");								System.out.println();
						continue L1;
				case 'N':	
					printHome(student);
				}
			}
		}
	}
	public static void deleteStudent(String [][]student) {
		Scanner input=new Scanner(System.in);
		clearConsole();
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println();
		
		M1:	for(int i=0;i<student.length;i++) {
			do {
			System.out.print("\nEnter Student ID  :");
			String number=input.next();
			
				if(student[i][0].equals(number)){
					for(int j=0;j<student[i].length;j++) {
						student[i][j]=("0");
					}
					System.out.print("Student has been deleted Successfully.\nDo you want to delete another student?(Y/N)");
					char yn=input.next().charAt(0);
					switch(yn) {
					case 'Y':
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
						System.out.println("-----------------------------------------------------------------\n");
						System.out.println();
						continue M1;
					case 'N':
						clearConsole();
						 printHome(student);
						break ;
					}
					
				}else {
					System.out.println("Invalid student ID.Do you want to search again? (Y/N)");
					char yn=input.next().charAt(0);
					
					switch(yn) {
					case 'Y':
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
						System.out.println("-----------------------------------------------------------------\n");
						System.out.println();
						i--;
						continue M1;
					case 'N':
						 printHome(student);
						break ;
					}
				}
			}while(i==student.length);
		}
		
	}
	public static void updateMarks(String [][]student) {
		Scanner input=new Scanner(System.in);
		char leter='N';
L1:	while(true){
	do{
		clearConsole();
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tUpdate Marks\t\t\t\t|\n");
		System.out.println("-----------------------------------------------------------------\n");
				
			System.out.print("Enter Student Id : ");
			String number=input.next();
			if (number.indexOf("S")==0){
				int x=0;
			L2:	for (int i = 0; i < student.length; i++){
						//check index is in the array 
					if(number.equals(student[i][0])){
						x=i;
						break L2;
					}else{
						x=-1;
						}
					}
				if (x!=-1){
									 //check marks exist or not
						if ((student[x][2].equals("0")) || (student[x][3].equals("0"))){
								System.out.println("Student Name : "+student[x][1]);
								System.out.println("This student's marks yet to be added.");
								System.out.print("Do you want to update  another student details? (Y/N)");
								leter=input.next().charAt(0);
								System.out.println();
								if (leter=='Y'||leter=='y'){
									continue L1;
								}else if(leter=='N'||leter=='n'){
									printHome(student);
									}
							}
							//enter update marks
							System.out.println("Student name 	: "+student[x][1]+"\n");
							System.out.println("Programing Fundamentals Marks    : "+student[x][2]);
							System.out.println("Database Management System Marks : "+student[x][3]+"\n");
							int mark1=0;
						M1:	while (true){
								System.out.print("Enter new Programing Fundamentals Marks    : ");
								String tempMark1=input.next();
								mark1=Integer.valueOf(tempMark1);
								if (mark1<0 || mark1>100){
									System.out.println("Invalid marks, please enter correct marks.\n");
									continue M1;
								}else{
									student[x][2]=tempMark1;
									break M1;
								}
							}
							int mark2=0;
						M2:	while (true){
							System.out.print("Enter new Database Management System Marks : ");
							String tempMark2=input.next();
							mark2=Integer.valueOf(tempMark2);
							if (mark2<0 || mark2>100){
								System.out.println("Invalid marks, please enter correct marks.\n");
								continue M2;
							}else{
								student[x][3]=tempMark2;
								break M2;
							}
						}
						student[x][4]=(mark1+mark2)+"";
							System.out.println("Marks has been update Succcsessfully.");
							System.out.print("Do you want to update  another student details? (Y/N)");
							char yn=input.next().charAt(0);
							System.out.println();
							if (yn=='Y'){
								continue L1;
							}else if(yn=='N'){
								printHome(student);
								}
							
				}else{
					System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
					char yn1=input.next().charAt(0);
					if (yn1=='Y'){
						continue L1;
					}else if(yn1=='N'){
						printHome(student);
					}
				}
				
			}else{
				System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
				leter=input.next().charAt(0);
			}
		} while (leter=='Y');
		if (leter=='N'){
			printHome(student);
		}
		
	}
}

	public static void updateStudentDetails(String [][]student) {
		Scanner input=new Scanner(System.in);
L1:		while(true){
	
		clearConsole();
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tUPDATE STUDENT DETAILS\t\t\t|\n");
		System.out.println("-----------------------------------------------------------------\n");
				
		System.out.print("Enter Student Id : ");
		String number=input.next();
		if (number.indexOf("S")==0){
			int x=0;
		L2:	for (int i = 0; i < student.length; i++){
				if(number.equals(student[i][0])){
					x=i;
					break L2;
					}
					x=-1;
				}
			if (x==-1){
				System.out.print("Invalid Student ID. Do you want to search again? (Y/N)");
						char yn=input.next().charAt(0);
						switch(yn) {
						case 'Y':
							continue L1;
						case 'N':
							printHome(student);
							
							
						}	
			}else{
				System.out.println("Student name 	: "+student[x][1]+"\n");
				System.out.print("Enter the new Student name 	: ");
				student[x][1]=input.next();
				System.out.println();
				System.out.println("Student deatils has been update successfully.");
				System.out.print("Do you want to update  another student details? (Y/N)");
				char yn=input.next().charAt(0);
				System.out.println();
				switch(yn) {
				case 'Y':
					clearConsole();
					System.out.print("-----------------------------------------------------------------");
					System.out.print("\n|\t\t\tUPDATE STUDENT DETAILS\t\t\t|\n");
					System.out.println("-----------------------------------------------------------------\n");
					continue L1;
				case 'N':
					printHome(student);
					
					
				}	
			}
			
		}else{
			System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
			char yn=input.next().charAt(0);
			
			switch(yn) {
			case 'Y':
				continue L1;
			case 'N':
				printHome(student);
				
				
			}
		}
	
			
}	
}
	public static void addMarks(String [][]student) {
		clearConsole();
		Scanner input=new Scanner(System.in);
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
		System.out.print("-----------------------------------------------------------------\n");

L1:	for (int j = 0; j < student.length; j++){
		while(true){
		
		System.out.print("Enter Student Id : ");
		String number=input.next();
		if (number.indexOf("S")==0){
			int x=0;
		L2:	for (int i = 0; i < student.length; i++){
				if (number.equals(student[i][0])){ 
					x=i;
					break L2;
				}else{
					x=-1;
				}	
			}
			if (x!=-1){
				System.out.println("Student Name : "+student[x][1]+"\n");
					if (student[x][2].equals("0")){
						int mark1=0;
					M1:	while(true){
							System.out.print("Programin Fundamenatals Marks : ");
							String mark=input.next();
							mark1=Integer.valueOf(mark);
							if (mark1<0 || mark1>100){
							System.out.println("Invalid marks, please enter correct marks.\n");
							continue M1;
						}else{
							student[j][2]=mark;
							break M1;
						}		
					}
						int mark2=0;
					M2: while (true){
							System.out.print("Database management system Marks : ");
							String mark=input.next();
							mark2=Integer.valueOf(mark);
							if (mark2<0 || mark2>100){
							System.out.println("Invalid marks, please enter correct marks.\n");
							continue M2;
						}else{
							student[j][3]=mark;
							break M2;
						}
					}
					student[x][4]=(mark1+mark2)+"";
					System.out.print("Marks have been added. do you want to added marks for another student?(Y/N)");
					char yn=input.next().charAt(0);
					 switch(yn) {
					 case 'N':
						 printHome(student);
						 break;
					 case 'Y':
						 clearConsole();
							System.out.print("-----------------------------------------------------------------");
							System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
							System.out.print("-----------------------------------------------------------------\n");
							System.out.println();
							continue L1;
					 }
					
					}else{
						System.out.println("This student marks  have been already added.");
						System.out.println("If you want to update the marks,please use [4] Update Marks option."+"\n");
						System.out.print("Do you want to add marks another student? (Y/N)");
						char yn=input.next().charAt(0);
						System.out.println();
						 switch(yn) {
						 case 'N':
							 printHome(student);
							 break;
						 case 'Y':
							 clearConsole();
								System.out.print("-----------------------------------------------------------------");
								System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
								System.out.print("-----------------------------------------------------------------\n");
								System.out.println();
								continue L1;
						 }
						
						}
			}else{
				System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
				char yn=input.next().charAt(0);
				 switch(yn) {
				 case 'N':
					 printHome(student);
					 break;
				 case 'Y':
					 clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
						System.out.print("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
				 }
			}
			
		}else{
			System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
			char yn=input.next().charAt(0);
			 switch(yn) {
			 case 'N':
				 printHome(student);
				 break;
			 case 'Y':
				 clearConsole();
					System.out.print("-----------------------------------------------------------------");
					System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
					System.out.print("-----------------------------------------------------------------\n");
					System.out.println();
					continue L1;
			 }
			
		}
		}
	}
	
					
}
	public static void addStudentMarks(String [][]student) {
		Scanner input=new Scanner(System.in);
		
		clearConsole();
		System.out.print("\n-------------------------------------------------------------------------\n|");
		System.out.print("\t\t\tADD NEW STUDENT  WITH MARKS"+"\t\t\t|");
		System.out.print("\n-------------------------------------------------------------------------\n");
		
		L1:	for(int i=0;i<student.length;i++) {
			
			do {
				System.out.print("\nEnter Student ID  :");
				String number=input.next();
		L2:	for(int j=0;j<student.length;j++) {
				if (number.equals(student[j][0])){ 
					System.out.println("The Student ID already exists");
					i--;
					j--;
					continue L1;
					
				}else if
					(student[j][0].equals("0")) {
					student[i][0]=number;
				}else {
					continue L2;
				}

			}
			System.out.print("Enter Student Name  : ");
			student[i][1]=input.next();
			
			int marks1=0;
			L5:	while (true){
				System.out.print("Programing Fundamentals Marks : ");
				String pm=input.next();
				marks1=Integer.valueOf(pm);
				if(marks1<0 || marks1>100) {
					System.out.println("Invalid marks, please enter correct marks.\n");
					continue L5;
				}
				student[i][2]=pm;
				break L5;
			}
			
			int marks2=0;
			L6:	while (true){
				System.out.print("Database Manage System Marks : ");
				String db=input.next();
				marks2=Integer.valueOf(db);
				if(marks2<0 || marks2>100) {
					System.out.println("Invalid marks, please enter correct marks.\n");
					continue L6;
				}
				student[i][3]=db;
				break L6;
			}
			student[i][4]=(marks1+marks2)+"";
			
			}while(i==student.length);
			System.out.print("Student has added successfully.Do you want to add new student? (Y/N)");
			char yn=input.next().charAt(0);
			 switch(yn) {
			 case 'N': 
				 printHome(student);
				 break;
			 case 'Y':
				 clearConsole();
					System.out.print("\n-------------------------------------------------------------------------\n|");
					System.out.print("\t\t\tADD NEW STUDENT  WITH MARKS"+"\t\t\t|");
					System.out.print("\n-------------------------------------------------------------------------\n");
				 continue L1;
			 }
		}
		
		}
		
	public static void addStudent(String[][]student){
		Scanner input=new Scanner(System.in);
		clearConsole();
		System.out.print("\n-------------------------------------------------------------------------\n|");
		System.out.print("\t\t\tADD NEW STUDENT"+"\t\t\t\t\t|");
		System.out.print("\n-------------------------------------------------------------------------\n");
		
		
	L1:	for(int i=0;i<student.length;i++) {
		char yn='Y';
		do {
			System.out.print("\nEnter Student ID  :");
			String number=input.next();
			int x=0;
	L2:	for(int j=0;j<student.length;j++) {
			if (number.equals(student[j][0])){ 
				System.out.println("The Student ID already exists");
				i--;
				continue L1;
				
			}else if(student[j][0].equals("0")) {
				student[i][0]=number;
			}else {
				continue L2;
			}

		}
		System.out.print("Enter Student Name  : ");
		student[i][1]=input.next();
		}while(i==student.length);
		System.out.print("Student has added successfully.Do you want to add new student? (Y/N)");
		yn=input.next().charAt(0);
		 if(yn=='N') {
			 printHome(student);
		 }
		 clearConsole();
			System.out.print("\n-------------------------------------------------------------------------\n|");
			System.out.print("\t\t\tADD NEW STUDENT"+"\t\t\t\t\t|");
			System.out.print("\n-------------------------------------------------------------------------\n");
		 continue L1;
	}
	}
	public static void printHome(String[] [] student0) {
		Scanner input=new Scanner(System.in);
		String[] [] student=new String[100][4];
		student=student0;
	
	System.out.print("\n-------------------------------------------------------------------------------------------------\n|");
	System.out.print("\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM"+"\t\t\t\t\t|");
	System.out.print("\n-------------------------------------------------------------------------------------------------\n");
	
	System.out.println();
	
	System.out.print("[1]Add new student\t\t\t\t");
	System.out.print("[2]Add new students with Marks\n");
	System.out.print("[3]Add Marks\t\t\t\t\t");
	System.out.print("[4]Update Student Details\n");
	System.out.print("[5]Update Marks\t\t\t\t\t");
	System.out.print("[6]Delete Student\n");
	System.out.print("[7]Print Student Detail\t\t\t\t");
	System.out.print("[8]Print Student Ranks\n");
	System.out.print("[9]Best in Programming Fundamentals\t\t");
	System.out.print("[10]Best in Database Management System\n");
	
	System.out.println();
	
	System.out.print("Enter an option to continue >");
	int num=input.nextInt();
	
	 switch(num) {
	 	case 1 :
	 		addStudent(student);
	 		break;
	 	case 2:
	 		addStudentMarks(student);
	 		break;
	 	case 3:
	 		addMarks(student);
	 		break;
	 	case 4:
	 		updateStudentDetails(student);
	 		break;
	 	case 5:
	 		updateMarks(student);
	 		break;
	 	case 6 :
	 		deleteStudent(student);
	 	case 7 :
	 		printStudentDetails(student);
	 		break;
	 	case 8 :
	 		printStudentRank(student);
	 		break;
	 	case 9 :
	 		bestInProgramimg(student);
	 		break;
	 	case 10 :
	 		bestIndbms(student);
	 		break;
	 	default :
	 		System.out.print("Wrong number");
	 		while(true) {
	 			System.out.print("Enter correct option to continue");
	 			num=input.nextInt();
	 			printHome(student);
	 		}
	 		}
	 	
	}
	
	
	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
		// Handle any exceptions.
		}
		}
	
public static void main(String[] args) {
	String[] [] student=new String[100][6];
	
	for(int i=0;i<student.length;i++) {
		for(int j=0;j<student[i].length;j++) {
			student[i][j]=("0");
		}
		
	}

	printHome(student);
	clearConsole();
	

	 }
	
}


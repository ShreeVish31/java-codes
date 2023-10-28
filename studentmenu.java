import java.util.*;
class library_manager{
    
    public static String name[]=new String[100];
    public static int rollno[]=new int[100];
    public static int std[]=new int[100];
    public static  int nos_books[]=new int[100];
    public static int flag,n;  
    
    
  public static void main(String args[]){
      Scanner sc=new Scanner (System.in);
      int no;
      
      //array declarations for number of students you want for database
      System.out.println("Enter the no of students whose name you want to store in the database");
      n=sc.nextInt();      
      System.out.println("☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻");
      System.out.println();
      System.out.println();
      System.out.println("----------------------------------------------------------------------------------------");
        
      //arrays to store database
       

          //loop to take the input values per person
      for(int i=0;i<n;i++){
            System.out.println("Enter the details of the Student no "+(i+1));        
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Enter the name of the Student no "+(i+1));
            name[i]=sc.next(); 
            System.out.println("Enter the Roll_no of the Student no "+(i+1));
            rollno[i]=sc.nextInt();
            System.out.println("Enter the STD (numerical not roman value) of the Student no "+(i+1));
            std[i]=sc.nextInt();
            System.out.println("Enter the no of books of the Student no "+(i+1));
            nos_books[i]=sc.nextInt();
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------");
      }
         
      
        while(1<2){
          
            System.out.println("-----------------------------------------");
            System.out.println("☺☺☺☺☺------Main Menu------☺☺☺☺☺");
            System.out.println("-----------------------------------------");
            System.out.println(" 1:Search Student by Roll no");
            System.out.println(" 2:Search Student by name");
            System.out.println(" 3:List of All Students");
            System.out.println(" 4:Exit");
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Enter Your Choice : ");
            
            no = sc.nextInt();
            switch(no)
            {
                 case 1: search_roll(n);
                 break;
                 case 2: search_name(n);
                 break;
                 case 3: display(n);
                 break;
                 case 4: flag=1;
                 break;
            }
            if(flag==1){
                break;//will break the loop if the flag is true
            }
       }       

  }
  
  
    public static void search_roll(int x){
        Scanner sc=new Scanner (System.in);        
       System.out.println("Enter Student's Roll no to be Searched : ");
       int id=sc.nextInt();
       System.out.println("☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻\n");
       for(int i=0;i<x;i++)
       {
            if(rollno[i]==id)
            {    
                 System.out.println("Name        : "+name[i]);
                 System.out.println("Roll no     : "+rollno[i]);
                 System.out.println("Std         : "+std[i]);
                 System.out.println("Books       : "+nos_books[i]);
                 System.out.println();
            }
       }
        
    }
    
     public static void search_name(int x){
       Scanner sc=new Scanner (System.in);        
       System.out.println("Enter Student's name to be Searched : ");
       String id_str=sc.nextLine();
       System.out.println("☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻\n");
       for(int i=0;i<x;i++)
       {
            if(name[i].equals(id_str))
            {    
                 System.out.println("Name        : "+name[i]);
                 System.out.println("Roll no     : "+rollno[i]);
                 System.out.println("Std         : "+std[i]);
                 System.out.println("Books       : "+nos_books[i]);
                 System.out.println();
            }
       }
    }
    
    
     public static void display(int x){
         int i;
       System.out.println("List of All Students:\n");
       System.out.println("-------------------------------");
       System.out.println("Name    Rollno     std      books   ");
       System.out.println("--------------------------------");
       for(i=0;i<x;i++)
       {
            System.out.println(name[i]+"      "+rollno[i]+"     "+std[i]+"     "+nos_books[i]+"    ");
       }
       System.out.println("\n");
    
    }
  
}
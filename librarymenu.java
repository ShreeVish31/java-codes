import java.util.*;

public class librarymenu 
{
    public static String bookname[]=new String[50];
    public static String authorname[]=new String[50];
    public static int cost[]=new int[50];
    public static int no_of_pages[]=new int[50];
    public static int flag,i,count;

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int no;
        int s1=0;
        System.out.println("*****WELCOME TO YOUR LIBRARY*****");

        while(flag==0)
        {
            System.out.println("-----------------------------------------");
            System.out.println("☺☺☺☺☺------Main Menu------☺☺☺☺☺");
            System.out.println("-----------------------------------------");
            System.out.println(" 1:Add books");
            System.out.println(" 2:Display books");
            System.out.println(" 3:Search book by book name");
            System.out.println(" 4:Total no of books");
            System.out.println(" 5:Exit");
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Enter Your Choice : "); 
            no = sc.nextInt();

            
            switch(no)
            {
                case 1:
                System.out.println("Enter book name: ");
                sc.nextLine();
                bookname[i]=sc.nextLine();
                System.out.println("Enter author name: ");
                authorname[i]=sc.nextLine();
                System.out.println("Enter cost of book: ");
                cost[i]=sc.nextInt();
                System.out.println("Enter no of pages in book: ");
                no_of_pages[i]=sc.nextInt();
                count+=1;
                i+=1;
                break;

                case 2:
                if (count==0) 
                {
                    System.out.println("There is no book");
                } 
                else 
                {
                    System.out.println("List of books are: ");
                    for(i=0;i<count;i++)
                    {
                        System.out.println("Details of book "+(i+1));
                        System.out.println("The name of book is: "+bookname[i]);
                        System.out.println("The name of author is: "+authorname[i]);
                        System.out.println("The cost of book is: "+cost[i]);
                        System.out.println("The no of pages are: "+no_of_pages[i]+"\n");
                    }
                }
                break;

                case 3:
                Scanner s=new Scanner (System.in);
                System.out.println("Enter book name to be Searched : ");
                String sea=s.nextLine();
                for(i=0;i<count;i++)
                {
                    if(bookname[i].equals(sea))
                    {
                        System.out.println("The book found: ");
                        System.out.println("The name of book is: "+bookname[i]);
                        System.out.println("The name of author is: "+authorname[i]);
                        System.out.println("The cost of book is: "+cost[i]);
                        System.out.println("The no of pages are: "+no_of_pages[i]);
                        s1+=1;
                        break;
                    }
                }
                System.out.println(s1);
                if(s1 == 0)
                {
                    System.out.println("The book not found");
                }
                s1=0;
                break;

                case 4:
                System.out.println("Total no of books are: "+count);
                break;

                case 5:
                flag=1;
                break;
            }
            /*if(flag==1)
            {
                break;//will break the loop if the flag is true
            }*/
        }
    }
}

package com.book.list;

public class Book {

	
		 public String title;
		   
		    public String author;
		    
		    public int year;
		    
		    public String publisher;
		    
		    public double cost;
		    
    
		    
		    public Book(String title,String author,int year,String publisher,double cost)
		    {   this.title=title;
		        this.author=author;
		        this.year=year;
		        this.publisher=publisher;
		        this.cost=cost;
		    }
		 		    
		    public String getTitle()
		    {
		        return title;
		    }
		    
		     public String getAuthor()
		    {
		        return author;
		    }
		    public int getYear()
		    {
		        return year;
		    }
		    public String getPublisher()
		    {
		        return publisher;
		    } 
		    public double getCost()
		    {
		        return cost;
		    }


	

}


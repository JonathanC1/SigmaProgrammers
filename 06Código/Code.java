package ec.edu.espe.recognitionofplates.model;

import java.util.Date;   

public class Payment {
	private int id;
	private Plates idPlates;
	private float cost;
	private Date dateInitial;
	private Date dateFinished;
	
	    public void insert(){
        
	    }

	    public void deletd(){

	    }

	    public void update(){

	    }

	    public boolean calculated(){

		return true;
	    }


	    public int getId() {
		return id;
	    }


	    public void setId(int id) {
		this.id = id;
	    }


	    public Plates getIdPlates() {
		return idPlates;
	    }


	    public void setIdPlates(Plates idPlates) {
		this.idPlates = idPlates;
	    }


	    public float getCost() {
		return cost;
	    }


	    public void setCost(float cost) {
		this.cost = cost;
	    }

	    public Date getDateInitial() {
		return dateInitial;
	    }


	    public void setDateInitial(Date dateInitial) {
		this.dateInitial = dateInitial;
	    }


	    public Date getDateFinished() {
		return dateFinished;
	    }


	    public void setDateFinished(Date dateFinished) {
		this.dateFinished = dateFinished;
	    }

 }
public class IDImage {
    
}
public class IDPlates {
    
}

public class Plates {
	private int id;
   	private String description;
    
    	public void insert(){
        
    	}
    
    	public void delete(){
        
    	}
    
    	public void update(){
        
    	}

  
    	public int getId() {
        	return id;
    	}

  
    	public void setId(int id) {
        	this.id = id;
    	}

   
    	public String getDescription() {
        	return description;
    	}

    
    	public void setDescription(String description) {
        	this.description = description;
    	}
    
}

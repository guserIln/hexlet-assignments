package exercise;


public class NegativeRadiusException extends Exception {


	private String errorCode;
	private String message;
	
	public NegativeRadiusException(String message) {
		this.message = message;
		  System.out.println(this.message);
	}
      
    /*  public NegativeRadiusException(String errorCode, String message) {
    	  this.errorCode = errorCode;
    	  this.message = message;
    	  System.out.println(this.errorCode);
    	  System.out.println(this.message);
      }*/
	

}

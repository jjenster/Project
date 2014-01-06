
public class Message {
	
	String sender, subject, body;
	int min;

	public Message(){
		
	}
	
	public Message(String sender, String subject, int min, String body){
		this.sender = sender;
		this.subject = subject;
		this.min = min;
		this.body = body;
	}
	
	public void setSender(String sender){
		this.sender = sender;
	}
	
	public String getSender(){
		return sender;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public void setMin(int min){
		this.min = min;
	}
	
	public int getMin(){
		return min;
	}
	
	public void setBody(String body){
		this.body = body;
	}
	
	public String getBody(){
		return body;
	}
}

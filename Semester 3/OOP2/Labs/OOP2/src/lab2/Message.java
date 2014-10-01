package lab2;

public class Message {
	private String sender;
	private String receiver;
	private String message;
	
	public Message() {
		sender = "john.doe@nazmul.com";
		receiver = "luke@oop.com";
		message = "";
	}
	
	public Message(String sndr, String rcvr) {
		this.sender = sndr;
		this.receiver = rcvr;
	}
	
	//Accessor
	public String getSender() {
		return sender;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	//Mutator
	public void setSender(String sndr) {
		this.sender = sndr;
	}
	
	public void setReceiver(String rcvr) {
		this.receiver = rcvr;
	}
}
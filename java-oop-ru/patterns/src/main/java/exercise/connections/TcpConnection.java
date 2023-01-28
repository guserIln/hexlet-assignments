package exercise.connections;

public class TcpConnection {
	
	private String ip;
	private int port;
	private Connection state;
	private String buffer = "";

	public TcpConnection(String ip, int port) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		this.port = port;
	}
	
	public void setState(Connection state) {
		this.state = state;
	}

	public void connect() {
		// TODO Auto-generated method stub
		if (this.state instanceof Connected) {
			System.out.println("Error! Connection already connected");
		} else {
			setState(new Connected());
		}
		
		
	}

	public String getCurrentState() {
		// TODO Auto-generated method stub
		if (this.state instanceof Disconnected) {
			return "disconnected";
		}
		if (this.state instanceof Connected) {
			return "connected";
		}
		return "";
	}

	public void write(String string) {
		// TODO Auto-generated method stub
		if ((this.state instanceof Disconnected) || (this.state == null)) {
			System.out.println("Error! Connection already disconnected");
		} else {
		    this.buffer += string;
		}
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		if ((this.state instanceof Disconnected) || (this.state == null)) {
			System.out.println("Error! Connection already disconnected");
		} else if (this.state instanceof Connected) {
			setState(new Disconnected());
			this.buffer = "";
		}
	}
	

}

package exercise.connections;

public class Z4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("1");
        TcpConnection connection = new TcpConnection("33.22.11.44", 80);
		connection.connect();
		System.out.println(connection.getCurrentState()); // "connected"
		connection.write("data");
		connection.disconnect();
		connection.getCurrentState(); // "disconnected"
		// Выводит на экран сообщение об ошибке
		connection.disconnect();
	}

}

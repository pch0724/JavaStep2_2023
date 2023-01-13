package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		
		service(new LoginService());
		service(new FtpDownloadService());

	}//m
	
	public static void service(HttpServlet http) {
		http.service();
	
	}//s
}//c

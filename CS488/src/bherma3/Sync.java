package bherma3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sync
 */
@WebServlet("/Sync")
public class Sync extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sync() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = (String) request.getAttribute("key");
		if(request.getAttribute("action").equals("Push")){
			BufferedWriter outputStream = new BufferedWriter(new FileWriter(key));
		}else{
			BufferedReader input = new BufferedReader(new FileReader(key));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = input.readLine())!= null)
				{
					sb.append(line);
				}
			response.setContentType("charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.write(sb.toString());
		}
		
//		Path f = createTempFile(Path dir,
//                String prefix,
//                String suffix,
//                FileAttribute<?>... attrs);
//		try {
//		    // Create the empty file with default permissions, etc.
//		    Files.createFile(key);
//		} catch (FileAlreadyExistsException x) {
//		    System.err.format("file named %s" +
//		        " already exists%n", file);
//		} catch (IOException x) {
//		    // Some other sort of failure, such as permissions.
//		    System.err.format("createFile error: %s%n", x);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

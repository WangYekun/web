package pers.husen.web.common.helper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

/**
 * @desc 读取服务器的html文件
 *
 * @author 何明胜
 *
 * @created 2017年12月16日 下午11:34:49
 */
public class ReadH5Helper {
	/**
	 * 读取html文件
	 * @param htmlQualifiedName
	 * @return
	 */
	public static String readHtmlByName(String htmlQualifiedName) {   
        BufferedReader br=null;   
        StringBuffer sb = new  StringBuffer();   
        try {   
            br=new BufferedReader(new InputStreamReader(new FileInputStream(htmlQualifiedName)));            
            String temp=null;          
            while((temp=br.readLine())!=null){   
                sb.append(temp);  
                sb.append("\n");
            }              
        } catch (FileNotFoundException e) {   
            e.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        }   
        return sb.toString();   
    }   
	
	/**
	 * 根据文件路径读取文件并输出至浏览器
	 * @param htmlQualifiedName
	 * @param response
	 * @throws IOException
	 */
	public static void writeHtmlByName(String htmlQualifiedName, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");

		OutputStream outStream = response.getOutputStream();
		try {
			FileInputStream fip = new FileInputStream(htmlQualifiedName);
			// 建立缓冲区
			byte[] buffer = new byte[1024]; 
			int len;
			while ((len = fip.read(buffer)) != -1) {
				outStream.write(buffer, 0, len);
			}
			fip.close();
			outStream.close();
			// 关闭输入流,释放系统资源
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
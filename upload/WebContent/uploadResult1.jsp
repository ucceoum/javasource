<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.UUID"%>
<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//file upload request 여부 확인하기
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	//사용자의 브라우저 확인
	String agent = request.getHeader("User-Agent");
	
	boolean ieBrowser = (agent.indexOf("Trident") >-1) || (agent.indexOf("Edge")>-1);
	





	if(isMultipart){
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		//업로드 가능 사이즈 지정
		upload.setSizeMax(2000*1024);
		
			//폼에 담긴 내용 중 일반요소와 file로 온 요소 분리
		List<FileItem> items = upload.parseRequest(request);
		
		String fieldName = null, fileName = null, value = null;
		Iterator<FileItem> iter = items.iterator();
		
		while(iter.hasNext()){
			FileItem item = iter.next();
			if(item.isFormField()){
				fieldName = item.getFieldName();
				value = item.getString("utf-8");
				out.print("<h3>일반 폼 양식</h3>");
				out.print(fieldName+" "+value+"<br>");
				
			}else{
				fieldName = item.getFieldName();
				fileName = item.getName();
				long size = item.getSize();
				
				out.print("<h3>파일 필드</h3>");
				out.print("fieldName : "+fieldName+"<br>");
				out.print("파일명 : "+fileName+"<br>");
				out.print("파일크기 : "+size);
				
				//서버 폴더에 저장
				if(!fileName.isEmpty()){
					
					
					
					
					if(ieBrowser){
						fileName = FilenameUtils.getName(fileName);
					}
					
					UUID uuid = UUID.randomUUID();
					
					String path = "d:\\upload";
					File uploadFile = new File(path+"\\"+uuid+"_"+fileName);
					item.write(uploadFile);
					
					
					String encodeName = uploadFile.getName();
					
					if(agent.indexOf("Trident") > -1){
						encodeName = URLEncoder.encode(uploadFile.getName(), "UTF-8");
					}
					
					//파일 다운로드 링크
					out.print("<div><a href='download.jsp?fileName="+encodeName+"'>"+fileName+"</a></div>");
					//out.print("<div><a href='download.jsp?fileName="+uploadFile.getName()+"'>"+fileName+"</a></div>");
				}
			}
		}
	}



%>
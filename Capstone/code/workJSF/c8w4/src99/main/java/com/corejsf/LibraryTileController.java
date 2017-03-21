package com.corejsf;


import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.tiles.ComponentContext;
import org.apache.struts.tiles.Controller;

public class LibraryTileController implements Controller {
   public void perform(ComponentContext tilesContext,
                       HttpServletRequest request, HttpServletResponse response,
                       ServletContext context) 
                                        throws IOException, ServletException {
      HttpSession session = request.getSession();

      String chapter = (String) request.getParameter("chapter");
      session.setAttribute("chapter", chapter == null || "".equals(chapter) ? 
                           "chapter1" : chapter);

      Library library = (Library) session.getAttribute("library");

      if(library == null) {
         library = new Library();
         session.setAttribute("library", library);
      }

      Book selectedBook = library.getSelectedBook();
      if(selectedBook != null) {
         session.setAttribute("book", selectedBook);
      }
   }
}

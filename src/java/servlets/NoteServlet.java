/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 758243
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //variables
        String title;
        String contents;
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        //Read file
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        //Assign contents of file to variables
        title = br.readLine();
        contents = br.readLine();
        //Create new note object
        Note n = new Note(title, contents);
        request.setAttribute("note", n);
        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
    }
}

package com.example.miapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrarObra")
public class RegistrarObraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los datos del formulario
        String titulo = request.getParameter("titulo");
        String descripcion = request.getParameter("descripcion");
        String precio = request.getParameter("precio");

    
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);

        // Redirigir a una página de confirmación (por ejemplo, success.jsp)
        response.sendRedirect("jsp/success.jsp");
    }
}

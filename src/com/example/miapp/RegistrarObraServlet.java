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

        // Aquí puedes añadir lógica para procesar la información, como guardarla en una base de datos

        // Mostrar los datos en la consola para verificar
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);

        // Reenviar a una página de confirmación (por ejemplo, success.jsp)
        request.getRequestDispatcher("WEB-INF/jsp/success.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Respuesta para las solicitudes GET
        response.getWriter().println("El método GET no está soportado, por favor usa POST.");
    }
}

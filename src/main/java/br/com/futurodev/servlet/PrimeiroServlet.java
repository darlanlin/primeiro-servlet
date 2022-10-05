package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class PrimeiroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        writer.println("<h3>Nosso primeiro servlet</h3>");
        writer.println("Olá " + nome + " você tem " + idade + " anos de vida");

        if (Double.parseDouble(idade) <= 12) {
            //criança
            writer.println("<h4> Você é criança! </h4>");
        } else if (Double.parseDouble(idade) >12 && Double.parseDouble(idade) <= 18) {
            //adolescente
            writer.println("<h4> Você é adolescente! </h4>");
        } else if (Double.parseDouble(idade) >18 && Double.parseDouble(idade) <= 65) {
            //adulto
            writer.println("<h4> Você é adulto! </h4>");
        } else {
            //idoso
            writer.println("<h4> Você é velho! </h4>");
        }
    }
}

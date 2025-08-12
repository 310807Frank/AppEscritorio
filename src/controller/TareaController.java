/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.TareaDAO;
import modelo.Tarea;
import java.util.List;

public class TareaController {
    private TareaDAO tareaDAO = new TareaDAO();

    public List<Tarea> obtenerTareas() {
        return tareaDAO.obtenerTodas();
    }

    public boolean añadirTarea(Tarea tarea) {
        return tareaDAO.insertar(tarea);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Tarea;
import util.ConexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TareaDAO {

    public List<Tarea> obtenerTodas() {
        List<Tarea> lista = new ArrayList<>();
        String sql = "SELECT * FROM Tareas";

        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Tarea tarea = new Tarea(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("fecha"),
                    rs.getString("descripcion"),
                    rs.getString("estado")
                );
                lista.add(tarea);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean insertar(Tarea tarea) {
        String sql = "INSERT INTO Tareas (id, nombre, fecha, descripcion, estado) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, tarea.getId());
            ps.setString(2, tarea.getNombre());
            ps.setString(3, tarea.getFecha());
            ps.setString(4, tarea.getDescripcion());
            ps.setString(5, tarea.getEstado());

            int filas = ps.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

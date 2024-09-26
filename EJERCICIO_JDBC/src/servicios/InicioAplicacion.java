package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InicioAplicacion {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/pg_cliper";
		String usuario = "postgres";
		String contraseña = "Bufalo2813.";

		try {
			// Cargar el controlador de la base de datos
			Class.forName("org.postgresql.Driver");

			// Obtener la conexión usando DriverManager
			try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
				if (conexion != null) {
					System.out.println("Conexión establecida con éxito.");
				}
			} catch (SQLException e) {
				System.err.println("Error al establecer la conexión: " + e.getMessage());
			}

		} catch (ClassNotFoundException e) {
			System.err.println("Controlador no encontrado: " + e.getMessage());
		}
	}
}
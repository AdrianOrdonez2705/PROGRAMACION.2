package laboratorioPlus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BaseDeDatos{
    public static void main(String[] args) {
        Connection conn = null;
        java.sql.Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "admin";
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            
            while(true){
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Buscar una ciudad\n2. Crear una ciudad\n3.Modificar una ciudad\n4. Eliminar una ciudad\n5.SALIR"));

                if(opcion == 1){
                    try{
                        String ciudad = JOptionPane.showInputDialog(null, "Ingrese le nombre de la ciudad");
                        String sql = "SELECT country_id FROM city WHERE city =" + ciudad;
                        rs = ((java.sql.Statement) stmt).executeQuery(sql);
                        int id = rs.getInt("country_id");
                        String sql2 = "SELECT country FROM country WHERE country_id =" + id;
                        rs = ((java.sql.Statement) stmt).executeQuery(sql2);
                        String pais = rs.getString("country");
                        JOptionPane.showMessageDialog(null,"La ciudad " + ciudad + "pertenece a " + pais);
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, "No existe la ciudad");
                    }
                }
                else{
                    if (opcion == 2){
                        try{
                            String pais = JOptionPane.showInputDialog(null, "Ingrese un pais: ");
                            String sql = "SELECT country_id FROM country WHERE country =" + pais;
                            rs = ((java.sql.Statement) stmt).executeQuery(sql);
                            int id = rs.getInt("country_id");
                            String ciudad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la ciudad: "); 
                            int id_city = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de la ciudad: "));
                            String sql2 = "INSERT INTO city VALUES ("+id_city+","+ciudad+","+ id +", SYSDATE())";
                            rs = ((java.sql.Statement) stmt).executeQuery(sql2);
                            JOptionPane.showMessageDialog(null,"Ciudad creada exitosamente");
                        } catch(Exception e){
                            JOptionPane.showMessageDialog(null, "No se pudo crear la ciudad");
                        }
                    }
                    else{
                        if (opcion == 3){
                            try{
                                String ciudad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la ciudad a modificar");
                                String sql = "SELECT city_id FROM city WHERE city =" + ciudad;
                                rs = ((java.sql.Statement) stmt).executeQuery(sql);
                                int city_id = rs.getInt("city_id");

                                String sql2 = "SELECT country_id FROM city WHERE city =" + ciudad;
                                rs = ((java.sql.Statement) stmt).executeQuery(sql2);
                                int country_id = rs.getInt("country_id");
                                String nuevoNombre = JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre de la ciudad");
                                String sql3 = "UPDATE city SET city =" + nuevoNombre + ", country_id =" + country_id + ", last_update = SYSDATE() WHERE city_id =" + city_id;
                                rs = ((java.sql.Statement) stmt).executeQuery(sql3);
                                JOptionPane.showMessageDialog(null,"Ciudad modificada con exito");
                            } catch (Exception e){
                                JOptionPane.showMessageDialog(null,"No se pudo modificar la ciudad");
                            }
                        }
                        else{
                            if (opcion == 4){
                                try{
                                    String ciudad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la ciudad a eliminar");
                                    String sql = "SELECT city_id FROM city WHERE city=" + ciudad;
                                    rs = ((java.sql.Statement) stmt).executeQuery(sql);
                                    int city_id = rs.getInt("city_id");
                                    String sql2 = "DELETE FROM city WHERE city_id=" + city_id;
                                    rs = ((java.sql.Statement) stmt).executeQuery(sql2);
                                    JOptionPane.showMessageDialog(null,"Ciudad eliminada con exito");
                                } catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"No se pudo eliminar la ciudad");
                                }
                            }
                            else{
                                if (opcion == 5){
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

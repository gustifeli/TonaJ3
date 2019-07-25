package Controlador;

import Modelos.Campana;
import Modelos.ImagenPortada;
import Modelos.Producto;
import Servlets.AddProd;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author gusti
 */
public class Data {

    public Connection connection;
    public final static String UserDb = "root";
    public final static String Passdb = "34885949";
    public final static String url = "jdbc:mysql://localhost:3306/tona?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";

    //Contectar con la base de datos.
    public void conectar() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tonaWeb", UserDb, Passdb);
        connection = DriverManager.getConnection(url, UserDb, Passdb);
    }

    //Desconectar la base de datos
    public void desconectar() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion con la base de datos");
        }
    }

    // verificar si un usuario y una contraña pertenece a un cuenta registrada
    public boolean cuentaExistente(String user, String pass) throws SQLException {
        String sql = "select * from  usuario where user='" + user + "' and pass='" + pass + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Verificar si el usuario existe
    public boolean userExistente(String user) throws SQLException {
        String sql = "Select * from usuario where user='" + user + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    public void registrarUsuario(String user, String pass) throws SQLException {
        String sql = "Insert into usuario (user, pass) Values('" + user + "','MD5" + pass + "')";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();
    }
    
    public void agregarFotoPortada(ImagenPortada ip) throws SQLException{
        try {
            conectar();
            String sql = "Insert into fotoportada(fotoportada)Values(?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            InputStream is = ip.getInputStream();
            ps.setBlob(1, is);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Data: ( "+ e + " )");
        }finally{
            desconectar();
        }
    }
    public void eliminarPortada(int cod) {
        try {
            conectar();
            Statement st = connection.createStatement();
            String sql = "delete from fotoportada where idFoto=" + cod;
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar la portada: " + e);
        } finally {
            desconectar();
        }
    }
    public ArrayList<ImagenPortada> obtenerPortada() {
        ArrayList<ImagenPortada> port = new ArrayList<>();
        try {
            conectar();
//            String sql = "Select idProducto, descripcion, imagen, idCampana from producto";
            String sql = "select idFoto, fotoPortada from fotoportada";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ImagenPortada i = new ImagenPortada();
                i.setIdFotoPortada(rs.getInt(1));
                InputStream img = rs.getBinaryStream(2);
               i.setInputStream(img);
               port.add(i);
                
            }
            rs.close();
            st.close();
            return port;
        } catch (Exception e) {
            System.out.println("Data: Error al obtener portada: " + e);
        } finally {
            desconectar();
        }
        return port;
    }
    public byte[] obtenerImagenPort(int cod) {
        byte[] imagenbyte = null;
        try {
            conectar();
            String sql = "select fotoPortada from fotoportada where idFoto=" + cod;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Blob blob = rs.getBlob("fotoPortada");
                if (blob != null) {
                    InputStream inputStream = blob.getBinaryStream();
                    int size = (int) blob.length();
                    imagenbyte = new byte[size];
                    int length = -1;
                    int k = 0;
                    try {
                        inputStream.read(imagenbyte, 0, size);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
        return imagenbyte;
    }
    


    public void AddProduct(Producto p) throws SQLException {
        try {
            conectar();
            //String sql = "Insert into producto(descripcion, imagen, idCampana) values('" + p.getDescripcion() + "','" + (p.getFoto()) + "','" + 1 + "')";
            String sql = "Insert into producto(descripcion, imagen, idCampana) values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getDescripcion());
            InputStream inputStream = p.getInputStreamFoto();
            ps.setBlob(2, inputStream);
            ps.setInt(3, p.getIdCampana());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error DATA: " + e);
        } finally {
            desconectar();
        }
    }

    public ArrayList<Producto> obtenerProducto() {
        ArrayList<Producto> prod = new ArrayList<>();
        try {
            conectar();
//            String sql = "Select idProducto, descripcion, imagen, idCampana from producto";
            String sql = "select idProducto, p.descripcion, imagen,c.idCampana, c.descripcion from producto p, campana c where p.idCampana = c.idCampana";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                InputStream img = rs.getBinaryStream(3);
                p.setInputStreamFoto(img);
                p.setIdCampana(rs.getInt(4));
                p.setCampana(rs.getString(5));
                prod.add(p);
            }
            rs.close();
            st.close();
            return prod;
        } catch (Exception e) {
            System.out.println("Data: Error al obtener los productos: " + e);
        } finally {
            desconectar();
        }
        return prod;
    }
    public ArrayList<Producto> obtenerProductoOtonoInvierno() {
        ArrayList<Producto> prod = new ArrayList<>();
        try {
            conectar();
//            String sql = "Select idProducto, descripcion, imagen, idCampana from producto";
            String sql = "select idProducto, p.descripcion, imagen,c.idCampana, c.descripcion from producto p, campana c where p.idCampana = c.idCampana and p.idCampana=1";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                InputStream img = rs.getBinaryStream(3);
                p.setInputStreamFoto(img);
                p.setIdCampana(rs.getInt(4));
                p.setCampana(rs.getString(5));
                prod.add(p);
            }
            rs.close();
            st.close();
            return prod;
        } catch (Exception e) {
            System.out.println("Data: Error al obtener los productos: " + e);
        } finally {
            desconectar();
        }
        return prod;
    }
    public ArrayList<Producto> obtenerProductoPrimaVerano() {
        ArrayList<Producto> prod = new ArrayList<>();
        try {
            conectar();
//            String sql = "Select idProducto, descripcion, imagen, idCampana from producto";
            String sql = "select idProducto, p.descripcion, imagen,c.idCampana, c.descripcion from producto p, campana c where p.idCampana = c.idCampana and p.idCampana=2";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                InputStream img = rs.getBinaryStream(3);
                p.setInputStreamFoto(img);
                p.setIdCampana(rs.getInt(4));
                p.setCampana(rs.getString(5));
                prod.add(p);
            }
            rs.close();
            st.close();
            return prod;
        } catch (Exception e) {
            System.out.println("Data: Error al obtener los productos: " + e);
        } finally {
            desconectar();
        }
        return prod;
    }

    public ArrayList<Producto> obtenerProductoCod(int cod) {
        ArrayList<Producto> prod = new ArrayList<>();
        try {
            conectar();
            String sql = "select idProducto, p.descripcion, imagen,c.idCampana, c.descripcion from producto p, campana c where p.idCampana = c.idCampana and idProducto=" + cod;
//            String sql = "Select idProducto, descripcion, imagen, idCampana from producto where idProducto=" + cod;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                InputStream img = rs.getBinaryStream(3);
                p.setInputStreamFoto(img);
                System.out.println("producto data: " + rs.getInt(4));
                p.setIdCampana(rs.getInt(4));
                p.setCampana(rs.getString(5));
                prod.add(p);
            }
            rs.close();
            st.close();
            return prod;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al obtener los productos codigo: " + e);
        } finally {
            desconectar();
        }
        return prod;
    }

    public byte[] obtenerImagenProd(int cod) {
        byte[] imagenbyte = null;
        try {
            conectar();
            String sql = "select imagen from producto where idProducto=" + cod;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Blob blob = rs.getBlob("imagen");
                if (blob != null) {
                    InputStream inputStream = blob.getBinaryStream();
                    int size = (int) blob.length();
                    imagenbyte = new byte[size];
                    int length = -1;
                    int k = 0;
                    try {
                        inputStream.read(imagenbyte, 0, size);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
        return imagenbyte;
    }
    public byte[] obtenerImagenPrimaVerano(int cod) {
        byte[] imagenbyte = null;
        try {
            conectar();
            String sql = "select imagen from producto where idCampana=2 and idProducto=" + cod;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Blob blob = rs.getBlob("imagen");
                if (blob != null) {
                    InputStream inputStream = blob.getBinaryStream();
                    int size = (int) blob.length();
                    imagenbyte = new byte[size];
                    int length = -1;
                    int k = 0;
                    try {
                        inputStream.read(imagenbyte, 0, size);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
        return imagenbyte;
    }
    public byte[] obtenerImagenOtoñoInvierno(int cod) {
        byte[] imagenbyte = null;
        try {
            conectar();
            String sql = "select imagen from producto where idCampana=1 and idProducto=" + cod;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Blob blob = rs.getBlob("imagen");
                if (blob != null) {
                    InputStream inputStream = blob.getBinaryStream();
                    int size = (int) blob.length();
                    imagenbyte = new byte[size];
                    int length = -1;
                    int k = 0;
                    try {
                        inputStream.read(imagenbyte, 0, size);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
        return imagenbyte;
    }

    public void eliminarProducto(int cod) {
        try {
            conectar();
            Statement st = connection.createStatement();
            String sql = "delete from producto where idProducto=" + cod;
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar el producto: " + e);
        } finally {
            desconectar();
        }
    }

    public void actualizarProducto(Producto p) {
        try {
            conectar();
            Statement st = connection.createStatement();
//            String sql = "Update producto set descripcion='" + p.getDescripcion() + "', idCampana=" + p.getIdCampana() + "where idProducto=" + p.getIdproducto();
            String sql = "Update producto set descripcion='" +p.getDescripcion()+ "', idCampana=" +p.getIdCampana() +  " where idProducto="+p.getIdproducto(); 
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            System.out.println("Error al actualizar los datos del producto: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public ArrayList<Campana> obtenerCampana() {
        ArrayList<Campana> camp = new ArrayList<>();
        try {
            conectar();
            String sql = "Select idCampana, descripcion from campana";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Campana c = new Campana();
                c.setIdCampana(rs.getInt(1));
                c.setCampana(rs.getString(2));
                camp.add(c);
            }
            rs.close();
            st.close();
            return camp;
        } catch (Exception e) {
            System.out.println("Error al obtener las campanas: " + e);
        } finally {
            desconectar();
        }
        return camp;
    }
}

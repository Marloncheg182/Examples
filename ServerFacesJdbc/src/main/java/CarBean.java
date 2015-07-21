import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg Romanenchuk
 */

@ManagedBean
@SessionScoped
public class CarBean implements Serializable {

    private static final long serialVersionUID = 6081417964063918994L;

    public List<Car> getCars() throws ClassNotFoundException, SQLException {

        Connection connect = null;

        String url = "jdbc:mysql://localhost:33033/examples";

        String username = "root";
        String password = "root";

        try {

            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager.getConnection(url, username, password);
            // System.out.println("Connection established"+connect);

        } catch (SQLException ex) {
            System.out.println("in exec");
            System.out.println(ex.getMessage());
        }

        List<Car> cars = new ArrayList<Car>();
        PreparedStatement pstmt = connect
                .prepareStatement("select car_id, cname, color, speed, manufactured_country from Car");
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {

            Car car = new Car();
            car.setCar_id(rs.getInt("car_id"));
            car.setCname(rs.getString("cname"));
            car.setColor(rs.getString("color"));
            car.setSpeed(rs.getInt("speed"));
            car.setManufactured_country(rs.getString("manufactured_country"));

            cars.add(car);

        }

        // close resources
        rs.close();
        pstmt.close();
        connect.close();

        return cars;

    }

}

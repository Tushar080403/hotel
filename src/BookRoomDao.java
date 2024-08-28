
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRoomDao {


   

    public static int save(String roomType, String numGuests, String checkIn, String checkOut, String customerName) {
        int status = 0;

        try {
        	Connection con=DB.getConnection();
        	PreparedStatement pstmt=con.prepareStatement("insert into bookings (room_type, num_guests, check_in, check_out, customer_name) VALUES (?, ?, ?, ?, ?)");
            pstmt.setString(1, roomType);
            pstmt.setString(2, numGuests);
            pstmt.setString(3, checkIn);
            pstmt.setString(4, checkOut);
            pstmt.setString(5, customerName);

            // Execute the query
            status = pstmt.executeUpdate();
        } catch (Exception e){System.out.println(e);}
		return status;
    }}

     
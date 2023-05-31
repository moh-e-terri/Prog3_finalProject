package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Booked_Appointment {
    private int id;
    private int user_id;
    private int appointment_id;
    private String status;  // enum('waiting', 'finished')
    private String doctor_commnet;

    public Booked_Appointment(int user_id, int appointment_id, String status, String doctor_commnet) {
        this.user_id = user_id;
        this.appointment_id = appointment_id;
        this.status = status;
        this.doctor_commnet = doctor_commnet;
    }

    public Booked_Appointment() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getAppointment_id() {
        return appointment_id;
    }
    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDoctor_commnet() {
        return doctor_commnet;
    }
    public void setDoctor_commnet(String doctor_commnet) {
        this.doctor_commnet = doctor_commnet;
    }
    
    //Create: create a new Booked_Appointment in Booked_Appointments table
    public int save() throws SQLException, ClassNotFoundException {
        Connection c = DbConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        int recordCounter = 0;
        String sqlQuery = "INSERT INTO booked_appointments (id, user_id, appointment_id,"
                + " status, doctor_comment) VALUES (?, ?, ?, ?, ?)";
        ps = c.prepareStatement(sqlQuery);
        
        ps.setInt(1, this.getId());
        ps.setInt(2, this.getUser_id());
        ps.setInt(3, this.getAppointment_id());
        ps.setString(4, this.getStatus());
        ps.setString(5, this.getDoctor_commnet());
        
        recordCounter = ps.executeUpdate();
        if (recordCounter > 0) {
            System.out.println("Appointment id=" + this.getId() + " was added successfully!");
        }
        if (ps != null) {
            ps.close();
        }
        c.close();
        return recordCounter;
    }
    
    //Read (Booked_Appointments): get all Booked-Appointments from Appointments table
    public static ArrayList<Booked_Appointment> getAllBookedAppointments() throws SQLException, ClassNotFoundException {
        Connection c = DbConnection.getInstance().getConnection();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Booked_Appointment> booked_Appointments = new ArrayList<>();
        
        String sqlQuery = "SELECT * FROM booked_appointments";
        ps = c.prepareStatement(sqlQuery);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Booked_Appointment bookedAppointment = new Booked_Appointment(rs.getInt(2), rs.getInt(3),
                    rs.getString(4), rs.getString(5));
            bookedAppointment.setId(rs.getInt(1));
            booked_Appointments.add(bookedAppointment);
        }
        if (ps != null) {
            ps.close();
        }
        c.close();  
        return booked_Appointments;
    }
}

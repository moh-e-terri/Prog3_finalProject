package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Appointment {

    private int id;
    private String appointment_date;
    private String appointment_day;
    private String appointment_time;
    private String status;  // enum('free', 'booked')

    public Appointment(String appointment_date, String appointment_day,
            String appointment_time, String status) {
        this.appointment_date = appointment_date;
        this.appointment_day = appointment_day;
        this.appointment_time = appointment_time;
        this.status = status;
    }

    public Appointment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_day() {
        return appointment_day;
    }

    public void setAppointment_day(String appointment_day) {
        this.appointment_day = appointment_day;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    //CRUD: Crate , Updata , Delete , Read
    
    //Create: create a new Appointment in Appointments table
    public int save() throws SQLException, ClassNotFoundException {
        Connection c = DbConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        int recordCounter = 0;
        String sqlQuery = "INSERT INTO appointments (id, appointment_date, appointment_day,"
                + " appointment_time, status) VALUES (?, ?, ?, ?, ?)";
        ps = c.prepareStatement(sqlQuery);
        
        ps.setInt(1, this.getId());
        ps.setString(2, this.getAppointment_date());
        ps.setString(3, this.getAppointment_day());
        ps.setString(4, this.getAppointment_time());
        ps.setString(5, this.getStatus());
        
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

    //Read (Appointments): get all Appointments from Appointments table
    public static ArrayList<Appointment> getAllAppointments() throws SQLException, ClassNotFoundException {
        Connection c = DbConnection.getInstance().getConnection();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        String sqlQuery = "SELECT * FROM appointments";
        ps = c.prepareStatement(sqlQuery);
        rs = ps.executeQuery();
        while (rs.next()) {
            Appointment appointment = new Appointment(rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5));
            appointment.setId(rs.getInt(1));
            appointments.add(appointment);
        }
        if (ps != null) {
            ps.close();
        }
        c.close();  
        return appointments;
    }
    
    //Update: update an existing Appointment in Appointments table 
    public int update() throws SQLException, ClassNotFoundException{
        Connection c = DbConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        int recordCounter =0;
        String sqlQuery = "UPDATE appointments SET appointment_date=?, appointment_day=?, appointment_time=?,"
                + " status=? WHERE id=?";
        ps = c.prepareStatement(sqlQuery);
        
        ps.setString(1,this.getAppointment_date());
        ps.setString(2, this.getAppointment_day());
        ps.setString(3, this.getAppointment_time());
        ps.setString(4, this.getStatus());
        ps.setInt(5, this.getId());
        recordCounter = ps.executeUpdate();
        
        if (recordCounter > 0) {
            System.out.println("Appointment with id : "+this.getId()+" was updated successfully!");
        }
        if (ps != null){
            ps.close();
        }
        c.close();
        return recordCounter;  
    }
}

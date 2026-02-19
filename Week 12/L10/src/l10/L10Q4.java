package l10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

interface Searchable {
    public abstract boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime);
}

class Appointment implements Searchable {
    private int day;
    private int month;
    private int year;
    private int startTime;
    private int endTime;
    private LocalDateTime dateStartTime;
    private LocalDateTime dateEndTime;
    private final String filePath = "appointment.txt";
    
    public Appointment (int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
        createDateStartTime();
        createDateEndTime();
    }
    
    public void createDateStartTime(){
        this.dateStartTime = LocalDateTime.of(year, month, day, startTime, 0);
    }
    
    public void createDateEndTime(){
        this.dateEndTime = LocalDateTime.of(year, month, day, endTime, 0);
    }

    public void saveAppointment() {
        try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) {
            out.println(day + "/" + month + "/" + year + "," + startTime + ":" + endTime);
            System.out.println("Appointment saved.");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
    
    public boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime){
        return dateStartTime.isAfter(this.dateEndTime) || dateEndTime.isBefore(this.dateStartTime) 
                || dateStartTime.isEqual(this.dateEndTime) || dateEndTime.isEqual(this.dateStartTime);
    }
    
    @Override
    public String toString() {
        return day + "/" + month + "/" + year + "," + startTime + ":" + endTime;
    }
}

public class L10Q4 {
    static List<Appointment> appointments = new ArrayList<>();
    
    public static void loadAppointment() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("appointment.txt"));
            String line = "";
            
            while ((line = in.readLine()) != null) {
                String[] lineSplit = line.split(",");
                String[] dateSplit = lineSplit[0].split("/");
                String[] timeSplit = lineSplit[1].split(":");
                appointments.add(new Appointment(
                        Integer.parseInt(dateSplit[0]), 
                        Integer.parseInt(dateSplit[1]), 
                        Integer.parseInt(dateSplit[2]), 
                        Integer.parseInt(timeSplit[0]), 
                        Integer.parseInt(timeSplit[1]))
                );
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
        
    public static boolean appointmentChecker(LocalDateTime dateStartTime, LocalDateTime dateEndTime) {
        for (Appointment a : appointments) {
            if (!a.search(dateStartTime, dateEndTime)) {
                return false;
            }
        }
        return true;
    }
    
    public static void makeAppointment(int day, int month, int year, int startTime, int endTime) {
        LocalDateTime dateStartTime = LocalDateTime.of(year, month, day, startTime, 0);
        LocalDateTime dateEndTime = LocalDateTime.of(year, month, day, endTime, 0);
        
        if (appointmentChecker(dateStartTime, dateEndTime)){
            Appointment newAppointment = new Appointment(day, month, year, startTime, endTime);
            appointments.add(newAppointment);
            newAppointment.saveAppointment();
            System.out.println("Appointment booked successfully : " + newAppointment.toString());
        } else{
            System.out.println("No slot for this appointment");

        }
        
    }
    
    public static void display() {
        for (Appointment a : appointments) {
            System.out.println(a.toString());
        }
    }
    
    public static void main(String[] args) {
        loadAppointment();
        display();
        makeAppointment(2,1,2025,11,12);
        makeAppointment(5,1,2025,12,14);
        makeAppointment(4,1,2025,8,10);
    }    
}

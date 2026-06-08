package advanced.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

class Patient{
    private String name;
    private String phoneNumber;
    private String patientId;
    private String emailId;

    public Patient(String name, String phoneNumber, String patientId, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.patientId = patientId;
        this.emailId = emailId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", patientId='" + patientId + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
class DoctorTokenSystem{
    private Queue<Patient> queue=new LinkedList<>();
    private Patient currentPatient = null;

    // Add patient to queue
    public void addPatient(Patient patient) {
        queue.offer(patient);
        System.out.println("Token Generated for: " + patient.getName());
    }
    // Call next patient
    public void callNextPatient() {
        if (queue.isEmpty()) {
            currentPatient = null;
            System.out.println("No patients in queue.");
            return;
        }
        currentPatient = queue.poll();
        System.out.println("Now Serving: " + currentPatient.getName());
    }
    // Show current patient
    public void showCurrentPatient() {
        if (currentPatient == null) {
            System.out.println("No active patient.");
        } else {
            System.out.println("Current Active Patient: " + currentPatient);
        }
    }
    // Show next patient
    public void showNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("No next patient.");
        } else {
            System.out.println("Next Patient: " + queue.peek());
        }
    }

}
public class TiketTokenSystem {
    public static void main(String[] args) {
        DoctorTokenSystem system = new DoctorTokenSystem();
        system.addPatient(new Patient("P101","Ananya","9876543210","a@mail.com"));
        system.addPatient(new Patient("P102","Rahul","9123456780","r@mail.com"));
        system.addPatient(new Patient("P103","Sneha","9988776655","s@mail.com"));
        system.callNextPatient();     // Serve first
        system.showCurrentPatient();  // Show current
        system.showNextPatient();     // Show next
    }
}

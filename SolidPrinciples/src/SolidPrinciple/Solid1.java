package SolidPrinciple;

import java.time.LocalDateTime;

class Reminder {
	int id ;
	String reminder ;
	LocalDateTime time ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
}

// single responsiblility principle - component should have single responsibility and should do one thing
// it should have only one reason to change 

public class Solid1 {
	public static void main(String[] args) {
		
	}
}

package assem;

 
	class Student {
	    private int studentId;
	    private String name;
	    private double[] marks;
	    private char grade;
	    
	    public Student(int studentId, String name, double[] marks) {
	        this.studentId = studentId;
	        this.name = name;
	        this.marks = marks;
	        calculateGrade();
	    }
	    
	    public int getStudentId() {
	        return studentId;
	    }
	    
	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double[] getMarks() {
	        return marks;
	    }
	    
	    public void setMarks(double[] marks) {
	        this.marks = marks;
	    }
	    
	    public char getGrade() {
	        return grade;
	    }
	    
	    private void calculateGrade() {
	        double totalMarks = 0;
	        for (double mark : marks) {
	            totalMarks += mark;
	        }
	        double averageMarks = totalMarks / marks.length;
	        
	        if (averageMarks >= 90) {
	            grade = 'A';
	        } else if (averageMarks >= 80) {
	            grade = 'B';
	        } else if (averageMarks >= 70) {
	            grade = 'C';
	        } else if (averageMarks >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	    }
	    
	    @Override
	    public String toString() {
	        return "Student ID: " + studentId +
	               ", Name: " + name +
	               ", Total Marks: " + getTotalMarks() +
	               ", Average Marks: " + getAverageMarks() +
	               ", Grade: " + grade;
	    }
	    
	    private double getTotalMarks() {
	        double total = 0;
	        for (double mark : marks) {
	            total += mark;
	        }
	        return total;
	    }
	    
	    private double getAverageMarks() {
	        double total = getTotalMarks();
	        return total / marks.length;
	    }
	}




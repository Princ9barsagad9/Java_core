import java.math.BigDecimal;

public class StudentRunner{
    public static void main(String[] args) {
        int[] marks={80, 90, 100,70};
        Student student=new Student("prince",marks);

        int number=student.getNumberOfMarks();
        System.out.println("no of marks: "+number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: "+sum);
        int maximumMark=student.getMaximumMark();
        System.out.println("maximum marks: "+maximumMark);
        int minimumMark=student.getMinimumMark();
        System.out.println("minimum marks: "+minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average marks: "+average  );
    }
}
